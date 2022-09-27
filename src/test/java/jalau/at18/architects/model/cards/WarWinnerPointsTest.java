package jalau.at18.architects.model.cards;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WarWinnerPointsTest {
    @Test
    public void shouldReturnPointsOfVictory() {
        WarWinnerPoints warWinnerPoints = new WarWinnerPoints();
        warWinnerPoints.setQuantityToken(2);
        assertEquals(6, warWinnerPoints.getPoints());
    }
}
