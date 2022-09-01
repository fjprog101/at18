package jalau.at18.katas.bankocr.alvaro;

import java.util.ArrayList;

public class SplitNumber {
    private static final int DIMENSIONS = 3;
    private static final int LONGITUD_NUMBER = 9;
    private static final int JUMP_TO_NEXT_NUMBER = 3;
    private int index = 0;
    private char[][] digitExtracted = new char[DIMENSIONS][DIMENSIONS];
    private Digit digit;
    private ArrayList<Integer> numbers = new ArrayList<>();
    public SplitNumber(String[] entry) {
        String[] data = entry;
        digit = new Digit(data);
        mainOperator();
        printNumbers();
    }
    public void mainOperator() {
        for (int ind = 0; ind < LONGITUD_NUMBER; ind++) {
            digitExtracted = digit.extractDigit(index);
            index = index + JUMP_TO_NEXT_NUMBER;
            SearchNumber searchNumber = new SearchNumber(digitExtracted);
            numbers.add(searchNumber.getNumber());
        }
    }
    public void printNumbers() {
        for (Integer num : numbers) {
            System.out.print(num);
        }
    }
    public ArrayList<Integer> getNumbers() {
        return numbers;
    }
}
