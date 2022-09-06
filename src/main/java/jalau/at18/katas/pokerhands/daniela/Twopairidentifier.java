package jalau.at18.katas.pokerhands.daniela;

public class Twopairidentifier {
    private boolean statuspairone;
    private boolean statuspairtwo;

    public Twopairidentifier() {

    }

    public boolean identify(PokerHand hand, CardValue cardValue1, CardValue cardValue2) {
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        statuspairone = count.get(cardValue1) == 2 ? true : false;
        statuspairtwo = count.get(cardValue2) == 2 ? true : false;
        return statuspairone == statuspairtwo;
    }

}
