package jalau.at18.katas.pokerhands.maria.Identifier;

import jalau.at18.katas.pokerhands.maria.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FlushIdentifier implements PokerHandIdentifier {
    private PokerHandAnalizer analizer;
    private static final int LAST_CART_POSITION = 4;

    public FlushIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    @Override
    public boolean identify(PokerHand hand) {
        AllSameSuit allSameSuit = new AllSameSuit();
        return analizer.analize(hand, allSameSuit);
    }

    @Override
    public PokerHandRank getRank(PokerHand hand) {
        List<Card> cards = Arrays.asList(hand.getCards());
        Collections.sort(cards);
        PokerHandRank pokerHandRank = new PokerHandRank(PokerHandType.FLUSH, getCardValues(cards));
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
