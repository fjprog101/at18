package jalau.at18.architects.model.cards;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class GenerateARandomBluePointForBluePointsTest {
    @Test
    public void shouldHaveBluePointsWithCatIncludedOrNot(){

        GenerateARandomBluePointForBluePoints generateARandomBluePointForBluePoints = new GenerateARandomBluePointForBluePoints();
        BluePoints bluePoints = generateARandomBluePointForBluePoints.randomBluePoint();
        int catPoints = bluePoints.getCats();
        int victoryPoints = bluePoints.getPoints();
        if(catPoints == 1){
            assertEquals(1, catPoints);
            assertEquals(2, victoryPoints);
        } else {
            assertEquals(0, catPoints);
            assertEquals(3, victoryPoints);
        }
    }
    @Test
    public void shouldHaveBluePointsWithCatIncluded() {
        GenerateARandomBluePointForBluePoints generateARandomBluePointForBluePoints = new GenerateARandomBluePointForBluePoints();
        generateARandomBluePointForBluePoints.setRandonNumber(2);
        BluePoints bluePoints = generateARandomBluePointForBluePoints.randomBluePoint();
        int catPoints = bluePoints.getCats();
        int victoryPoints = bluePoints.getPoints();
        assertEquals(1, catPoints);
        assertEquals(2, victoryPoints);
    }
    @Test
    public void shouldHaveBluePointsWithCatNotIncluded() {
        GenerateARandomBluePointForBluePoints generateARandomBluePointForBluePoints = new GenerateARandomBluePointForBluePoints();
        generateARandomBluePointForBluePoints.setRandonNumber(3);
        BluePoints bluePoints = generateARandomBluePointForBluePoints.randomBluePoint();
        int catPoints = bluePoints.getCats();
        int victoryPoints = bluePoints.getPoints();
        assertEquals(0, catPoints);
        assertEquals(3, victoryPoints);
    }

    @Test
    public void shouldHaveBluePointsWithOutPointsAndCat() {
        GenerateARandomBluePointForBluePoints generateARandomBluePointForBluePoints = new GenerateARandomBluePointForBluePoints();
        generateARandomBluePointForBluePoints.setRandonNumber(5);
        BluePoints bluePoints = generateARandomBluePointForBluePoints.randomBluePoint();
        int catPoints = bluePoints.getCats();
        int victoryPoints = bluePoints.getPoints();
        assertEquals(0, catPoints);
        assertEquals(0, victoryPoints);
    }

}


