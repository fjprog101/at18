package jalau.at18.katas.bankocr.rodrigov;

import java.util.ArrayList;
import java.util.List;

public class CompareNumbers {
    List<String> listOfNumbers = new ArrayList<>();
    String[] numbers;
    String accountNumber = "";

    public CompareNumbers(List<String> listArray, String[] numbers){
        this.listOfNumbers = listArray;
        this.numbers = numbers;
    }

    public String showAccountNumber(){
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < listOfNumbers.size(); j++) {
                if(numbers[i].intern() == listOfNumbers.get(j).intern()){
                   // System.out.println(j+1);
                    accountNumber += j;
                }
            }
        }
        return accountNumber;
    }

}