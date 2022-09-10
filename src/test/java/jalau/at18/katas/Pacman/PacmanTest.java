package jalau.at18.katas.Pacman;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class PacmanTest {
    @Test
    public void ShouldBeaPacman() {
        Pacman pacman = new Pacman();
        assertEquals(3, pacman.getLives());
    }

    @Test
    public void ShouldBeTheBoard() {
        Board board = new Board();
        assertNotNull(board.getPacman());
    }

    @Test
    public void ShouldReturnPositionPacman() {
        Pacman pacman = new Pacman();
        assertEquals(0, pacman.getPositionX());
        assertEquals(0, pacman.getPositionY());
    }
}
