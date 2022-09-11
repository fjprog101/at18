package jalau.at18.katas.pokerhands.rodrigov;

public class HighCardIndetifier extends Identifier{
    PokerHandAnalizer analizer;

    public HighCardIndetifier(){
        analizer = new PokerHandAnalizer();
    }

    @Override
    boolean identify(PokerHand hand) {
        HighCard highCard = new HighCard();
        return analizer.analize(hand, highCard);
    }

    @Override
    Rank identifyRank() {
        return Rank.HIGHCARD;
    }
}

