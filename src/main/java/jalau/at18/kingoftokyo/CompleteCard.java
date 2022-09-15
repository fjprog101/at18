package jalau.at18.kingoftokyo;

public class CompleteCard extends Card {
    private DiscardCards card;

    public CompleteCard(DiscardCards card) {
        super(card.name());
        this.card = card;
    }

    @Override
    String getDescription() {
        description = "LifePoints: " + card.getEffect()[0] + ", Score: " + card.getEffect()[1] + ", Energy: "
                + card.getEffect()[2];
        return description;
    }

    public DiscardCards getCard() {
        return card;
    }
}
