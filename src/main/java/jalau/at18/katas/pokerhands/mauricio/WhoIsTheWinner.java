package jalau.at18.katas.pokerhands.mauricio;

import java.util.List;


public class WhoIsTheWinner {
    private PokerHand blackHand;
    private PokerHand whiteHand;

    public WhoIsTheWinner(PokerHand blackHand, PokerHand whiteHand){
        this.blackHand = blackHand;
        this.whiteHand = whiteHand;
    }
    public String whoisWinner(){
        HandsCounter hands = new HandsCounter(blackHand, whiteHand);
        List<Object> handsPerPlayer = hands.countHands();
        CardValuesCount black = (CardValuesCount) handsPerPlayer.get(0);
        CardValuesCount white = (CardValuesCount) handsPerPlayer.get(1);
        return initialize(black, white);
    }

    public String initialize(CardValuesCount black, CardValuesCount white){
        String whoIsWinner = (black.sizeOfGroup() < white.sizeOfGroup()) ? "Black is winner" : "White is winner";
        return whoIsWinner;
    }
}
