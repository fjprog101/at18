package jalau.at18.katas.bankocr.hugo;

public class NumChecker {
    private static final int LENGHT = 8;
    private static final int COMPL = 9;
    private static final int DIVISOR = 11;

    public boolean checkAccountNum(int[] accNum) {
        int sum = 0;
        int mult;
        for (int index = LENGHT; index >= 0; index--) {
            mult = COMPL - index;
            sum = sum + (mult * (accNum[index]));
        }
        if (sum % DIVISOR == 0) {
            return true;
        }
        return false;
    }
}
