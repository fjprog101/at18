package jalau.at18.katas.Pacman;

public class Pacman {
    private int lives;
    private int positionX;
    private int positionY;
    private static final int LIVES_PACMAN = 3;

    public Pacman() {
        this.lives = LIVES_PACMAN;
        this.positionX = 0;
        this.positionY = 0;
    }

    public int getLives() {
        return lives;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

}
