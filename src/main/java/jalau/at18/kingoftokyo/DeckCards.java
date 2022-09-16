package jalau.at18.kingoftokyo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DeckCards {
    private List<Card> deskOfCards;

    DeckCards() {
        deskOfCards = new ArrayList<Card>();
        createDesk();
    }

    public List<Card> getDesk() {
        return deskOfCards;
    }

    public void createDesk() {
        for (DiscardCards discardCards : DiscardCards.values()) {
            deskOfCards.add(new CompleteCard(discardCards));
        }
    }

    public Card getRandomCard() {
        Random random = new Random();
        int indexRandom = random.nextInt(deskOfCards.size());
        return deskOfCards.get(indexRandom);
    }
}
