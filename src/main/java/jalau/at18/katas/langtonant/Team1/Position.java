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
        posY -= 1;
    }
    
    public void downPosition() {
        posY += 1;
    }

    public void rightPosition() {
        posX += 1;
    }

    public void leftPosition() {
        posX -=1;
    }
}
