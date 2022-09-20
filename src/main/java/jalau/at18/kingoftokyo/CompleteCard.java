package jalau.at18.kingoftokyo;

public class CompleteCard extends Card {
    private DiscardCards card;
    private static final int ENERGY_INDEX = 3;

    public CompleteCard(DiscardCards card) {
        super(card.name(), card.getCost());
        this.card = card;
    }

    @Override
    String getDescription() {
        description = "Healing: " + card.getEffect()[0] + ", Damage: " + card.getEffect()[1]
                + ", Score: " + card.getEffect()[2] + ", Energy: " + card.getEffect()[ENERGY_INDEX];
        return description;
    }

    public DiscardCards getCard() {
        return card;
    }
}
