package jalau.at18.architects;

public class CardRed extends Card {
    private String color;
    private int shields;
    private int horns;
    public CardRed(int horns) {
        this.color = "Red";
        this.shields = 1;
        this.horns = horns;
    }
    @Override
    public String getColor() {
        return color;
    }
    public int getShields() {
        return shields;
    }
    public int getHorns() {
        return horns;
    }
}
