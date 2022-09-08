package jalau.at18.katas.pokerhands.maria;

import jalau.at18.katas.pokerhands.maria.Identifier.*;

import java.util.ArrayList;
import java.util.List;

public class TypesPokerHandIdentifier {
    public List<PokerHandIdentifier> typesPokerHandIdentifier() {
        List<PokerHandIdentifier> typesPokerHandIdentifier = new ArrayList<PokerHandIdentifier>();

        typesPokerHandIdentifier.add(new StraightFlushIdentifier());
        typesPokerHandIdentifier.add(new FourKindIdentifier());
        typesPokerHandIdentifier.add(new FullHouseIdentifier());
        typesPokerHandIdentifier.add(new FlushIdentifier());
        typesPokerHandIdentifier.add(new StraightIdentifier());
        typesPokerHandIdentifier.add(new ThreeKindIdentifier());
        typesPokerHandIdentifier.add(new TwoPairsIdentifier());
        typesPokerHandIdentifier.add(new PairIdentifier());
        typesPokerHandIdentifier.add(new HighCardIdentifier());
        return typesPokerHandIdentifier;
    }
}
