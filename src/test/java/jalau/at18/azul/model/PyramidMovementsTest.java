package jalau.at18.azul.model;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import jalau.at18.azul.view.PyramidBoard;

public class PyramidMovementsTest {
    
    @Test
    public void shouldReturnEmptyTilesOfThePyramid(){
        int expected = 4;
        PyramidBoard pyramidBoard = new PyramidBoard();
        PyramidMovements pyramidMovements = new PyramidMovements(pyramidBoard);
        assertEquals(expected, pyramidMovements.sendEmptyTiles(0));
        assertEquals(expected, pyramidMovements.sendEmptyTiles(1));
        assertEquals(expected, pyramidMovements.sendEmptyTiles(2));
        assertEquals(expected, pyramidMovements.sendEmptyTiles(3));
        assertEquals(expected, pyramidMovements.sendEmptyTiles(4));
    }

    @Test
    public void shouldCountEmptyPiramydTiles(){
        int expected = 1;
        int expected2 = 2;
        int expected3 = 3;
        int expected4 = 4;
        int expected5 = 5;
        PyramidBoard pyramidBoard = new PyramidBoard();
        PyramidMovements pyramidMovements = new PyramidMovements(pyramidBoard);
        assertEquals(expected, pyramidMovements.countEmptyPyramidTiles(0));
        assertEquals(expected2, pyramidMovements.countEmptyPyramidTiles(1));
        assertEquals(expected3, pyramidMovements.countEmptyPyramidTiles(2));
        assertEquals(expected4, pyramidMovements.countEmptyPyramidTiles(3));
        assertEquals(expected5, pyramidMovements.countEmptyPyramidTiles(4));
    }

    @Test 
    public void shoulCleanPyramidTiles(){
        PyramidBoard pyramidBoard = new PyramidBoard();
        PyramidBoard pyramidBoard2 = new PyramidBoard();
        PyramidMovements pyramidMovements = new PyramidMovements(pyramidBoard);
        pyramidMovements.cleanPyramid(0);
        assertEquals(pyramidBoard.getTileButton()[4][0].getTileValue(), pyramidBoard2.getTileButton()[0][4].getTileValue());
    }
}
