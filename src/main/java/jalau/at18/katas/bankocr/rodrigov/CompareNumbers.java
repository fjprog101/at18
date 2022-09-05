package jalau.at18.katas.bankocr.rodrigov;

import java.util.ArrayList;
import java.util.List;

public class CompareNumbers {
    private List<String> listArray = new ArrayList<>();
    private String[] numbers;
    private String accountNumber = "";

    public CompareNumbers(List<String> listArray, String[] numbers) {
        this.listArray = listArray;
        this.numbers = numbers;
    }

    public String showAccountNumber() {
        for (int index = 0; index < numbers.length; index++) {
            showAccoundSecondLoop(index);
        }
        return accountNumber;
    }

    public void showAccoundSecondLoop(int index) {
        for (int jindex = 0; jindex < listArray.size(); jindex++) {
            if (numbers[index].intern() == listArray.get(jindex).intern()) {
                accountNumber += jindex;
            }
        }
    }
}