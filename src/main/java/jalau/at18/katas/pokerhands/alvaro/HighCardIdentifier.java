package jalau.at18.katas.pokerhands.alvaro;

public class HighCardIdentifier extends Identifiers {
    private PokerHandAnalizer analizer;
    private static final int COUNTER = 3;
    private static final int FOUR = 4;
    private AllSameSuit sameSuit;
    private ConsecutiveValues consVal;
    private FullHouse fullHouse;
    public HighCardIdentifier() {
        this.analizer = new PokerHandAnalizer();
        this.sameSuit = new AllSameSuit();
        this.consVal =  new ConsecutiveValues();
        this.fullHouse = new FullHouse();
    }
    @Override
    public boolean identify(PokerHand highCard) {
        Pair pair = new Pair();
        TwoPair twoPair = new TwoPair();
        ThreeOfAKind threeAKind = new ThreeOfAKind(COUNTER);
        FourOfAKind fourKind = new FourOfAKind(FOUR);
        boolean secondCond = !analizer.analize(highCard, twoPair) && !analizer.analize(highCard, fourKind) && !analizer.analize(highCard, fullHouse);
        boolean condition = !analizer.analize(highCard, sameSuit) && !analizer.analize(highCard, consVal);
        return !analizer.analize(highCard, pair) && condition && !analizer.analize(highCard, threeAKind) && secondCond;
    }

}
