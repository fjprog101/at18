package jalau.at18.katas.bankocr.robertof;

import java.util.ArrayList;

public class BlockNumberAnalyzer {
    public static final int THREE = 3;

    public String[] getBlockNumber(ArrayList<String> tableValue, int i) {
        String[] block = new String[THREE];
        setBlockNumber(tableValue, i, block);
        return block;
    }

    private void setBlockNumber(ArrayList<String> tableValue, int i, String[] block) {
        for (int index = 0; index < THREE; index++) {
            block[index] = (i + THREE) < tableValue.get(0).length()
                    ? tableValue.get(index).substring(i, i + THREE) : tableValue.get(index).substring(i);
        }
    }
}
