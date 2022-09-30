package jalau.at18.architects.model.cards;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class GenerateARandomCardForResourceListTest {
    @Test
    public void shouldBeARandomResourceCard(){


        GenerateARandomCardForResourceList generateARandomCardForResourceList = new GenerateARandomCardForResourceList();
        Card randomCard = generateARandomCardForResourceList.randomResourceCard();
        int randomNum = generateARandomCardForResourceList.getRandomNumber();
        if(randomNum == 1){
            assertEquals("Gray", randomCard.getColor());

        } else if (randomNum == 2){
            assertEquals("Gray", randomCard.getColor());

        } else if (randomNum == 3){
            assertEquals("Gray", randomCard.getColor());

        } else if (randomNum == 4){
            assertEquals("Gray", randomCard.getColor());

        } else if (randomNum == 5){
            assertEquals("Gray", randomCard.getColor());

        } else if (randomNum == 6){
            assertEquals("Yellow", randomCard.getColor());

        } else {
            assertNull(randomCard);
        }

    }
    @Test
    public void shouldReturnDifferentsCards(){

        GenerateARandomCardForResourceList generateARandomCardForResourceList = new GenerateARandomCardForResourceList();
        generateARandomCardForResourceList.setRandomNumber(1);
        assertEquals(EnumResourceList.WATER.getCard(), generateARandomCardForResourceList.randomResourceCard());

        generateARandomCardForResourceList.setRandomNumber(2);
        assertEquals(EnumResourceList.WOOD.getCard(), generateARandomCardForResourceList.randomResourceCard());

        generateARandomCardForResourceList.setRandomNumber(3);
        assertEquals(EnumResourceList.STONE.getCard(), generateARandomCardForResourceList.randomResourceCard());

        generateARandomCardForResourceList.setRandomNumber(4);
        assertEquals(EnumResourceList.PAPER.getCard(), generateARandomCardForResourceList.randomResourceCard());

        generateARandomCardForResourceList.setRandomNumber(5);
        assertEquals(EnumResourceList.BRICK.getCard(), generateARandomCardForResourceList.randomResourceCard());

        generateARandomCardForResourceList.setRandomNumber(6);
        assertEquals(EnumResourceList.GOLD.getCard(), generateARandomCardForResourceList.randomResourceCard());
    }
}