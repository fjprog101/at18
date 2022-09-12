package jalau.at18.katas.pokerhands.sarai;

public class FullHouseIdentify extends Cardhigth {
    public FullHouseIdentify() {

    }
    @Override
    public Patterns getidentifyOperation() {
        return Patterns.FULLHOUSE;
    }
    public boolean identifyFullHouse(PokerHand hand) {
        FullHouse fullHousecards = new FullHouse();
        return fullHousecards.match(hand);
    }
}
