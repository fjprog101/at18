package jalau.at18.architects.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConflictBarTest {
    @Test
    public void createAConflictBar() {
        ConflictBar conflictBar = new ConflictBar(3);
        assertEquals(false, conflictBar.getConflict());
    }
    @Test
    public void addHornsToConflictBar() {
        ConflictBar conflictBar = new ConflictBar(3);
        conflictBar.addWarCalls(1);
        conflictBar.addWarCalls(1);
        assertEquals(false, conflictBar.getConflict());
        assertEquals(2, conflictBar.getWarCalls());
    }
    @Test
    public void addTheTopHornsToConflictBar() {
        ConflictBar conflictBar1 = new ConflictBar(3);
        conflictBar1.addWarCalls(2);
        conflictBar1.addWarCalls(2);
        assertEquals(true, conflictBar1.getConflict());
        assertEquals(0, conflictBar1.getWarCalls());
        ConflictBar conflictBar2 = new ConflictBar(5);
        conflictBar2.addWarCalls(2);
        conflictBar2.addWarCalls(1);
        conflictBar2.addWarCalls(2);
        assertEquals(true, conflictBar2.getConflict());
        assertEquals(0, conflictBar2.getWarCalls());
    }
    @Test
    public void addTheTopHornsConflictBar() {
        ConflictBar conflictBar1 = new ConflictBar(3);
        conflictBar1.addWarCalls(2);
        conflictBar1.addWarCalls(1);
        conflictBar1.addWarCalls(2);
        assertEquals(false, conflictBar1.getConflict());
        assertEquals(2, conflictBar1.getWarCalls());
    }
    @Test
    public void callConflicttoWar() {
        ConflictBar conflictBar1 = new ConflictBar(3);
        conflictBar1.addWarCalls(2);
        conflictBar1.addWarCalls(1);
        conflictBar1.addWarCalls(2);
        conflictBar1.addWarCalls(2);
        assertEquals(true, conflictBar1.getConflict());
        assertEquals(0, conflictBar1.getWarCalls());
    }
}
