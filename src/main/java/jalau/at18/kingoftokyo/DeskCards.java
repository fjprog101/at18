package jalau.at18.kingoftokyo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DeskCards {
    private List<CompleteCard> deskOfCards;

    DeskCards() {
        deskOfCards = new ArrayList<CompleteCard>();
        createDesk();
    }

    public List<CompleteCard> getDesk() {
        return deskOfCards;
    }

    public void createDesk() {
        for (DiscardCards discardCards : DiscardCards.values()) {
            deskOfCards.add(new CompleteCard(discardCards));
        }
    }

    public CompleteCard getRandomCard() {
        Random random = new Random();
        int indexRandom = random.nextInt(deskOfCards.size());
        return deskOfCards.get(indexRandom);
    }
}
