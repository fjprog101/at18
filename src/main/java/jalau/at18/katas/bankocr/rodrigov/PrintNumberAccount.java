package jalau.at18.katas.bankocr.rodrigov;
import java.io.FileNotFoundException;
public class PrintNumberAccount {
    private SplitDigit splitDigit = new SplitDigit();
    private Digits digits = new Digits();
    private CompareNumbers compareNumbers;

    public PrintNumberAccount() throws FileNotFoundException {
        splitDigit.splitNumbers();
        digits.addDigitsFirstPart();
        digits.addDigitsSecondPart();
        compareNumbers  = new CompareNumbers(digits.getListOfNumbers(), splitDigit.getDigits());
    }

    public void printAccount() {
        System.out.println(compareNumbers.showAccountNumber());
    }
}
