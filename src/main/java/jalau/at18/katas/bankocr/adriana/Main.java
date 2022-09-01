package jalau.at18.katas.bankocr.adriana;

public class Main {
    public static void main(String[] args) {
        String strin1 = " _     _  _  _  _  _  _    ";
        String strin2 = " _|  | _|| ||_||_   || ||_|";
        String strin3 = " _|  ||_ |_||_||_|  ||_|  |";
        String[] entry = {strin1, strin2, strin3};
        Input input = new Input(entry);
        Account account = new Account(input.getDigits());
        System.out.println(account.getAccountNumber());
    }
}
