package jalau.at18.architects.model;

public class BluePoints {
    private int points = 0;
    private int cats = 0;

    public void addPoints(BlueCard blueCard) {
        this.points += blueCard.getVictoryPoints();
        this.cats += blueCard.isCat() ? 1 : 0;
    }

    public int getPoints() {
        return points;
    }

    public int getCats() {
        return cats;
    }

}
