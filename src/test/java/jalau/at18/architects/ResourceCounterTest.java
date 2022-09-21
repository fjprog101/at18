package jalau.at18.architects;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ResourceCounterTest {
    @Test
    public void shouldRemoveAElementFromList(){
        GrayCard card1 = new GrayCard(Resource.BRICK);
        GrayCard card2 = new GrayCard(Resource.PAPER);
        ResourceList resourceCounter = new ResourceList();
        resourceCounter.addResourceToList(card1);
        resourceCounter.addResourceToList(card2);
        resourceCounter.removeResourceFromList();
        assertEquals(Resource.PAPER.getResource(), resourceCounter.getListOfResources().getFirst());
    }

    @Test
    public void shouldHaveElementsOnTheList(){
        GrayCard card1 = new GrayCard(Resource.BRICK);
        GrayCard card2 = new GrayCard(Resource.PAPER);
        ResourceList resourceCounter = new ResourceList();
        resourceCounter.addResourceToList(card1);
        resourceCounter.addResourceToList(card2);
        assertEquals(2, resourceCounter.sizeOfResourceList());
    }
}
