package jalau.at18.katas.pokerhands.sarai;

public class HightCardsIdentify extends Cardhigth {
    public HightCardsIdentify() {
    }
    @Override
    public Patterns getidentifyOperation() {
        return Patterns.HIGHTCARDS;
    }
    public boolean identifyhigthcard(PokerHand hand) {
        HightCards higthcards = new HightCards();
        return higthcards.match(hand);
    }
}
