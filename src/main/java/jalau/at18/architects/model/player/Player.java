package jalau.at18.architects.model.player;

import jalau.at18.architects.model.cards.Card;
import jalau.at18.architects.model.wonders.Wonder;

public class Player {
    private String name;
    private Wonder wonder;
    private Playcard playcard;
    private int playerPoints = 0;
    public Player(String name, Wonder wonder) {
        this.name = name;
        this.wonder = wonder;
        playcard = new Playcard();
    }
    public int getPointsPlayer() {
        return this.playerPoints + playcard.getPointsPlaycard() + wonder.getPointsWonder();
    }
    public String getName() {
        return name;
    }
    public Wonder getWonder() {
        return wonder;
    }
    public void setPlaycard(Playcard playcardI) {
        this.playcard = playcardI;
    }
    public Playcard getPlaycard() {
        return playcard;
    }
    public void addNewCard(Card card) {
        playcard.addNewCard(card);
    }
}
