package jalau.at18.katas.pokerhands.maria.Identifier;

import jalau.at18.katas.pokerhands.maria.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StraightFlushIdentifier implements PokerHandIdentifier {

    private PokerHandAnalizer analizer;

    public StraightFlushIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    @Override
    public boolean identify(PokerHand hand) {
        AllSameSuit allSameSuit = new AllSameSuit();
        ConsecutiveValues consecutiveValues = new ConsecutiveValues();
        return analizer.analize(hand, allSameSuit) && analizer.analize(hand, consecutiveValues);
    }

    @Override
    public PokerHandRank getRank(PokerHand hand) {
        List<Card> cards = Arrays.asList(hand.getCards());
        Collections.sort(cards);
        PokerHandRank pokerHandRank = new PokerHandRank(PokerHandType.STRAIGHTFLUSH, getCardValues(cards));
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
