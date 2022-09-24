package jalau.at18.architects.model;

public class RandomGreenCard {

    public GreenCard getGreenCard() {
        int rand = (int) (Math.random() * (2 - 0 + 1) + 0);
        return new GreenCard(getSymbol(rand));
    }

    public ScientificSymbol getSymbol(int rand) {
        if (rand == 0) {
            return ScientificSymbol.COMPASS;
        }
        if (rand == 1) {
            return ScientificSymbol.OLDTABLE;
        }
        if (rand == 2) {
            return ScientificSymbol.SCREW;
        }
        return null;
    }

}
