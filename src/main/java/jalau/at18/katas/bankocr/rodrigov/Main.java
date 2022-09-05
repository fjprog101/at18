package jalau.at18.katas.bankocr.rodrigov;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        PrintNumberAccount printNumberAccount = new PrintNumberAccount();
        Printer printer = new Printer();
        printer.printArrayLines();
        printNumberAccount.printAccount();
    }
}
