package jalau.at18.katas.bankocr.adriana;

import java.util.ArrayList;

public class PossibleDigits {

    public PossibleDigits() {
    }

    public ArrayList<ArrayList> getList(Digit[] digits) {
        ArrayList<ArrayList> list = new ArrayList<ArrayList>();
        for (int index = 0; index < digits.length; index++) {
            list.add(new PossibleValues().getValues(digits[index]));
        }
        return list;
    }
}
