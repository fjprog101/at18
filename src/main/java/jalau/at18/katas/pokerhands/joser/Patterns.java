package jalau.at18.katas.pokerhands.joser;

import java.util.ArrayList;
import java.util.List;

public class Patterns {
    private int inpos;

    public int whatPatternIs(PokerHand hand) {

        List<Boolean> patterns = new ArrayList<Boolean>();

        /* 0 */ patterns.add(new StraightFlushIdentifier().identify(hand));
        /* 1 */ patterns.add(new FourKind().identify(hand));
        /* 2 */ patterns.add(new FullHouse().identify(hand));
        /* 3 */ patterns.add(new Flush().identify(hand));
        /* 4 */ patterns.add(new Straight().identify(hand));
        /* 5 */ patterns.add(new ThreeKind().identify(hand));
        /* 6 */ patterns.add(new TwoPairs().identify(hand));
        /* 7 */ patterns.add(new Pair().identify(hand));
        /* 8 */ patterns.add(new High().identify(hand));

        for (int index = 0; index < patterns.size(); index++) {
            if (patterns.get(index)) {
                this.inpos = index;
                break;
            }
        }
        return this.inpos;

    }
}
