package jalau.at18.kingoftokyo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MonsterTest {
    @Test
    public void shouldCreateMonsterWithAttributes() {
        assertEquals("Alienoid", Monster.ALIENOID.getName());
        assertEquals(10, Monster.ALIENOID.getLifePoints());
        assertEquals(0, Monster.ALIENOID.getVictoryPoints());
        assertEquals("src/main/resources/kingoftokyo/monsters/Alienoid.png", Monster.ALIENOID.getIconPath());
    }
}
