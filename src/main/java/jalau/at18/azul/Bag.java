package jalau.at18.azul;

public class Bag {

    private static final int NUMBER_OF_TILES = 100;
    private static final int MAX = 5;
    private static final int BLUE_SELECTOR = 4;
    private static final int DARK_SELECTOR = 3;

    private int min = 1;
    private char[] bag;
    private int tilecounter = 0;

    public Bag() {
        bag = new char[NUMBER_OF_TILES];

    }

    public boolean tileLimit(int counter) {
        if (counter < NUMBER_OF_TILES) {
            return true;
        }
        return false;
    }
}
