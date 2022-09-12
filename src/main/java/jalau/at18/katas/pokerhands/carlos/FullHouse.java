package jalau.at18.katas.pokerhands.carlos;

public class FullHouse extends CardsPattern {
    public static final int indexCard = 3;
    private PokerHandAnalizer analizer;
    public FullHouse() {
        this.analizer = new PokerHandAnalizer();
    }
    @Override
    boolean match(PokerHand hand) {
        ThreeOfAKind threeCards = new ThreeOfAKind();
        Pairs pairs = new Pairs();
        return (threeCards.match(hand) && pairs.match(hand) && (hand.getCards()[0].getValue() != hand.getCards()[indexCard].getValue()));
    }

}
