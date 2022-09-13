package jalau.at18.kingoftokyo;

public class CompleteCard extends Card {

    DiscardCards card;

    public CompleteCard(DiscardCards card) {
        super(card.name(), card.getCost());
        this.card = card;
    }

    @Override
    String setDescription() {
        description = "LifePoints " + card.getEffect()[0] + "Score " + card.getEffect()[1] + "Energy "
                + card.getEffect()[2];
        return description;
    }

}
