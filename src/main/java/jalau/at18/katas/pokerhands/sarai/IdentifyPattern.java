package jalau.at18.katas.pokerhands.sarai;

import java.util.ArrayList;
import java.util.List;

public class IdentifyPattern {

    private int position;
    public int getidentifyPatterns(PokerHand hand) {

        List<Boolean> patterns = new ArrayList<Boolean>();

        patterns.add(new FourOfaKindIdentify().identifyFourOfaKind(hand)); // 0 1 2 3 4 5 6 7
        patterns.add(new FullHouseIdentify().identifyFullHouse(hand));
        patterns.add(new Flush().identify(hand));
        patterns.add(new Straight().identify(hand));
        patterns.add(new ThreePairsIdentify().identifyThreePairs(hand));
        patterns.add(new TwoPairsIdentify().identifyTwoPairs(hand));
        patterns.add(new PairsIdentify().identifyPairs(hand));
        patterns.add(new HighCardsIdentify().identifyhighcard(hand));
        findThePosition(patterns);

        return position;
    }
    public void findThePosition(List<Boolean> patterns) {
        for (int index = 0; index < patterns.size(); index++) {
            if (patterns.get(index)) {
                position = index;
            }
        }
    }

}
