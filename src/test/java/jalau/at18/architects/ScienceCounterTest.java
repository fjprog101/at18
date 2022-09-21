package jalau.at18.architects;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ScienceCounterTest {
    @Test
    public void shouldRemoveAElementFromList(){
        GreenCard card1 = new GreenCard(ScientificSymbol.COMPASS);
        GreenCard card2 = new GreenCard(ScientificSymbol.COMPASS);
        ScienceList scienceCounter = new ScienceList();
        scienceCounter.addElementToList(card1);
        scienceCounter.addElementToList(card2);
        scienceCounter.removeElementFromList();
        assertEquals(ScientificSymbol.COMPASS.getSymbol(), scienceCounter.getListOfScienceElements().getFirst());
    }

    @Test
    public void shouldHaveElementsOnTheList(){
        GreenCard card1 = new GreenCard(ScientificSymbol.COMPASS);
        GreenCard card2 = new GreenCard(ScientificSymbol.COMPASS);
        ScienceList scienceCounter = new ScienceList();
        scienceCounter.addElementToList(card1);
        scienceCounter.addElementToList(card2);
        assertEquals(2, scienceCounter.sizeOfScienceELementsList());
    }
}
