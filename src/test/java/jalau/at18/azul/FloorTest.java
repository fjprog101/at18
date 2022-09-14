package jalau.at18.azul;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class FloorTest {

    @Test
    public void testAddTilesToFloor() {
        Floor floor = new Floor();
        floor.add('R');
        floor.add('R');
        floor.addTilestoFloor('D', 3);
        Floor expected = new Floor();
        expected.add('R');
        expected.add('R');
        expected.add('D');
        expected.add('D');
        expected.add('D');
        assertEquals(expected, floor);
    }

    @Test
    public void testAddTilesToFloor1() {
        Floor floor = new Floor();
        floor.add('R');
        floor.add('B');
        floor.add('D');
        floor.add('Y');
        floor.add('W');
        floor.addTilestoFloor('B', 3);
        Floor expected = new Floor();
        expected.add('R');
        expected.add('B');
        expected.add('D');
        expected.add('Y');
        expected.add('W');
        expected.add('B');
        expected.add('B');
        assertEquals(expected, floor);
    }

    @Test
    public void testPointsDeducted() {
        Floor floor = new Floor();
        floor.add('R');
        floor.add('Y');
        floor.add('Y');
        floor.add('D');
        int expected = 6;
        assertEquals(expected, floor.pointsDeducted());
    }
    @Test
    public void testPointsDeducted2() {
        Floor floor = new Floor();
        floor.add('R');
        floor.add('Y');
        floor.add('Y');
        floor.add('D');
        floor.add('Y');
        floor.add('D');
        int expected = 11;
        assertEquals(expected, floor.pointsDeducted());
    }
}
