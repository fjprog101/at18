package jalau.at18.katas.pokerhands.rodrigov;

public class HandsTwoPairs extends CardsPattern{
    private boolean twoPairsCondition;

    @Override
    public boolean match(PokerHand hand){
        PairsCounter pairsCounter = new PairsCounter(hand);
        twoPairsCondition = pairsCounter.getArraySize() == 2 ? true : false;
        return twoPairsCondition;
    }

}
