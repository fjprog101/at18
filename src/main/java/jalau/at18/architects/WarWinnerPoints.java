package jalau.at18.architects;

public class WarWinnerPoints {
    private int warTokens;
    private int pointForVictory = 3;

    public WarWinnerPoints() {
        this.warTokens = 0;
    }
    public void setQuantityToken(int warsWon) {
        warTokens = warTokens + warsWon;
    }
    public int getTokens() {
        return warTokens;
    }
    public int getPoints() {
        return (pointForVictory * warTokens);
    }
}
