package jalau.at18.kingoftokyo;

public class Turn {
    private Player[] playersSequence;
    private int turn;

    public Turn(Player[] playersSequence) {
        this.playersSequence = playersSequence;
        turn = 0;
    }

    public Player getPlayerWithTheTurn() {
        return playersSequence[turn];
    }

    public void changePlayerWithTheTurn() {
        if (turn == playersSequence.length - 1) {
            turn = 0;
        } else {
            turn++;
        }
    }
}
