package jalau.at18.architects.model;

public class WarWinnerPoints {
    private int warTokens;
    private static final int POINTFORVICTORY = 3;

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
        return (POINTFORVICTORY * warTokens);
    }
}
