package jalau.at18.katas.bankocr.maria;

public class ManageInputString {
    private ConvertNumber convertNumber = new ConvertNumber();
    public static final int NUMBER_COUNT = 3;
    public ManageInputString() {
    }

    public void divideString(String chainFile1, String chainFile2, String chainFile3) {
        String accountNumber = "";
        for (int count = 0; count < chainFile1.length(); count = count + NUMBER_COUNT) {
            String chain = chainFile1.substring(count, count + NUMBER_COUNT);
            String chain1 = chainFile2.substring(count, count + NUMBER_COUNT);
            String chain2 = chainFile3.substring(count, count + NUMBER_COUNT);
            accountNumber = accountNumber + String.valueOf(convertNumber.convert(chain, chain1, chain2));
        }
        System.out.println(accountNumber);
    }
}
