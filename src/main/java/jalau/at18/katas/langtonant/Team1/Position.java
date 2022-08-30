package jalau.at18.katas.langtonant.Team1;

public class Position {
    Ant ant;
    int posY;
    int posX;

    public Position(){
        ant = new Ant();
        posY = ant.getPosY();
        posX = ant.getPosX();
    }
    
    public void upPosition() {
        posX -= 1;
    }
    
    public void downPosition() {
        posX += 1;
    }

    public void rightPosition() {
        posY += 1;
    }

    public void leftPosition() {
        posY -=1;
    }
}
