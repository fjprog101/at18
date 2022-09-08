package test.java.jalau.at18.katas.pokerhands.carlos;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import jalau.at18.katas.pokerhands.carlos.Card;
import jalau.at18.katas.pokerhands.carlos.CardValue;
import jalau.at18.katas.pokerhands.carlos.PokerHand;
import jalau.at18.katas.pokerhands.carlos.StraightFlushIdentifier;
import main.java.jalau.at18.katas.pokerhands.carlos.ThreeOfAKind;

public class ThreeOfAKindTest {
    @Test
    public void shouldIdentifyThreeOfAKind() {
        ThreeOfAKind identifier = new ThreeOfAKind();

        PokerHand threeCards = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        assertTrue(identifier.identifyThreeOfAKind(threeCards));   
        
    } 
    
}
