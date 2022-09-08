package jalau.at18.katas.pokerhands.rodrigob;

public class Player {

    private PokerHand playerHand;
    private String playerName;

    public Player(PokerHand playerHand, String playerName) {
        this.playerHand = playerHand;
        this.playerName = playerName;
    }

    public PokerHand getPlayerHand() {
        return playerHand;
    }

    public String getPlayerName() {
        return playerName;
    }
}
