package jalau.at18.katas.pokerhands.rodrigov;

public class TwoPairsIdentifier extends Identifier{
    PokerHandAnalizer analizer;
    public TwoPairsIdentifier(){
        analizer = new PokerHandAnalizer();
    }
    @Override
    boolean identify(PokerHand hand) {
        TwoPairs twoPairs = new TwoPairs();
        return analizer.analize(hand, twoPairs);
    }

    @Override
    Rank identifyRank() {
        return Rank.TWOPAIRS;
    }
    
}
