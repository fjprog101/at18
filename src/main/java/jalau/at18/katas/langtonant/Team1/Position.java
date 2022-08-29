package jalau.at18.katas.langtonant.Team1;

public class Position {
    private int posX;

    

    public Position(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public Position() {
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
    private int posY;
}
