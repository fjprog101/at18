package jalau.at18.katas.bankocr.maria;

import java.util.List;

public class CheckSum {
    public static final int MODULE_NUMBER = 11;
    private String account = "";
    private ReverseAccountNumber reverseAccountNumber;

    public CheckSum(String account) {
        this.account = account;
        reverseAccountNumber = new ReverseAccountNumber();
    }

    public boolean isValidAccountNumber() {
        return sumNumbers() % MODULE_NUMBER == 0;
    }

    private int sumNumbers() {
        List<Integer> reverseNumbers = reverseAccountNumber.reverseAccountNumber(account);
        int sumTotal = 0;
        int increment = 1;
        for (Integer element : reverseNumbers) {
            sumTotal = sumTotal + increment * element;
            increment++;
        }
        return sumTotal;
    }
}
