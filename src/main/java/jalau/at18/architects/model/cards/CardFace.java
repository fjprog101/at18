package jalau.at18.architects.model.cards;

public enum CardFace {
    WATER_GRAY("cwater.png", new GrayCard(Resource.WATER)),
    WOOD_GRAY("cwood.png", new GrayCard(Resource.WOOD)),
    STONE_GRAY("cstone.png", new GrayCard(Resource.STONE)),
    PAPER_GRAY("cpaper.png", new GrayCard(Resource.PAPER)),
    BRICK_GRAY("cbrick.png", new GrayCard(Resource.BRICK)),
    CAT_WITH_BLUE("cbluecat.png", new BlueCard(true, 2)),
    CAT_WITHOUT_BLUE("cblue.png", new BlueCard(false, 3)),
    RED_SHIELD("cwar1.png", new RedCard(0, MilitarySymbol.PERMANENT)),
    RED_1_HORN("cwar2.png", new RedCard(1, MilitarySymbol.ONE_HORN)),
    RED_2_HORN("cwar3.png", new RedCard(2, MilitarySymbol.TWO_HORN)),
    COMPASS_GREEN("ccompass.png", new GreenCard(ScientificSymbol.COMPASS)),
    SCREW_GREEN("cscrew.png", new GreenCard(ScientificSymbol.SCREW)),
    OLDTABLE_GREEN("ctable.png", new GreenCard(ScientificSymbol.OLDTABLE)),
    YELLOW("cgold.png", new YellowCard());

    private String nameOfFile;
    private Card card;
    CardFace(String name, Card card) {
        nameOfFile = name;
        this.card = card;
    }

    public String getNameOfFile() {
        return nameOfFile;
    }

    public Card getCard() {
        return card;
    }
}
