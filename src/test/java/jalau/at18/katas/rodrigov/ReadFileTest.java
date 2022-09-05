package jalau.at18.katas.rodrigov;
import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;

import org.junit.Test;

import jalau.at18.katas.bankocr.rodrigov.ReadFile;
public class ReadFileTest {
    @Test
    public void shouldReadAccount() throws FileNotFoundException{
        //File myObj = new File(parent, child)
        ReadFile readFile = new ReadFile();
        readFile.readAccountsTxt();
        String firstOutput = "    _  _  _  _  _  _     _ ";
        String secondOutput = "|_||_|| || ||_   |  |  ||_ ";
        String thirdOutput = "  | _||_||_||_|  |  |  | _|";
        assertEquals(firstOutput, readFile.getLines()[0]);
        assertEquals(secondOutput, readFile.getLines()[1]);
        assertEquals(thirdOutput, readFile.getLines()[2]);
    }

    @Test
    public void shouldSetLine(){
        ReadFile readFile = new ReadFile();
        String[] input = {"1","2","3"};
        readFile.setLines(input);
    }
}
