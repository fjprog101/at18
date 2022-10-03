package jalau.at18.architects.model.cards;

public class RedCard extends Card {
    private MilitarySymbol militarySymbol;
    private int shields;
    private int horns;
    public RedCard(int horns, MilitarySymbol militarySymbol) {
        super("Red");
        this.militarySymbol = militarySymbol;
        this.shields = 1;
        this.horns = horns;
    }
    @Override
    public String getColor() {
        return super.color();
    }
    public int getShields() {
        return shields;
    }
    public int getHorns() {
        return horns;
    }
    public String getImage() {
        return militarySymbol.getImage();
    }
}
