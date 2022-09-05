package jalau.at18.katas.bankocr.fernanda;

public class Checksum {
    private static final int MOD = 11;
    private static final int TEN = 10;

    private int multiplicationOfNum = 1;

    public boolean checkNumberIsValid(int numberToValidate) {
        int multiOfNumber = getMultiplicationOfNumber(numberToValidate);
        if (multiOfNumber % MOD == 0) {
            return true;
        }
        return false;
    }

    public int getMultiplicationOfNumber(int numToValidate) {
        for (int checksumadd = 2; numToValidate > 0 && checksumadd < TEN; checksumadd++) {
            multiplicationOfNum = multiplicationOfNum * ((numToValidate % TEN) + checksumadd);
            numToValidate = numToValidate / TEN;
        }
        multiplicationOfNum = multiplicationOfNum * numToValidate;
        return multiplicationOfNum;
    }
}
