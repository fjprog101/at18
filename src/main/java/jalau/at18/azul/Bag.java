package jalau.at18.azul;

import java.util.ArrayList;

public class Bag {

    private ArrayList<Character> bag;
    private char[] colors = {'R', 'Y', 'D', 'B', 'W'};
    private static final int NUMBER_ONE_COLOR = 20;
    private static final int NUMBER_OF_COLORS = 5;

    public Bag() {
        this.bag = new ArrayList<>();
    }

    public ArrayList<Character> fillBagWithColors() {
        for (int index = 0; index < NUMBER_OF_COLORS; index++) {
            for (int jindex = 0; jindex < NUMBER_ONE_COLOR; jindex++) {
                bag.add(colors[index]);
            }
        }
        return bag;
    }

    public ArrayList<Character> getBag() {
        return fillBagWithColors();
    }
}