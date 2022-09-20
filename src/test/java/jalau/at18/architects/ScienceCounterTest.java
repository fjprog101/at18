package jalau.at18.architects;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;

import org.junit.Test;

public class ScienceCounterTest {
    @Test
    public void shouldRemoveAElementFromList(){
        GreenCard card1 = new GreenCard(ScientificSymbol.COMPASS);
        GreenCard card2 = new GreenCard(ScientificSymbol.COMPASS);
        LinkedList<String> listOfScienceElements = new LinkedList<String>();
        ScienceCounter scienceCounter = new ScienceCounter(listOfScienceElements);
        scienceCounter.addElementToList(card1);
        listOfScienceElements = scienceCounter.getListOfScienceElements();
        scienceCounter = new ScienceCounter(listOfScienceElements);
        scienceCounter.addElementToList(card2);
        scienceCounter.removeElementFromList();
        assertEquals(ScientificSymbol.COMPASS.getSymbol(), scienceCounter.getListOfScienceElements().getFirst());
    }

    @Test
    public void shouldHaveElementsOnTheList(){
        GreenCard card1 = new GreenCard(ScientificSymbol.COMPASS);
        GreenCard card2 = new GreenCard(ScientificSymbol.COMPASS);
        LinkedList<String> listOfScienceElements = new LinkedList<String>();
        ScienceCounter scienceCounter = new ScienceCounter(listOfScienceElements);
        scienceCounter.addElementToList(card1);
        listOfScienceElements = scienceCounter.getListOfScienceElements();
        scienceCounter = new ScienceCounter(listOfScienceElements);
        scienceCounter.addElementToList(card2);
        assertEquals(2, scienceCounter.sizeOfScienceELementsList());
    }
}
