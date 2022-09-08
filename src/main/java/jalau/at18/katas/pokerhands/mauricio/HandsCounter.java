package jalau.at18.katas.pokerhands.mauricio;

import java.util.Arrays;
import java.util.List;


public class HandsCounter {
    private PokerHand blackHand;
    private PokerHand whitehand;

    public HandsCounter(PokerHand blackHand, PokerHand whitehand){
        this.blackHand = blackHand;
        this.whitehand = whitehand;
    }
    public List<Object> countHands(){
        CardValuesCounter cardValuesCounterBlackHand = new CardValuesCounter(blackHand);
        CardValuesCount countBlack = cardValuesCounterBlackHand .getCount();
        CardValuesCounter cardValuesCounterWhiteHand = new CardValuesCounter(whitehand);
        CardValuesCount countWhite = cardValuesCounterWhiteHand .getCount();
        return Arrays.asList(countBlack, countWhite);
    }
}
