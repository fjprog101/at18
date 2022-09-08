package test.java.jalau.at18.katas.pokerhands.carlos;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import jalau.at18.katas.pokerhands.carlos.Card;
import jalau.at18.katas.pokerhands.carlos.CardValue;
import jalau.at18.katas.pokerhands.carlos.PokerHand;
import jalau.at18.katas.pokerhands.carlos.StraightFlushIdentifier;
import main.java.jalau.at18.katas.pokerhands.carlos.Pairs;

public class PairsTest {
    @Test
    public void shouldIdentifyPairs() {
        Pairs identifier = new Pairs();

        PokerHand pairs = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        assertTrue(identifier.identifyPairs(pairs));   
        
    } 
}
