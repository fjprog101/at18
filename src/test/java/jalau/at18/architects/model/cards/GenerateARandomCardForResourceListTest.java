package jalau.at18.architects.model.cards;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class GenerateARandomCardForResourceListTest {
    @Test
    public void shouldBeARandomResourceCard(){
        int quantityRandom = 0;
        while(quantityRandom < 20) {
        GenerateARandomCardForResourceList generateARandomCardForResourceList = new GenerateARandomCardForResourceList();
        Card randomCard = generateARandomCardForResourceList.randomResourceCard();
        int randomNum = generateARandomCardForResourceList.getRandomNumber();
        if(randomNum == 1){
            assertEquals("Gray", randomCard.getColor());
            quantityRandom++;
        } else if (randomNum == 2){
            assertEquals("Gray", randomCard.getColor());
            quantityRandom++;
        } else if (randomNum == 3){
            assertEquals("Gray", randomCard.getColor());
            quantityRandom++;
        } else if (randomNum == 4){
            assertEquals("Gray", randomCard.getColor());
            quantityRandom++;
        } else if (randomNum == 5){
            assertEquals("Gray", randomCard.getColor());
            quantityRandom++;
        } else if (randomNum == 6){
            assertEquals("Yellow", randomCard.getColor());
            quantityRandom++;
        } else {
            assertNull(randomCard);
        }
    }
}
}