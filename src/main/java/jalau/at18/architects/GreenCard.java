package jalau.at18.architects;

public class GreenCard extends Card {
    private String color;
    private ScientificSymbol scientificSymbol;

    public GreenCard(String color, ScientificSymbol scientificSymbol) {
        this.color = color;
        this.scientificSymbol = scientificSymbol;
    }

    @Override
    public String getColor() {
        return color;
    }

    public String getScientificSymbol() {
        return scientificSymbol.getSymbol();
    }
}
