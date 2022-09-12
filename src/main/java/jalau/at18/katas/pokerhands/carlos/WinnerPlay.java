package jalau.at18.katas.pokerhands.carlos;

public class WinnerPlay {

    private PlaysComparer playsHand = new PlaysComparer();
    public int handScore(PokerHand hand) {
        return playsHand.getScore(hand);
    }
}
