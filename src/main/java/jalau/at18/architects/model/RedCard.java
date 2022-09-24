package jalau.at18.architects.model;

public class RedCard extends Card {
    private int shields;
    private int horns;
    public RedCard(int horns) {
        super("Red");
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
}
