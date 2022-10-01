package jalau.at18.architects.model;

import java.util.LinkedList;
import java.util.List;

import jalau.at18.architects.model.cards.Card;
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
                player.addNewCard(card);
                break;
            }
        }
    }
    public Player getPlayer() {
        Player playerTurn = players.remove(0);
        players.add(playerTurn);
        return playerTurn;
    }
    public void addHornsToConflictBar(int horns) {
        conflictBar.addWarCalls(horns);
    }
    public ConflictBar getConflictBar() {
        return conflictBar;
    }
    public List<Player> getPlayers() {
        return players;
    }
}
