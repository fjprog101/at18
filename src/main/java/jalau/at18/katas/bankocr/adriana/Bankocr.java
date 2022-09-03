package jalau.at18.katas.bankocr.adriana;

public class Bankocr {
    private String[] entry;
    private Input input;
    private Account account;
    public Bankocr(String[] entry) {
        this.entry = entry;
        input = new Input(entry);
        account = new Account(input.getDigits());
    }
    public void run() {
        Print entryPrinter = new Print(new PrinterEntry(entry));
        entryPrinter.print();
        Print accountNumberPrinter = new Print(new PrinterAccountNumber(account));
        accountNumberPrinter.print();
        Print accountVerifierPrinter = new Print(new PrinterVerifier(account));
        accountVerifierPrinter.print();
    }

}
