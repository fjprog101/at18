package jalau.at18.architects.model;

public enum CardFace {
    PAPER_GRAY("grayPaper.png", new GrayCard(Resource.PAPER)),
    RED_1_HORN("red1horn.png", new RedCard(1)),
    RED_2_HORN("red2horn.jgp", new RedCard(2)),
    ARC_GREEN("greenArc.png", new GreenCard(ScientificSymbol.COMPASS)),
    CAT_WITH_BLUE("blueCat.png", new BlueCard(true, 2)),
    YELLOW("yellow.png", new YellowCard());

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
