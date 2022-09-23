package jalau.at18.kingoftokyo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DeckCards {
    private List<Card> deckOfCards;

    public DeckCards() {
        deckOfCards = new ArrayList<Card>();
        createDeck();
    }

    public List<Card> getDeck() {
        return deckOfCards;
    }

    public void createDeck() {
        for (DiscardCards discardCards : DiscardCards.values()) {
            deckOfCards.add(new CompleteCard(discardCards));
        }
    }

    public Card getRandomCard() {
        Random random = new Random();
        int indexRandom = random.nextInt(deckOfCards.size());
        return deckOfCards.get(indexRandom);
    }

    public void removeCard(CompleteCard card) {
        for (int index = 0; index < deckOfCards.size(); index++) {
            if (card.getCard() == ((CompleteCard) deckOfCards.get(index)).getCard()) {
                deckOfCards.remove(deckOfCards.get(index));
            }
        }
    }
}
