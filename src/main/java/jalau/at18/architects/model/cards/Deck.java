package jalau.at18.architects.model.cards;

import java.util.Random;
public class Deck {
    private CardFace[] cards;
    public Deck() {
        cards = CardFace.values();
    }

    public CardFace getRamdomCard() {
        Random random = new Random();
        int number = random.nextInt(cards.length);
        return cards[number];
    }
}
