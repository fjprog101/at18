package jalau.at18.katas.langtonant.Team1;

public class Ant {
    private int posX;
    private int posY;
    private String direction;

    public Ant(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public Ant() {
        posX = 7;
        posY = 7;
        direction = "Right";
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

    public void setDirection() {
        this.direction = direction;
    }
    public String getDirection() {
        return direction;
    }
}
