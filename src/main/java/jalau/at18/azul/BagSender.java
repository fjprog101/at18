package jalau.at18.azul;

import java.util.ArrayList;

public class BagSender {
    private ArrayList<Tile> bag;

    private static final int NUMBER_FACTORIES = 25;
    private static final int STEPS = 4;

    public BagSender() {
        this.bag = new ArrayList<>();
    }

    public void getBag() {
        Bag myBag = new Bag();
        bag = myBag.getMixedBag();
    }
}