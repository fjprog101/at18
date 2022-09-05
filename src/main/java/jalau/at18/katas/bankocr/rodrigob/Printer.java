package jalau.at18.katas.bankocr.rodrigob;

public class Printer {
    private ConvertDigits convertDigits = new ConvertDigits();
    private VerifyAccount verifyAccount = new VerifyAccount();

    public Printer() {
    }

    public String writeOutput(char[][] inputConverted) {
        String output = convertDigits.writeDigits(inputConverted);
        output += verifyAccount.getStatusAccount(output);
        return output;
    }
}
