package jalau.at18.katas.bankocr.adriana;

public class PrinterAccountNumber extends Printers {
    private Account account;
    private String number;

    public PrinterAccountNumber(Account account) {
        this.account = account;
        number = "";
    }

    @Override
    String getMessage() {
        for (int index = 0; index < account.getAccountNumber().length; index++) {
            number += giveValue(account.getAccountNumber()[index]);
        }
        return number;
    }
    public String giveValue(String digit) {
        if (digit == "-1") {
            digit = "?";
        }
        return digit;
    }

}
