package jalau.at18.architects.model.cards;

public class GreenCard extends Card {
    private ScientificSymbol scientificSymbol;

    public GreenCard(ScientificSymbol scientificSymbol) {
        super("Green");
        this.scientificSymbol = scientificSymbol;
    }

    @Override
    public String getColor() {
        return super.color();
    }

    public String getSymbol() {
        return scientificSymbol.getSymbol();
    }

    public String getImage() {
        return scientificSymbol.getImage();
    }
}
