package jalau.at18.architects;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;

import org.junit.Test;

public class ResourceComparatorTest {
    @Test
    public void shouldHaveTheSameResource(){
        GrayCard card1 = new GrayCard(Resource.BRICK);
        GrayCard card2 = new GrayCard(Resource.BRICK);
        LinkedList<String> listOfResources = new LinkedList<String>();
        ResourceCounter resourceCounter = new ResourceCounter(listOfResources);
        resourceCounter.addResourceToList(card1);
        listOfResources = resourceCounter.getListOfResources();
        resourceCounter = new ResourceCounter(listOfResources);
        resourceCounter.addResourceToList(card2);
        ResourceComparator resourceComparator = new ResourceComparator(resourceCounter);
        assertTrue(resourceComparator.compare(card1, card2));
    }

    @Test
    public void shouldNotHaveTheSameResource(){
        GrayCard card1 = new GrayCard(Resource.BRICK);
        GrayCard card2 = new GrayCard(Resource.PAPER);
        LinkedList<String> listOfResources = new LinkedList<String>();
        ResourceCounter resourceCounter = new ResourceCounter(listOfResources);
        resourceCounter.addResourceToList(card1);
        listOfResources = resourceCounter.getListOfResources();
        resourceCounter = new ResourceCounter(listOfResources);
        resourceCounter.addResourceToList(card2);
        ResourceComparator resourceComparator = new ResourceComparator(resourceCounter);
        assertFalse(resourceComparator.compare(card1, card2));
    }

    @Test
    public void shouldHaveDifferentResources(){
        GrayCard card1 = new GrayCard(Resource.BRICK);
        GrayCard card2 = new GrayCard(Resource.PAPER);
        LinkedList<String> listOfResources = new LinkedList<String>();
        ResourceCounter resourceCounter = new ResourceCounter(listOfResources);
        resourceCounter.addResourceToList(card1);
        listOfResources = resourceCounter.getListOfResources();
        resourceCounter = new ResourceCounter(listOfResources);
        resourceCounter.addResourceToList(card2);
        assertFalse(resourceCounter.traverseTheResourceList());
    }

    @Test
    public void shouldHaveSameResources(){
        GrayCard card1 = new GrayCard(Resource.BRICK);
        GrayCard card2 = new GrayCard(Resource.BRICK);
        LinkedList<String> listOfResources = new LinkedList<String>();
        ResourceCounter resourceCounter = new ResourceCounter(listOfResources);
        resourceCounter.addResourceToList(card1);
        listOfResources = resourceCounter.getListOfResources();
        resourceCounter = new ResourceCounter(listOfResources);
        resourceCounter.addResourceToList(card2);
        assertTrue(resourceCounter.traverseTheResourceList());
    }
}
