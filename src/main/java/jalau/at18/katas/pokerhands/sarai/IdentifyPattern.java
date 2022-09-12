package jalau.at18.katas.pokerhands.sarai;

import java.util.ArrayList;
import java.util.List;

public class IdentifyPattern {

    private int in;
    public int getidentifyPatterns(PokerHand hand) {

        List<Boolean> patterns = new ArrayList<Boolean>();

        patterns.add(new Flush().identify(hand));
        patterns.add(new Straight().identify(hand));
        patterns.add(new FullHouseIdentify().identifyFullHouse(hand));
        patterns.add(new PairsIdentify().identifyPairs(hand));
        patterns.add(new TwoPairsIdentify().identifyTwoPairs(hand)); // 40  true
        patterns.add(new ThreePairsIdentify().identifyThreePairs(hand));
        patterns.add(new FourOfaKindIdentify().identifyFourOfaKind(hand));
        patterns.add(new HightCardsIdentify().identifyhigthcard(hand));

        for (int index = 0; index < patterns.size(); index++) {
            if (patterns.get(index)) {
                in = index;
            }
        }
        return in;
    }


}
