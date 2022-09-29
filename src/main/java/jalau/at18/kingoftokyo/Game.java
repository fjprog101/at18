package jalau.at18.kingoftokyo;

import jalau.at18.kingoftokyo.model.Player;
import java.util.ArrayList;

public class Game {
    private static Game instance;
    private int players;
    private ArrayList<Player> playersList;

    private Game() {
        this.players = -1;
        this.playersList = new ArrayList<>();
    }

    public void setPlayers(int number) {
        this.players = number;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayersList(ArrayList<Player> list) {
        this.playersList = list;
    }

    public ArrayList<Player> getPlayersList() {
        return playersList;
    }

    public  static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

}
