package jalau.at18.katas.pokerhands.maria.Identifier;

import jalau.at18.katas.pokerhands.maria.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HighCardIdentifier implements PokerHandIdentifier {
    private static final int LAST_POSITION_LIST = 4;

    @Override
    public boolean identify(PokerHand hand) {
        return true;
    }

    @Override
    public PokerHandRank getRank(PokerHand hand) {
        List<Card> cards = Arrays.asList(hand.getCards());
        Collections.sort(cards);
        PokerHandRank pokerHandRank = new PokerHandRank(PokerHandType.HIGHCARD, getCardValues(cards));
        return pokerHandRank;
    }

    private List<CardValue> getCardValues(List<Card> cards) {
        List<CardValue> listCardValue = new ArrayList<>();
        for (Card element : cards) {
            listCardValue.add(element.getValue());
        }
        Collections.sort(listCardValue);
        return listCardValue;
    }
}
