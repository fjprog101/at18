package jalau.at18.architects.model.cards;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import jalau.at18.architects.model.wonders.Giza;
import jalau.at18.architects.model.wonders.Rhodes;

public class UpdateListTest {
    @Test
    public void shouldHaveSameResourcesTwoCards(){
        Rhodes rhodes = new Rhodes();
        UpdateResourceList updateResourceList = new UpdateResourceList();
        GrayCard firstCard = new GrayCard(Resource.BRICK);
        GrayCard secondCard = new GrayCard(Resource.BRICK);
        updateResourceList.addTheCard(firstCard);
        updateResourceList.addTheCard(secondCard);
        rhodes.fillStages();
        assertTrue(updateResourceList.compareCards(rhodes));
        assertEquals(4, updateResourceList.checkPoints());
    }

    @Test
    public void shouldHaveSameResourcesTwoCardsWithWildCard(){
        Rhodes rhodes = new Rhodes();
        UpdateResourceList updateResourceList = new UpdateResourceList();
        GrayCard firstCard = new GrayCard(Resource.BRICK);
        YellowCard secondCard = new YellowCard();
        updateResourceList.addTheCard(firstCard);
        updateResourceList.addTheCard(secondCard);
        rhodes.fillStages();
        assertTrue(updateResourceList.compareCards(rhodes));
        assertEquals(4, updateResourceList.checkPoints());
    }

    @Test
    public void shouldHaveDifferentResourcesTwoCards(){
        Rhodes rhodes = new Rhodes();
        UpdateResourceList updateResourceList = new UpdateResourceList();
        GrayCard firstCard = new GrayCard(Resource.BRICK);
        GrayCard secondCard = new GrayCard(Resource.WATER);
        updateResourceList.addTheCard(firstCard);
        updateResourceList.addTheCard(secondCard);
        rhodes.fillStages();
        assertTrue(updateResourceList.compareCards(rhodes));
        assertEquals(4, updateResourceList.checkPoints());
    }

    @Test
    public void shouldHaveDifferentResourcesThreeCards(){
        Rhodes rhodes = new Rhodes();
        UpdateResourceList updateResourceList = new UpdateResourceList();
        GrayCard firstCard = new GrayCard(Resource.WATER);
        GrayCard secondCard = new GrayCard(Resource.STONE);
        GrayCard thirdCard = new GrayCard(Resource.PAPER);
        updateResourceList.addTheCard(firstCard);
        updateResourceList.addTheCard(secondCard);
        updateResourceList.addTheCard(thirdCard);
        rhodes.fillStages();
        assertTrue(updateResourceList.compareCards(rhodes));
        assertEquals(5, updateResourceList.checkPoints());
    }

    @Test
    public void shouldHaveSameResourcesThreeCards(){
        Rhodes rhodes = new Rhodes();
        UpdateResourceList updateResourceList = new UpdateResourceList();
        GrayCard firstCard = new GrayCard(Resource.WATER);
        GrayCard secondCard = new GrayCard(Resource.WATER);
        GrayCard thirdCard = new GrayCard(Resource.WATER);
        updateResourceList.addTheCard(firstCard);
        updateResourceList.addTheCard(secondCard);
        updateResourceList.addTheCard(thirdCard);
        rhodes.fillStages();
        assertTrue(updateResourceList.compareCards(rhodes));
        assertEquals(6, updateResourceList.checkPoints());
    }

    @Test
    public void shouldHaveSameResourcesThreeCardsWithWildCard(){
        Rhodes rhodes = new Rhodes();
        UpdateResourceList updateResourceList = new UpdateResourceList();
        GrayCard firstCard = new GrayCard(Resource.WOOD);
        GrayCard secondCard = new GrayCard(Resource.WOOD);
        YellowCard thirdCard = new YellowCard();
        updateResourceList.addTheCard(firstCard);
        updateResourceList.addTheCard(secondCard);
        updateResourceList.addTheCard(thirdCard);
        rhodes.fillStages();
        assertTrue(updateResourceList.compareCards(rhodes));
        assertEquals(6, updateResourceList.checkPoints());
    }

    @Test
    public void shouldHaveDifferentResourcesThreeCardsWithWildCard(){
        Rhodes rhodes = new Rhodes();
        UpdateResourceList updateResourceList = new UpdateResourceList();
        GrayCard firstCard = new GrayCard(Resource.WOOD);
        GrayCard secondCard = new GrayCard(Resource.STONE);
        YellowCard thirdCard = new YellowCard();
        updateResourceList.addTheCard(firstCard);
        updateResourceList.addTheCard(secondCard);
        updateResourceList.addTheCard(thirdCard);
        rhodes.fillStages();
        assertTrue(updateResourceList.compareCards(rhodes));
        assertEquals(5, updateResourceList.checkPoints());
    }

    @Test
    public void shouldHaveDifferentResourcesThreeCardsGhiza(){
        Giza giza = new Giza();
        UpdateResourceList updateResourceList = new UpdateResourceList();
        GrayCard firstCard = new GrayCard(Resource.WATER);
        GrayCard secondCard = new GrayCard(Resource.STONE);
        GrayCard thirdCard = new GrayCard(Resource.PAPER);
        updateResourceList.addTheCard(firstCard);
        updateResourceList.addTheCard(secondCard);
        updateResourceList.addTheCard(thirdCard);
        giza.fillStages();
        assertTrue(updateResourceList.compareCards(giza));
        assertEquals(6, updateResourceList.checkPoints());
    }

    @Test
    public void shouldHaveDifferentResourcesFourCards(){
        Giza giza = new Giza();
        UpdateResourceList updateResourceList = new UpdateResourceList();
        GrayCard firstCard = new GrayCard(Resource.WATER);
        GrayCard secondCard = new GrayCard(Resource.STONE);
        GrayCard thirdCard = new GrayCard(Resource.PAPER);
        GrayCard fourthCard = new GrayCard(Resource.BRICK);
        updateResourceList.addTheCard(firstCard);
        updateResourceList.addTheCard(secondCard);
        updateResourceList.addTheCard(thirdCard);
        updateResourceList.addTheCard(fourthCard);
        giza.fillStages();
        assertTrue(updateResourceList.compareCards(giza));
        assertEquals(8, updateResourceList.checkPoints());
    }

    @Test
    public void shouldHaveSameResourcesFourCards(){
        Giza giza = new Giza();
        UpdateResourceList updateResourceList = new UpdateResourceList();
        GrayCard firstCard = new GrayCard(Resource.WATER);
        GrayCard secondCard = new GrayCard(Resource.WATER);
        GrayCard thirdCard = new GrayCard(Resource.WATER);
        GrayCard fourthCard = new GrayCard(Resource.WATER);
        updateResourceList.addTheCard(firstCard);
        updateResourceList.addTheCard(secondCard);
        updateResourceList.addTheCard(thirdCard);
        updateResourceList.addTheCard(fourthCard);
        giza.fillStages();
        assertFalse(updateResourceList.compareCards(giza));
    }

    @Test
    public void shouldHaveDifferentResourcesFourCardsWithWildCards(){
        Giza giza = new Giza();
        UpdateResourceList updateResourceList = new UpdateResourceList();
        GrayCard firstCard = new GrayCard(Resource.WATER);
        GrayCard secondCard = new GrayCard(Resource.STONE);
        YellowCard thirdCard = new YellowCard();
        YellowCard fourthCard = new YellowCard();
        updateResourceList.addTheCard(firstCard);
        updateResourceList.addTheCard(secondCard);
        updateResourceList.addTheCard(thirdCard);
        updateResourceList.addTheCard(fourthCard);
        giza.fillStages();
        assertTrue(updateResourceList.compareCards(giza));
        assertEquals(8, updateResourceList.checkPoints());
    }
}
