package jalau.at18.kingoftokyo;

import java.util.ArrayList;

public class Game {
    private int players;
    private ArrayList<Player> playersList;

    public Game() {
        this.players = -1;
        this.playersList = new ArrayList<>();
    }

    public void setPlayers(int number) {
        this.players = number;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayersList(ArrayList<Player> playersList) {
        this.playersList = playersList;
    }

}
