package jalau.at18.architects.model.cards;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GenerateARandomBluePointForBluePointsTest {
    @Test
    public void shouldHaveBluePointsWithCatIncludedOrNot(){
        int quantityRandom = 0;
        while(quantityRandom < 4) {
        GenerateARandomBluePointForBluePoints generateARandomBluePointForBluePoints = new GenerateARandomBluePointForBluePoints();
        BluePoints bluePoints = generateARandomBluePointForBluePoints.randomBluePoint();
        int catPoints = bluePoints.getCats();
        int victoryPoints = bluePoints.getPoints();
        if(catPoints == 1){
            assertEquals(1, catPoints);
            assertEquals(2, victoryPoints);
            quantityRandom ++;
        } else {
            assertEquals(0, catPoints);
            assertEquals(3, victoryPoints);
            quantityRandom ++;
        }
    }
}

}
