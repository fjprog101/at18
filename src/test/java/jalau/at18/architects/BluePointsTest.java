package jalau.at18.architects;

import static org.junit.Assert.*;
import org.junit.Test;

public class BluePointsTest {

    @Test
    public void testSetPoints() {
        BluePoints bPoints = new BluePoints();
        BlueCard blueCard = new BlueCard(true, 2);
        bPoints.setPoints(blueCard);

        assertEquals(2, bPoints.getPoints());
        assertEquals(1, bPoints.getCats());
    }

    @Test
    public void testSetMorePoints() {
        BluePoints bPoints = new BluePoints();
        BlueCard blueCard;
        blueCard = new BlueCard(true, 2);
        bPoints.setPoints(blueCard);

        blueCard = new BlueCard(false, 4);
        bPoints.setPoints(blueCard);

        assertEquals(6, bPoints.getPoints());
        assertEquals(1, bPoints.getCats());
    }

    @Test
    public void testCatsAndPoints() {
        BluePoints bPoints = new BluePoints();
        BlueCard blueCard;

        blueCard = new BlueCard(true, 2);
        bPoints.setPoints(blueCard);

        blueCard = new BlueCard(true, 4);
        bPoints.setPoints(blueCard);

        blueCard = new BlueCard(true, 2);
        bPoints.setPoints(blueCard);

        blueCard = new BlueCard(true, 1);
        bPoints.setPoints(blueCard);

        assertEquals(9, bPoints.getPoints());
        assertEquals(4, bPoints.getCats());
    }
}
