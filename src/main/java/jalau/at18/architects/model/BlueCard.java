package jalau.at18.architects.model;

public class BlueCard extends Card {

    private String color;
    private boolean cat;
    private int victoryPoints;

    public BlueCard(boolean cat, int victoryPoints) {
        super("Blue");
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
