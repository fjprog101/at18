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
    public void print() {
        System.out.println(printEntry());
        System.out.print(getAccountNumber());
        System.out.println(printStatus());
    }
    public String getAccountNumber() {
        String number = "";
        for (int index = 0; index < account.getAccountNumber().length; index++) {
            if (account.getAccountNumber()[index] == "-1") {
                number += "?";
            } else {
                number += account.getAccountNumber()[index];
            }
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
    public String printStatus() {
        AccountVerifier verifier = new AccountVerifier(account);
        return verifier.getStatusAccount();
    }

}
