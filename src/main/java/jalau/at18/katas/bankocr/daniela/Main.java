package jalau.at18.katas.bankocr.daniela;

public class Main {

        public static void main(String[] args) {
                int sizenumbers1 = 27;
                int sizeValue = 9;
                int total = 0;
                int finalresult = 0;
                String status = "";
                // 457508000 //account correct
                // 664371495 //account incorrect
                String line11 = " _  _     _  _        _  _ ";
                String line21 = "|_ |_ |_| _|  |  ||_||_||_ ";
                String line31 = "|_||_|  | _|  |  |  |  | _|";
                String line1 = "    _  _  _  _  _  _  _  _ ";
                String line2 = "|_||_   ||_ | ||_|| || || |";
                String line3 = "  | _|  | _||_||_||_||_||_|";
                String line12 = "    _  _     _  _  _  _  _ ";
                String line22 = "  | _| _||_||_ |    || || |";
                String line32 = "  ||_  _|  | _||_|  ||_   |";
                BankAccount account1 = new BankAccount(line1, line2, line3, sizenumbers1);
                BankAccount account2 = new BankAccount(line11, line21, line31, sizenumbers1);
                BankAccount account3 = new BankAccount(line12, line22, line32, sizenumbers1);
                CheckSumResult accountreview = new CheckSumResult(line1, line2, line3,
                                sizeValue, sizenumbers1);
                CheckSumResult accountreview2 = new CheckSumResult(line11, line21, line31,
                                sizeValue, sizenumbers1);
                StatusAccount accountreview3 = new StatusAccount(line12, line22, line32, sizeValue, sizenumbers1);
                System.out.println("Cuenta comprobada: " + "\n" + account1.getDigitChar() + " "
                                + accountreview.checkSum(total,
                                                finalresult)
                                + "\n" + account2.getDigitChar() + " "
                                + accountreview2.checkSum(total,
                                                finalresult)
                                + "\n" + account3.getDigitChar() + " "
                                + accountreview3.statusDigits(status, total));
        }
}
