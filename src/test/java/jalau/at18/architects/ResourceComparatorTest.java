package jalau.at18.architects;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;

import org.junit.Test;

public class ResourceComparatorTest {
    @Test
    public void shouldHaveTheSameResource(){
        Card card1 = new GrayCard(Resource.BRICK);
        Card card2 = new GrayCard(Resource.BRICK);
        LinkedList<String> listOfResources = new LinkedList<String>();
        ResourceCounter resourceCounter = new ResourceCounter(Resource.BRICK, listOfResources);
        resourceCounter.addResourceToList();
        listOfResources = resourceCounter.getListOfResources();
        resourceCounter = new ResourceCounter(Resource.BRICK, listOfResources);
        resourceCounter.addResourceToList();
        ResourceComparator resourceComparator = new ResourceComparator(resourceCounter);
        assertTrue(resourceComparator.comparer(card1, card2));
    }

    @Test
    public void shouldHaveTheSameResourceDueWildcard(){
        Card card1 = new GrayCard(Resource.BRICK);
        Card card2 = new YellowCard();
        LinkedList<String> listOfResources = new LinkedList<String>();
        ResourceCounter resourceCounter = new ResourceCounter(Resource.BRICK, listOfResources);
        ResourceComparator resourceComparator = new ResourceComparator(resourceCounter);
        assertTrue(resourceComparator.comparer(card1, card2));
    }

    @Test
    public void shouldHaveTheSameResourceDueWildcard2(){
        Card card1 = new YellowCard();
        Card card2 = new GrayCard(Resource.PAPER);
        LinkedList<String> listOfResources = new LinkedList<String>();
        ResourceCounter resourceCounter = new ResourceCounter(Resource.PAPER, listOfResources);
        ResourceComparator resourceComparator = new ResourceComparator(resourceCounter);
        assertTrue(resourceComparator.comparer(card1, card2));
    }

    @Test
    public void shouldNotHaveTheSameResourceDueWildcard(){
        Card card1 = new GrayCard(Resource.BRICK);
        Card card2 = new GrayCard(Resource.PAPER);
        LinkedList<String> listOfResources = new LinkedList<String>();
        ResourceCounter resourceCounter = new ResourceCounter(Resource.PAPER, listOfResources);
        ResourceComparator resourceComparator = new ResourceComparator(resourceCounter);
        assertFalse(resourceComparator.comparer(card1, card2));
    }

    @Test
    public void shouldNotHaveTheSameResource(){
        Card card1 = new GrayCard(Resource.BRICK);
        Card card2 = new GrayCard(Resource.PAPER);
        LinkedList<String> listOfResources = new LinkedList<String>();
        ResourceCounter resourceCounter = new ResourceCounter(Resource.BRICK, listOfResources);
        resourceCounter.addResourceToList();
        listOfResources = resourceCounter.getListOfResources();
        resourceCounter = new ResourceCounter(Resource.PAPER, listOfResources);
        resourceCounter.addResourceToList();
        ResourceComparator resourceComparator = new ResourceComparator(resourceCounter);
        assertFalse(resourceComparator.comparer(card1, card2));
    }
}
