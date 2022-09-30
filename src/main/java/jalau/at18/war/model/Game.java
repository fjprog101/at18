package jalau.at18.war.model;

import java.util.ArrayList;
import java.util.List;

public class Game {

    public static final Game INSTANCE = new Game();

    private List<Player> players;

    private Game() {
        players = new ArrayList<Player>();
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }
}
