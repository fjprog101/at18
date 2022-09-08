package jalau.at18.katas.bankocr.rodrigov;

import java.io.FileNotFoundException;

public class CheckSum {
    private AccountVerification accountVerification;
    private final int modNumber = 11;
    private boolean result;
    private int numberSum;

    public int getNumberSum() {
        return numberSum;
    }

    public void setNumberSum(int numberSumCheck) {
        this.numberSum = numberSumCheck;
    }

    public CheckSum() throws FileNotFoundException {
        accountVerification = new AccountVerification();
        numberSum = accountVerification.checkSum();
    }

    public boolean verificateCheckSum() {
        result = numberSum % modNumber == 0 ? true : false;
        return result;
    }
}
