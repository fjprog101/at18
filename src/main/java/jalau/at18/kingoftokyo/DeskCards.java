package jalau.at18.kingoftokyo;

import java.util.ArrayList;
import java.util.List;

public class DeskCards {
    List<CompleteCard> deskOfCards;

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
}
