package jalau.at18.architects;

public class GreenCard extends Card {
    private String color;
    private ScientificSymbol scientificSymbol;

    public GreenCard(ScientificSymbol scientificSymbol) {
        this.color = "Green";
        this.scientificSymbol = scientificSymbol;
    }

    @Override
    public String getColor() {
        return color;
    }

    public String getSymbol() {
        return scientificSymbol.getSymbol();
    }
}
