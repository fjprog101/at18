package jalau.at18.katas.pokerhands.daniela;

public class Twopairidentifier {
    private PokerHandAnalizer analizer;
    private boolean value11;
    private boolean value12;
    private boolean value13;

    public Twopairidentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand, CardValue cardValue1, CardValue cardValue2, CardValue cardValue3) {
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        value11 = count.get(cardValue1) == 2 ? true : false;
        value12 = count.get(cardValue2) == 2 ? true : false;
        value13 = count.get(cardValue3) == 1 ? true : false;
        return value11 == value12 == value13;
    }

}
