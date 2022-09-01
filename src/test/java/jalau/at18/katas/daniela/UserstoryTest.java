package jalau.at18.katas.daniela;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

//import jalau.at18.katas.bankocr.daniela.Dictionary;
import jalau.at18.katas.bankocr.daniela.ReadCharacters;
import jalau.at18.katas.bankocr.daniela.SetValue;
import jalau.at18.katas.bankocr.daniela.ValuesNumbers;

public class UserstoryTest {

    @Test
    public void shouldBeaValidCharacter() {
        ValuesNumbers valuenumber = ValuesNumbers.ZERO;
        String[][] Zero = { { " ", "_", " " }, { "|", " ", "|" }, { "|", "_", "|" } };
        assertEquals(Zero, valuenumber.getCharactersNumbers());
    }

    @Test
    public void shouldReturntheValueofCharacters() {
        String[][] Case1 = { { " ", "_", " " }, { "|", " ", "|" }, { "|", "_", "|" } };
        SetValue setvalue = new SetValue(Case1);
        assertEquals(0, setvalue.getValue());
    }

    @Test
    public void shouldReturntheValueofMoreCharacters() {
        String[][] Case1 = { { " ", "_", " " }, { "|", " ", "|" }, { "|", "_", "|" } };
        String[][] Case2 = { { " ", " ", " " }, { " ", " ", "|" }, { " ", " ", "|" } };
        String[][] Case3 = { { " ", "_", " " }, { " ", "_", "|" }, { "|", "_", " " } };
        SetValue[] changevaluearray = { new SetValue(Case1), new SetValue(Case2), new SetValue(Case3) }; /// Mandando
                                                                                                         /// set values
                                                                                                         /// dentro del
                                                                                                         /// array
        ReadCharacters readvalues = new ReadCharacters(changevaluearray);
        int[] expected = { 0, 1, 2 };
        assertArrayEquals(expected, readvalues.getValue());
    }

}
