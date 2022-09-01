package jalau.at18.katas.bankocr.adriana;

public class Bankocr {
    private static final int NUMBER_TEN = 10;
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
        System.out.println(getAccountNumber());
        System.out.println("Is a valid account number: " + new AccountVerifier(account).isValidAccountNumber());
    }
    public int getAccountNumber() {
        int number = 0;
        for (int index = account.getAccountNumber().length - 1; index >= 0; index--) {
            number += account.getAccountNumber()[index] * Math.pow(NUMBER_TEN, account.getAccountNumber().length - index - 1);
        }
        return number;
    }
    public String printEntry() {
        String message = "";
        for (int index = 0; index < entry.length; index++) {
            message = message + entry[index] + "\n";
        }
        return message;
    }
}
