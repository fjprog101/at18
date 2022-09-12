package jalau.at18.katas.bankocr.adriana;

import java.util.ArrayList;

public class PosibleValues {
    ArrayList<Integer> values;
    
    public PosibleValues() {
        values = new ArrayList<Integer>();
    }

    public ArrayList<Integer> getValues(Digit digit) {
        for (DigitType number : DigitType.values()) {
            if (getChanges(digit, number) <= 1) {
                values.add(number.ordinal());
            }
        }
        return values;
    }

    public int getChanges(Digit digit, DigitType number) {
        int changes = 0;
        for (int row = 0; row < 3; row ++) {
            for (int column = 0; column < 3; column ++) {
                changes = digit.getDigit()[row][column].equals(number.getArray()[row][column]) ? changes : changes + 1;
            }
        }
        return changes;
    }

}
