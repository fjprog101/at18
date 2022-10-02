package jalau.at18.kingoftokyo.model;

import java.util.ArrayList;

public class Turn {
    private int turn;
    private ArrayList<Player> playersSequence;

    public Turn(ArrayList<Player> playersSequence) {
        this.playersSequence = playersSequence;
        turn = 0;
    }

    public Player getPlayerWithTheTurn() {
        return playersSequence.get(turn);
    }

    public ArrayList<Player> getPlayersList() {
        return playersSequence;
    }

    public void changePlayerWithTheTurn() {
        if (turn == playersSequence.size() - 1) {
            turn = 0;
        } else {
            turn++;
        }
    }

    public void removePlayer(Player player) {
        playersSequence.remove(player);
        if (turn == playersSequence.size()) {
            turn = -1;
        } else {
            turn--;
        }
    }
}
