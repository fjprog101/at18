package jalau.at18.katas.pokerhands.sergio;

public class HighestCard {
    private int highestCard;

    public int highestCardIdentifier(PokerHand hand) {
        highestCard = hand.getCards()[hand.getCards().length - 1].getValue().ordinal();
        return highestCard;
    }

}
