package jalau.at18.katas.pokerhands.maria;

public interface PokerHandIdentifier {
    boolean identify(PokerHand hand);
    PokerHandRank getRank(PokerHand hand);

}
