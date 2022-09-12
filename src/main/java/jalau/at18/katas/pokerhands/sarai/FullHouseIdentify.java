package jalau.at18.katas.pokerhands.sarai;

public class FullHouseIdentify {
    public FullHouseIdentify() {

    }
    public boolean identifyFullHouse(PokerHand hand) {
        FullHouse fullHousecards = new FullHouse();
        return fullHousecards.match(hand);
    }
}
