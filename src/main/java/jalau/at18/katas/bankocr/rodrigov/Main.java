package jalau.at18.katas.bankocr.rodrigov;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        CheckAccount checkAccount = new CheckAccount();
        Printer printer = new Printer();
        printer.printArrayLines();
        System.out.println(checkAccount.returnNumberAccount());
    }
}
