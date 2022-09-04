package jalau.at18.katas.bankocr.maria;

public class ConvertAccount {
    private ConvertNumber convertNumber = new ConvertNumber();
    public static final int NUMBER_COUNT = 3;

    public String convertLinesToAccount(String linesFile1, String linesFile2, String linesFile3) {
        String accountNumber = "";
        for (int count = 0; count < linesFile1.length(); count = count + NUMBER_COUNT) {
            String chain1 = linesFile2.substring(count, count + NUMBER_COUNT);
            String chain2 = linesFile3.substring(count, count + NUMBER_COUNT);
            accountNumber = accountNumber + String.valueOf(convertNumber.convert(linesFile1.substring(count, count + NUMBER_COUNT), chain1, chain2));
        }
        return accountNumber;
    }
}
