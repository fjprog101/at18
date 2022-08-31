package jalau.at18.katas.langtonant.Team1;

public class Movements {
    Ant ant = new Ant();
    Board board = new Board();
    Position position = new Position();
    public Movements() {
        board = new Board();
    }

    public char[][] moveWhite(char[][] tabs) {
        switch(ant.getDirection()) {
            case "Up":
            position.rightPosition(tabs);
            break;
            case "Right":
            position.downPosition(tabs);
            break;
            case "Down":
            position.leftPosition(tabs);
            break;
            case "Left":
            position.upPosition(tabs);
            break;
        }  
        return tabs;

    }
    public char[][] moveBlack(char[][] tabs){
        switch(ant.getDirection()) {
            case "Up":
            position.leftPosition(tabs);
            break;
            case "Right":
            position.upPosition(tabs);
            break;
            case "Down":
            position.rightPosition(tabs);
            break;
            case "Left":
            position.downPosition(tabs);
            break;
        }  
        return tabs;
    }
    public Ant getAnt() {
        return ant;
    }
    public void moveDirection(char[][] tabs) {
    }
}
