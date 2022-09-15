package jalau.at18.kingoftokyo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MonsterTest {
    @Test
    public void shouldCreateMonsterWithAttributes() {
        Monster monster = new Monster("Gigazaur");
        assertEquals("Gigazaur", monster.getName());
        assertEquals(10, monster.getLifePoints());
        assertEquals(0, monster.getVictoryPoints());
    }
}
