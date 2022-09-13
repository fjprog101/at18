package jalau.at18.katas.pokerhands.alvaro;

public class PokerHandGame {
    private IdentifyHand identifyHand;
    public PokerHandGame() {
        identifyHand = new IdentifyHand();
    }
    public String compareHands(PokerHand whiteHand, PokerHand blackHand) {

        if (identifyHand.searchTypeHand(blackHand) < identifyHand.searchTypeHand(whiteHand)) {
            return "WhiteHand Wins with " + identifyHand.getNameHand();
        } else if (identifyHand.searchTypeHand(whiteHand) < identifyHand.searchTypeHand(blackHand)) {
            return "BlackHand Wins with " + identifyHand.getNameHand();
        } else {
            return "Tie";
        }
    }
}
