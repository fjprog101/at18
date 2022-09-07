package jalau.at18.katas.bankocr.rodrigov;

import java.io.FileNotFoundException;

public class AccountVerification {
    private PrintNumberAccount printNumberAccount;
    private int cont = 2;
    private String[] accountNumber;
    private int contador;
    public AccountVerification() throws FileNotFoundException {
        printNumberAccount = new PrintNumberAccount();
        accountNumber = printNumberAccount.printAccount().split("");
        contador = Integer.parseInt(accountNumber[accountNumber.length - 1]);
    }

    public int checkSum() {
        for (int index = accountNumber.length - 2; index >= 0; index--) {
            contador = contador + (cont * Integer.parseInt(accountNumber[index]));
            cont++;
        }
        return contador;
    }
    public String[] getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String[] accountNumberBank) {
        this.accountNumber = accountNumberBank;
    }
}