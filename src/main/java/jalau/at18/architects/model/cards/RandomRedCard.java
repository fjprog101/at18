package jalau.at18.architects.model.cards;

public class RandomRedCard {

    public RedCard getRedCard() {
        int rand = (int) (Math.random() * (2 - 0 + 1) + 0);
        return new RedCard(getSymbol(rand).getHorns(),getSymbol(rand));
    }

    public MilitarySymbol getSymbol(int rand) {
        if (rand == 0) {
            return MilitarySymbol.PERMANENT;
        }
        if (rand == 1) {
            return MilitarySymbol.ONE_HORN;
        }
        if (rand == 2) {
            return MilitarySymbol.TWO_HORN;
        }
        return null;
    }
}
