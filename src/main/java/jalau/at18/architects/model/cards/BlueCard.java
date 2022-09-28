package jalau.at18.architects.model.cards;

public class BlueCard extends Card {

    private boolean cat;
    private int victoryPoints;

    public BlueCard(boolean cat, int victoryPoints) {
        super("Blue");
        this.cat = cat;
        this.victoryPoints = victoryPoints;
    }

    @Override
    public String getColor() {
        return super.color();
    }

    public boolean isCat() {
        return cat;
    }

    public int getVictoryPoints() {
        return victoryPoints;
    }

}
