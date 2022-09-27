package jalau.at18.war.model;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Player> players;

    public Game() {
        players = new ArrayList<Player>();
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }
}
