package jalau.at18.architects.model.cards;

enum EnumResourceList {
    WATER(new GrayCard(Resource.WATER), 1),
    WOOD(new GrayCard(Resource.WOOD), 2),
    STONE(new GrayCard(Resource.STONE), 3),
    PAPER(new GrayCard(Resource.PAPER), 4),
    BRICK(new GrayCard(Resource.BRICK), 5),
    GOLD(new YellowCard(), 6);

    private Card card;
    private int numberResource;

    EnumResourceList(Card card, int numberResource) {
        this.card = card;
        this.numberResource = numberResource;
    }

    public Card getCard() {
        return card;
    }

    public int getNumberResource() {
        return numberResource;
    }
}
