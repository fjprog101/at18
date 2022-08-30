package jalau.at18.katas.pokerhands.team2;

public class Game {
    private String input;
    private Hand blackHand;
    private Hand whiteHand;

    public Game(String input) {
        separateHands(input);
    }
    public void separateHands(String handsToSeparate) {
        if (handsToSeparate.charAt(0) == 'B') {
            blackHand = new Hand(handsToSeparate.substring(0, 4));
        }
    }

    public String getGameResults() {
        return "";
    }
    public Hand getBlackHand() {
        return this.blackHand;
    }
}
