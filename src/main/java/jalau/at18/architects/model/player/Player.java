package jalau.at18.architects.model.player;

import jalau.at18.architects.model.cards.Card;
import jalau.at18.architects.model.wonders.Wonders;

public class Player {
    private String name;
    private Wonders wonder;
    private Playcard playcard;
    public Player(String name, Wonders wonder) {
        this.name = name;
        this.wonder = wonder;
        playcard = new Playcard();
    }

    public String getName() {
        return name;
    }

    public Wonders getWonder() {
        return wonder;
    }

    public Playcard getPlaycard() {
        return playcard;
    }

    public void addNewCard(Card card) {
        playcard.addNewCard(card);
    }
}
