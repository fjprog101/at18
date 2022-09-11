package jalau.at18.katas.pokerhands.rodrigov;

public class ThreeOfAKindIdentifier extends Identifier{
    PokerHandAnalizer analizer;
    public ThreeOfAKindIdentifier(){
        analizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand){
        ThreeOfAKind threeOfAKind = new ThreeOfAKind();
        return analizer.analize(hand, threeOfAKind);
    }

    @Override
    Rank identifyRank() {
        return Rank.THREEOFAKIND;
    }
}
