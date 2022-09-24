package jalau.at18.architects.model;

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
}
