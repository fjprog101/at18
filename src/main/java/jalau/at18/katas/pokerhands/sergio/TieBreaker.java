package jalau.at18.katas.pokerhands.sergio;

public class TieBreaker {
    private HighestCard highestCard = new HighestCard();

    public boolean tieBraker(PokerHand hand1, PokerHand hand2) {
        // if the method return true hand1 win, if return false hand2 win
        return (highestCard.highestCardIdentifier(hand1) < highestCard.highestCardIdentifier(hand2));
    }

}
