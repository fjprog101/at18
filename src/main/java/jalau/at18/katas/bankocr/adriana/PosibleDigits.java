package jalau.at18.katas.bankocr.adriana;

import java.util.ArrayList;

public class PosibleDigits {

    public PosibleDigits() {
    }

    public ArrayList<ArrayList> getList(Digit[] digits) {
        ArrayList<ArrayList> list = new ArrayList<ArrayList>();
        for (int index = 0; index < digits.length; index ++) {
            list.add(new PosibleValues().getValues(digits[index]));
        }
        return list;
    }
}
