package jalau.at18.katas.bankocr.maria;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ProcessAccountLineFileTest {

    @Test
    public void readAccountLines() {
        ProcessAccountLineFile processAccountLineFile = new ProcessAccountLineFile();
        String string1 = "    _  _  _     _  _  _  _ ";
        String string2 = "  ||_| _| _||_||_ |_   ||_|";
        String string3 = "  | _||_  _|  | _||_|  ||_|";
        String string4 = "";

        List<String> contentFileRead = new ArrayList<>();
        contentFileRead.add(string1);
        contentFileRead.add(string2);
        contentFileRead.add(string3);
        contentFileRead.add(string4);
        processAccountLineFile.readAccountLines(contentFileRead);

        List<String> result = Arrays.asList("192345678");
        assertEquals(result, processAccountLineFile.getAccounts());
    }
}
