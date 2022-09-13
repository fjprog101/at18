package jalau.at18.kingoftokyo;

public class CompleteCard extends Card {

    private DiscardCards card;

    public CompleteCard(DiscardCards card) {
        super(card.name(), card.getCost());
        this.card = card;
    }

    @Override
    String setDescription() {
        String description = "LifePoints " + card.getEffect()[0] + "Score " + card.getEffect()[1] + "Energy "
                + card.getEffect()[2];
        return description;
    }

}
