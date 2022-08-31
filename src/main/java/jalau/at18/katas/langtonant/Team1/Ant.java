package jalau.at18.katas.langtonant.Team1;

public class Ant {
    public static final int SEVEN = 5;
    private int posX;
    private int posY;
    private String direction;

    public Ant(int posX, int posY, String direction) {
        this.posX = posX;
        this.posY = posY;
        this.direction = direction;
    }

    public Ant() {
        posX = SEVEN;
        posY = SEVEN;
        direction = "Up";
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

}
