package jalau.at18.katas.bankocr.robertof;

public class TableAnalyzer {
    public static final int THREE = 3;
    private Table table = new Table();

    public int getTotalValue(String[] block) {
        int sum = 0;
        for (int index = 0; index < THREE; index++) {
            for (int jndex = 0; jndex < block[index].length(); jndex++) {
                if (block[index].charAt(jndex) != ' ') {
                    sum += table.getValue(index, jndex);
                }
            }
        }
        return sum;
    }
}
