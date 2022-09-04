package jalau.at18.katas.bankocr.daniela;

public class Main {

    public static void main(String[] args) {
        int sizenumbers1 = 27;
        int sizeValue = 9;
        int total = 0;
        int finalresult = 0;
        // 457508000 //account correct
        // 664371495 //account incorrect
        String line11 = " _  _     _  _        _  _ ";
        String line21 = "|_ |_ |_| _|  |  ||_||_||_ ";
        String line31 = "|_||_|  | _|  |  |  |  | _|";
        BankAccount account1 = new BankAccount(line11, line21, line31, sizenumbers1);
        System.out.printf("Cuentas" + account1.getDigitChar());
        CheckSumResult accountreview = new CheckSumResult(line11, line21, line31, sizeValue, sizenumbers1);
        System.out.println("The status of the account it's: " + accountreview.checkSum(total, finalresult));
        // assertThat(account1.getDigitChar(), equalTo("12345?789"));
    }
}
