package jalau.at18.katas.langtonant.Team1;

public class Direction {
    private char[][] newTab;

    public char[][] confDirection(char[][] tabs){
        Ant ant = new Ant();
        Movements movements = new Movements();
        if(ant.getDirection() == "Right"){
            tabs = movements.moveWhite(tabs);
            ant.setDirection("Down");
        } else if (ant.getDirection() == "Left"){
            tabs = movements.moveWhite(tabs);
            ant.setDirection("Up");
        } else if (ant.getDirection() == "Up"){
            tabs = movements.moveWhite(tabs);
            ant.setDirection("Right");
        } else if (ant.getDirection() == "Down"){
            tabs = movements.moveWhite(tabs);
            ant.setDirection("Left");
        }
        return tabs;
    }
}
