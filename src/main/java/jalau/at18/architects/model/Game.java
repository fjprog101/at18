package jalau.at18.architects.model;

import java.util.ArrayList;
import java.util.List;

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
    }
    public static Game getInstance() {
        return GameHolder.instance;
    }
    public void initGame(int numberOfPlayers) {
        randomWonder = new RandomWonder();
        conflictBar = new ConflictBar(numberOfPlayers);
        players = new ArrayList<Player>();
        for (int index = 1; index <= numberOfPlayers; index++) {
            players.add(new Player("Player " + index, randomWonder.getRamdomWonder()));
        }
    }
    public ConflictBar getConflictBar() {
        return conflictBar;
    }

    public List<Player> getPlayers() {
        return players;
    }
}
