package jalau.at18.architects.model.cards;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ScienceComparatorTest {
    @Test
    public void shouldHaveTheSameElement(){
        GreenCard card1 = new GreenCard(ScientificSymbol.SCREW);
        GreenCard card2 = new GreenCard(ScientificSymbol.SCREW);
        ScienceComparator scienceComparator = new ScienceComparator();
        assertTrue(scienceComparator.compare(card1, card2));
    }
    
    @Test
    public void shouldNotHaveTheSameElement(){
        GreenCard card1 = new GreenCard(ScientificSymbol.SCREW);
        GreenCard card2 = new GreenCard(ScientificSymbol.COMPASS);
        ScienceComparator scienceComparator = new ScienceComparator();
        assertFalse(scienceComparator.compare(card1, card2)); 
    }
}
