package jalau.at18.katas.bankocr.maria;

public class ConvertAccount {
    private ConvertNumber convertNumber;
    public static final int NUMBER_COUNT = 3;

    public ConvertAccount(ConvertNumber convertNumber) {
        this.convertNumber = convertNumber;
    }

    //Of three lines, get a column of everyone and convert these in a digit or ?
    public String convertLinesToAccount(String linesFile1, String linesFile2, String linesFile3) {
        String accountNumber = "";
        for (int count = 0; count < linesFile1.length(); count = count + NUMBER_COUNT) {
            String partDigit1 = linesFile1.substring(count, count + NUMBER_COUNT);
            String partDigit2 = linesFile2.substring(count, count + NUMBER_COUNT);
            String partDigit3 = linesFile3.substring(count, count + NUMBER_COUNT);
            accountNumber = accountNumber + isDigitCorrect(partDigit1, partDigit2, partDigit3);
        }
        return accountNumber;
    }

    public String isDigitCorrect(String partDigit1, String partDigit2, String partDigit3) {
        int isDigitCorrect = convertNumber.convert(partDigit1, partDigit2, partDigit3);
        if (isDigitCorrect != -1) {
            return String.valueOf(isDigitCorrect);
        } else {
            return "?";
        }
    }
}
