package jalau.at18.katas.bankocr.maria;

public class ConvertNumber {
    public static final int INITIAL_VALUE = -1;
    public int convert(String firstColumn, String secondColumn, String thirdColumn) {
        int number = INITIAL_VALUE;
        ZeroNumber zeroNumber = new ZeroNumber();
        OneNumber oneNumber = new OneNumber();
        TwoNumber twoNumber = new TwoNumber();
        if (zeroNumber.isThisNumber(firstColumn, secondColumn, thirdColumn)) {
            number = 0;
        } else if (oneNumber.isThisNumber(firstColumn, secondColumn, thirdColumn)) {
            number = 1;
        } else {
            if (twoNumber.isThisNumber(firstColumn, secondColumn, thirdColumn)) {
                number = 2;
            }
        }

        return number;
    }
}
