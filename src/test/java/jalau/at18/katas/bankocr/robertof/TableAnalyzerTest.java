package jalau.at18.katas.bankocr.robertof;

import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TableAnalyzerTest {
    @Test
    public void shouldAnalyzeTable() throws IOException {
        File file = new File("src/main/java/jalau/at18/katas/bankocr/robertof/sampleFile");
        FileReader fileReader = new FileReader(file);
        ArrayList<String> tableValue = fileReader.readFile();
        BlockNumberAnalyzer blockNumberAnalyzer = new BlockNumberAnalyzer();
        var block = blockNumberAnalyzer.getBlockNumber(tableValue,0);
        TableAnalyzer tableAnalyzer = new TableAnalyzer();
        var value = tableAnalyzer.getTotalValue(block);
        assertEquals(13, value);
    }
}
