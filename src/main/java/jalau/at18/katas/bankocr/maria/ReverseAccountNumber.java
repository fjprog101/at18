package jalau.at18.katas.bankocr.maria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseAccountNumber {

    public List<Integer> reverseAccountNumber(String account) {
        List<Integer> accountNumber = convertNumber(account);
        Collections.reverse(accountNumber);
        return accountNumber;
    }

    public List<Integer> convertNumber(String account) {
        List<Integer> accountNumber = charArrayToInt(account.toCharArray());
        return accountNumber;
    }

    public List<Integer> charArrayToInt(char[] accountNumberChar) {
        List<Integer> listInteger = new ArrayList<>();
        for (int count = 0; count < accountNumberChar.length; count++) {
            listInteger.add(Integer.valueOf(String.valueOf(accountNumberChar[count])));
        }
        return listInteger;
    }
}
