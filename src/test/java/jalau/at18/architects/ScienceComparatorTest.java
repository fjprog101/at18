package jalau.at18.architects;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;

import org.junit.Test;

public class ScienceComparatorTest {
    @Test
    public void shouldHaveTheSameElement(){
        GreenCard card1 = new GreenCard(ScientificSymbol.SCREW);
        GreenCard card2 = new GreenCard(ScientificSymbol.SCREW);
        LinkedList<String> listOfScienceElements = new LinkedList<String>();
        ScienceCounter scienceCounter = new ScienceCounter(listOfScienceElements);
        scienceCounter.addElementToList(card1);
        listOfScienceElements = scienceCounter.getListOfScienceElements();
        scienceCounter = new ScienceCounter(listOfScienceElements);
        scienceCounter.addElementToList(card2);
        ScienceComparator scienceComparator = new ScienceComparator(scienceCounter);
        assertTrue(scienceComparator.compare(card1, card2));
    }
    
    @Test
    public void shouldNotHaveTheSameElement(){
        GreenCard card1 = new GreenCard(ScientificSymbol.SCREW);
        GreenCard card2 = new GreenCard(ScientificSymbol.COMPASS);
        LinkedList<String> listOfScienceElements = new LinkedList<String>();
        ScienceCounter scienceCounter = new ScienceCounter(listOfScienceElements);
        scienceCounter.addElementToList(card1);
        listOfScienceElements = scienceCounter.getListOfScienceElements();
        scienceCounter = new ScienceCounter(listOfScienceElements);
        scienceCounter.addElementToList(card2);
        ScienceComparator scienceComparator = new ScienceComparator(scienceCounter);
        assertFalse(scienceComparator.compare(card1, card2)); 
    }
}
