package jalau.at18.katas.pokerhands.sarai;

public class FullHouseIdentify extends Cardhigth {
    public FullHouseIdentify() {

    }
    @Override
    public Higth getidentifyOperation() {
        return Higth.FULLHOUSE;
    }
    public boolean identifyFullHouse(PokerHand hand) {
        FullHouse fullHousecards = new FullHouse();
        return fullHousecards.match(hand);
    }
}
