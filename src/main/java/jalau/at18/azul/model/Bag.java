package jalau.at18.azul.model;

import java.util.*;

public class Bag {

    private ArrayList<Tile> bag;
    private static final int NUMBER_ONE_COLOR = 24;
    private static final int NUMBER_OF_COLORS = 5;

    public Bag() {
        this.bag = new ArrayList<>();
    }

    public ArrayList<Tile> fillBagWithColors() {
        TileColor[] color = {TileColor.RED, TileColor.YELLOW, TileColor.DARK, TileColor.BLUE, TileColor.WHITE};
        for (int index = 0; index < NUMBER_OF_COLORS; index++) {
            for (int jindex = 0; jindex < NUMBER_ONE_COLOR; jindex++) {
                this.bag.add(new Tile(color[index]));
            }
        }
        return bag;
    }

    public ArrayList<Tile> getMixedBag() {
        return mixColors(fillBagWithColors());
    }

    public ArrayList<Tile> mixColors(ArrayList<Tile> simpleBag) {
        ArrayList<Tile> mixedBag = simpleBag;
        Collections.shuffle(mixedBag);
        return mixedBag;
    }
}
