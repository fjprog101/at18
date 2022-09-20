package jalau.at18.kingoftokyo;

public class CompleteCard extends Card {
    private DiscardCards card;
    private static final int ENERGY_INDEX = 3;

    public CompleteCard(DiscardCards card) {
        super(card.name(), card.getCost(), card.getImagePath());
        this.card = card;
        setDescription();
    }

    void setDescription() {
        description = "Healing: " + card.getEffect()[0] + ", Damage: " + card.getEffect()[1]
                + ", Score: " + card.getEffect()[2] + ", Energy: " + card.getEffect()[ENERGY_INDEX];
    }

    public DiscardCards getCard() {
        return card;
    }
}
