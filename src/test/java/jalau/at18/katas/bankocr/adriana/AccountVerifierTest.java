package jalau.at18.katas.bankocr.adriana;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AccountVerifierTest {
    
    @Test
    public void shoudlSayIsNumberAccountValid() {
        String line1 = " _     _  _  _  _  _  _    ";
        String line2 = " _|  | _|| ||_||_   || ||_|";
        String line3 = " _|  ||_ |_||_||_|  ||_|  |";
        String[] entry = {line1, line2, line3};
        Input input = new Input(entry);
        Account account = new Account(input.getDigits());
        AccountVerifier verifier = new AccountVerifier(account);
        assertEquals(" ERR", verifier.getStatusAccount());
        String line4 = " _     _  _  _  _  _  _  _ ";
        String line5 = " _||_||_ |_||_| _||_||_ |_ ";
        String line6 = " _|  | _||_||_||_ |_||_| _|";
        String[] entry1 = {line4, line5, line6};
        Input input1 = new Input(entry1);
        Account account1 = new Account(input1.getDigits());
        AccountVerifier verifier1 = new AccountVerifier(account1);
        assertEquals(" ", verifier1.getStatusAccount());
        String line7 = " _     _  _  _  _  _  _  _ ";
        String line8 = " _| _||_ |_||_| _| _ |_ |_ ";
        String line9 = " _|  | _ |_||_||_ |_||_| _|";
        String[] entry2 = {line7, line8, line9};
        Input input2 = new Input(entry2);
        Account account2 = new Account(input2.getDigits());
        AccountVerifier verifier2 = new AccountVerifier(account2);
        assertEquals(" ILL", verifier2.getStatusAccount());
    }

}