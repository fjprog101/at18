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
        System.out.println(printEntry());
        System.out.println(account.getAccountNumber());
    }
    public int getAccountNumber() {
        return account.getAccountNumber();
    }
    public String printEntry() {
        String message = "";
        for (int index = 0; index < entry.length; index++) {
            message = message + entry[index] + "\n";
        }
        return message;
    }
}
