package jalau.at18.architects.model.cards;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CardFaceTest {
    @Test
    public void getValuesOfCard() {
        CardFace cardFace = CardFace.RED_1_HORN;
        assertEquals("cwar2.png", cardFace.getNameOfFile());
        assertEquals("Red", cardFace.getCard().getColor());
    }
}
