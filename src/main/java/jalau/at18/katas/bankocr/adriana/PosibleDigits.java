package jalau.at18.katas.bankocr.adriana;

import java.util.ArrayList;

public class PosibleDigits {
    private ArrayList<ArrayList> list;

    public PosibleDigits() {
        list = new ArrayList<ArrayList>();
    }

    public ArrayList<ArrayList> getList(Digit[] digits) {
        return list;
    }

    public void addElements(Digit[] digits) {
        for (Digit digit : digits) {
            list.add(new PosibleValues().getValues(digit));
        }
    }

}
