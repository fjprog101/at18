package jalau.at18.katas.bankocr.hugo;

public class NumChecker {
    private static final int LENGHT = 8;
    private static final int COMPL = 9;
    private static final int DIVIDER = 11;

    public boolean checkAccountNum(int[] accNum) {
        int sum = 0;
        for (int index = LENGHT; index >= 0; index--) {
            int mult = COMPL - index;
            sum = sum + (mult * (accNum[index]));
        }
        if (sum % DIVIDER == 0) {
            return true;
        }
        return false;
    }
}