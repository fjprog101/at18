package jalau.at18.katas.pokerhands.maria;

public class HighCardIdentifier implements PokerHandIdentifier {
    @Override
    public boolean identify(PokerHand hand) {
        return true;
    }

    @Override
    public PokerHandRank getRank(PokerHand hand) {
        return null;
    }


}
