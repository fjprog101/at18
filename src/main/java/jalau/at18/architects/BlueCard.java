package jalau.at18.architects;

public class BlueCard extends Card {

    private String color;
    private boolean cat;
    private int victoryPoints;

    public BlueCard(boolean cat, int victoryPoints) {
        this.color = "Blue";
        this.cat = cat;
        this.victoryPoints = victoryPoints;
    }

    @Override
    public String getColor() {
        return color;
    }

    public boolean isCat() {
        return cat;
    }

    public int getVictoryPoints() {
        return victoryPoints;
    }

}
