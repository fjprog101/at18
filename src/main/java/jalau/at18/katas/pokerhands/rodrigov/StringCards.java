package jalau.at18.katas.pokerhands.rodrigov;

public class StringCards {
    private StringBuilder numbers = new StringBuilder();
    private int cont = 0;

    public void add(CardValue cardValue) {
        numbers.append(cardValue.getScore(cardValue) + " ");
    }

    public String get(CardValue cardValue) {
        return numbers.toString();
    }

    public int cardDefinitive(CardValue cardValue) {
        String sorted = get(cardValue);
        String[] arrayOfStrings = sorted.split(" ");
        System.out.println(arrayOfStrings.length);
        for (String cards : arrayOfStrings) {
            cont += Integer.parseInt(cards);
            System.out.println(cards.toString());
        }
        return cont;
    }
}
