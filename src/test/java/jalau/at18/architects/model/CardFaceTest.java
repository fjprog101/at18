package jalau.at18.architects.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CardFaceTest {
    @Test
    public void getValuesOfCard() {
        CardFace cardFace = CardFace.RED_1_HORN;
        assertEquals("red1horn.png",cardFace.getNameOfFile());
        assertEquals("Red",cardFace.getCard().getColor());
    }
}
