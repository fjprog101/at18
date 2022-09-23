package jalau.at18.azul;

import java.util.ArrayList;
import java.util.List;

public class BagSender {
    private List<Tile> bag;
    private List<Tile> factory;

    private static final int RANGE = 4;

    public BagSender() {
        this.bag = new ArrayList<>();
        this.factory = new ArrayList<>();
    }

    public void saveBag() {
        Bag myBag = new Bag();
        bag = myBag.getMixedBag();
    }

    public List<Tile> getFactoryGroup() {
        factory = bag.subList(0, RANGE);
       // bag.subList(0, RANGE).clear();
        return factory;
    }

    public void removeTiles() {
        bag.subList(0, RANGE).clear();
    }

    public List<Tile> saveRemainingBag() {
        return bag;
    }
}