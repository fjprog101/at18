package jalau.at18.architects.model;

import jalau.at18.architects.model.cards.Card;
import jalau.at18.architects.model.cards.RandomRedCard;

public class RedCardForDeck {
    private RandomRedCard randomRedCard;
    private ConflictBar conflictBar;

    public RedCardForDeck(int numberOfPlayers) {
        randomRedCard = new RandomRedCard();
        conflictBar = new ConflictBar(numberOfPlayers);
    }

    public Card getCard() {
        if (randomRedCard.getHorn() == 0) {
            return randomRedCard.getRedCard();
        } else {
            conflictBar.addWarCalls(randomRedCard.getHorn());
            return randomRedCard.getRedCard();
        }
    }

    public boolean updateView() {
        getCard();
        return conflictBar.getConflict();
    }

    public int updateWarToken() {
        return conflictBar.getWarCalls();
    }
}
