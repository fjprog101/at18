package jalau.at18.katas.bankocr.robertof;

import java.util.ArrayList;

public class Decryptor {
    public static final int THREE = 3;
    public String decryptValue(ArrayList<String> tableValue) {
        Mapper mapper = new Mapper();
        StringBuilder realValue = new StringBuilder();
        for (int index = 0; index < tableValue.get(0).length(); index += THREE) {
            String[] block = getBlock(tableValue, index);
            int sum = getTotalValue(block);
            realValue.append(mapper.getMapValue(sum));
        }
        return realValue.toString();
    }

    private int getTotalValue(String[] block) {
        int sum = 0;
        Table table = new Table();
        for (int index = 0; index < THREE; index++) {
            for (int jndex = 0; jndex < block[index].length(); jndex++) {
                if (block[index].charAt(jndex) != ' ') {
                    sum += table.getValue(index, jndex);
                }
            }
        }
        return sum;
    }

    private String[] getBlock(ArrayList<String> tableValue, int i) {
        String[] block = new String[THREE];
        if ((i + THREE) < tableValue.get(0).length()) {
            block[0] = tableValue.get(0).substring(i, i + THREE);
            block[1] = tableValue.get(1).substring(i, i + THREE);
            block[2] = tableValue.get(2).substring(i, i + THREE);
        } else {
            block[0] = tableValue.get(0).substring(i);
            block[1] = tableValue.get(1).substring(i);
            block[2] = tableValue.get(2).substring(i);
        }
        return block;
    }
}
