package jalau.at18.katas.bankocr.rodrigov;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ReadFile readFile = new ReadFile();
        SplitDigit splitDigit = new SplitDigit(readFile.getLines());
        Digits digits = new Digits();
        CompareNumbers compareNumbers = new CompareNumbers(digits.getListOfNumbers(), splitDigit.getDigits());
        readFile.readAccountsTxt();
        readFile.printMatrix();
        splitDigit.splitNumbers();
        System.out.println(compareNumbers.showAccountNumber());
    }
}
