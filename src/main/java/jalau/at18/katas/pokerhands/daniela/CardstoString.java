package jalau.at18.katas.pokerhands.daniela;

public class CardstoString {

    private StringBuilder totaldigits = new StringBuilder();
    private int tiebreaker = 0;

    public CardstoString() {
    }

    public void add(CardValue cardValue) {
        totaldigits.append(cardValue.getScore(cardValue));
    }

    public String get(CardValue cardValue) {
        return totaldigits.toString();
    }

    public int highCard(CardValue cardValuefinal) {
        String sorted = get(cardValuefinal);
        String[] arrOfStr = sorted.split("");
        for (String cards : arrOfStr) {
            tiebreaker += Integer.parseInt(cards);
        }
        return tiebreaker;
    }
}
