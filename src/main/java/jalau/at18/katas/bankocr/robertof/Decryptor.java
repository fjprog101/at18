package jalau.at18.katas.bankocr.robertof;

import java.util.ArrayList;

public class Decryptor {
    public static final int THREE = 3;
    private Mapper mapper = new Mapper();
    private BlockNumberAnalyzer blockNumberAnalyzer = new BlockNumberAnalyzer();
    private TableAnalyzer tableAnalyzer = new TableAnalyzer();

    public String decryptValue(ArrayList<String> tableValue) {
        StringBuilder realValue = new StringBuilder();
        for (int index = 0; index < tableValue.get(0).length(); index += THREE) {
            String[] block = blockNumberAnalyzer.getBlockNumber(tableValue, index);
            int sum = tableAnalyzer.getTotalValue(block);
            realValue.append(mapper.getMapValue(sum));
        }
        return realValue.toString();
    }
}
