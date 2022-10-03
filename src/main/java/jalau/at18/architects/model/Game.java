package jalau.at18.architects.model;

import java.util.LinkedList;
import java.util.List;

import jalau.at18.architects.model.cards.Card;
import jalau.at18.architects.model.cards.MilitaryStrengthCounter;
import jalau.at18.architects.model.cards.RedCard;
import jalau.at18.architects.model.player.Playcard;
import jalau.at18.architects.model.player.Player;
import jalau.at18.architects.model.wonders.RandomWonder;

public class Game {
    private RandomWonder randomWonder;
    private ConflictBar conflictBar;
    private List<Player> players;

    private static class GameHolder {
        protected static Game instance = new Game();
    }

    private Game() {
        randomWonder = new RandomWonder();
        players = new LinkedList<Player>();
    }
    public static Game getInstance() {
        return GameHolder.instance;
    }
    public void initGame(int numberOfPlayers, List<String> names) {
        conflictBar = new ConflictBar(numberOfPlayers);
        for (int index = 0; index < numberOfPlayers; index++) {
            players.add(new Player(names.get(index), randomWonder.getRamdomWonder()));
        }
    }
    public void reset() {
        randomWonder = new RandomWonder();
        players.removeAll(players);
    }
    public void addCardtoPlayer(Card card, Player playerIn) {
        for (Player player : players) {
            if (player.getName() == playerIn.getName()) {
                addCard(card, player);
                break;
            }
        }
    }
    private void addCard(Card card, Player playerIn) {
        switch (card.color()) {
            case "Red":
                playerIn.addNewCard(card);
                RedCard redCard = (RedCard) card;
                addHornsToConflictBar(redCard.getHorns());
                break;
            default:
                playerIn.addNewCard(card);
                break;
        }
    }
    public Player getPlayer() {
        Player playerTurn = players.remove(0);
        players.add(playerTurn);
        return playerTurn;
    }
    private void addHornsToConflictBar(int horns) {
        conflictBar.addWarCalls(horns);
        if (conflictBar.getConflict()) {
            callWar();
        }
    }
    private void callWar() {
        int position = 0;
        int max = 0;
        int ite = 0;
        for (Player player : players) {
            MilitaryStrengthCounter military = player.getPlaycard().getMilitarySection();
            if (military.getMilitaryStrength() > max) {
                max = military.getMilitaryStrength();
                position = ite;
            }
            military.resetTemporalShields();
            updatePlayer(ite, military);
            ite++;
        }
        updatePlayerWinner(position, max);
    }

    private void updatePlayer(int ite, MilitaryStrengthCounter militaryStrengthCounter) {
        Player player = players.get(ite);
        Playcard playcard = player.getPlaycard();
        playcard.setMilitarySection(militaryStrengthCounter);
        player.setPlaycard(playcard);
        players.set(ite, player);
    }

    private void updatePlayerWinner(int position, int max) {
        Player player = players.get(position);
        Playcard playcard = player.getPlaycard();
        playcard.addPointToWarWinner(max);
        player.setPlaycard(playcard);
        players.set(position, player);
    }
    public ConflictBar getConflictBar() {
        return conflictBar;
    }
    public List<Player> getPlayers() {
        return players;
    }
}
