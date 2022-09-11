package jalau.at18.katas.pokerhands.sergio;

public class DetermineWinnner {

    private ScoreHandIdentifier scoreHandIdentifier = new ScoreHandIdentifier();

    public int handScore(PokerHand hand) {
        return scoreHandIdentifier.getScore(hand);
    }

}
