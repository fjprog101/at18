package jalau.at18.katas.langtonant.Team1;

import java.util.Arrays;
import java.util.List;

public class Direction {
    private char[][] newTab;
    Ant ant;
    String direction;

    public Direction() {
        ant = new Ant();
        direction = ant.getDirection();
    }

    public List<Object> confDirection(char[][] tabs, String direction){
        Movements movements = new Movements();
        if(direction == "Right"){
            tabs = movements.moveWhite(tabs);
            direction = "Down";
        } else if (direction == "Left"){
            tabs = movements.moveWhite(tabs);
            direction = "Up";
        } else if (direction == "Up"){
            tabs = movements.moveWhite(tabs);
            direction = "Right";
        } else if (direction == "Down"){
            tabs = movements.moveWhite(tabs);
            direction = "Left";
        }
        return Arrays.asList(tabs, direction);
    }
}
