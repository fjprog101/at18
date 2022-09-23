package jalau.at18.architects.model;

import java.util.Random;

public class Deck {
    private CardFace[] cards;
    Deck() {
        cards = CardFace.values();
    }

    public CardFace getRamdomCard() {
        Random random = new Random();
        int number = random.nextInt(cards.length);
        return cards[number];
    }
}
