<<<<<<< HEAD:src/test/java/jalau/at18/architects/model/cards/GenerateARandomBluePointForBluePointsTest.java
package jalau.at18.architects.model.cards;

=======
package jalau.at18.architects.model;
>>>>>>> 1d829ad4 (added unitest for GenerateARandomBluePointForBluePoints class):src/test/java/jalau/at18/architects/model/GenerateARandomBluePointForBluePointsTest.java
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
