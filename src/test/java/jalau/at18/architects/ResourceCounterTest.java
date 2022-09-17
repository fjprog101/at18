package jalau.at18.architects;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;

import org.junit.Test;

public class ResourceCounterTest {
    @Test
    public void shouldRemoveAElementFromList(){
        GrayCard card1 = new GrayCard(Resource.BRICK);
        GrayCard card2 = new GrayCard(Resource.PAPER);
        LinkedList<String> listOfResources = new LinkedList<String>();
        ResourceCounter resourceCounter = new ResourceCounter(listOfResources);
        resourceCounter.addResourceToList(card1);
        listOfResources = resourceCounter.getListOfResources();
        resourceCounter = new ResourceCounter(listOfResources);
        resourceCounter.addResourceToList(card2);
        resourceCounter.removeResourceFromList();
        assertEquals(Resource.PAPER.getResource(), resourceCounter.getListOfResources().getFirst());
    }

    @Test
    public void shouldHaveElementsOnTheList(){
        GrayCard card1 = new GrayCard(Resource.BRICK);
        GrayCard card2 = new GrayCard(Resource.PAPER);
        LinkedList<String> listOfResources = new LinkedList<String>();
        ResourceCounter resourceCounter = new ResourceCounter(listOfResources);
        resourceCounter.addResourceToList(card1);
        listOfResources = resourceCounter.getListOfResources();
        resourceCounter = new ResourceCounter(listOfResources);
        resourceCounter.addResourceToList(card2);
        assertEquals(2, resourceCounter.sizeOfResourceList());
    }
}
