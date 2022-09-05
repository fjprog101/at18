package jalau.at18.katas.bankocr.robertof;

public class TableAnalyzer {
    public static final int THREE = 3;
    private Table table = new Table();

    public int getTotalValue(String[] block) {
        int sum = 0;
        for (int index = 0; index < THREE; index++) {
            sum = getSum(block, sum, index);
        }
        return sum;
    }

    private int getSum(String[] block, int sum, int index) {
        for (int jndex = 0; jndex < block[index].length(); jndex++) {
            sum += block[index].charAt(jndex) != ' ' ? table.getValue(index, jndex) : 0;
        }
        return sum;
    }
}
