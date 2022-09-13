package jalau.at18.katas.pokerhands.hugo;

public class Player {

    private PokerHand playerHand;
    private String playerColor;

    public Player(PokerHand playerHand, String playerColor) {
        this.playerHand = playerHand;
        this.playerColor = playerColor;
    }

    public PokerHand getPlayerHand() {
        return playerHand;
    }

    public String getPlayerName() {
        return playerColor;
    }
}