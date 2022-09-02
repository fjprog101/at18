package jalau.at18.katas.bankocr.rodrigov;

import java.util.ArrayList;
import java.util.List;

public class CompareNumbers {
    private List<String> listOfNumbers = new ArrayList<>();
    private String[] numbers;
    private String accountNumber = "";

    public CompareNumbers(List<String> listArray, String[] numbers) {
        this.listOfNumbers = listArray;
        this.numbers = numbers;
    }
    public String showAccountNumber() {
        for (int index = 0; index < numbers.length; index++) {
            for (int jindex = 0; jindex < listOfNumbers.size(); jindex++) {
                if (numbers[index].intern() == listOfNumbers.get(jindex).intern()) {
                    accountNumber += jindex;
                }
            }
        }
        return accountNumber;
    }
}