package jalau.at18.katas.bankocr.maria;

public class Main {
    public static void main(String[] args) {
        BankOCR bankOCR = new BankOCR();
        System.out.println(bankOCR.processAccountFromFile("numbers.txt"));
    }
}
