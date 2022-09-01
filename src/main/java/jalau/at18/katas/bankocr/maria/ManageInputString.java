package jalau.at18.katas.bankocr.maria;

public class ManageInputString {
    ConvertNumber convertNumber = new ConvertNumber();
    public static final int NUMBER_COUNT = 3;
    public ManageInputString() {
    }

    public void divideString(String chainFile1, String chainFile2, String chainFile3) {
        String accountNumber = "";
        for (int count = 0, count1 = 0, count2 = 0; (count < chainFile1.length() && count1 < chainFile2.length() && count2 < chainFile3.length()); count = count + 3, count1 = count1 + 3, count2 = count2 + 3) {
            String chain = chainFile1.substring(count, count + NUMBER_COUNT);
            String chain1 = chainFile2.substring(count1, count1 + NUMBER_COUNT);
            String chain2 = chainFile3.substring(count2, count2 + NUMBER_COUNT);
            accountNumber = accountNumber + String.valueOf(convertNumber.convert(chain, chain1, chain2));
            //System.out.println(chain + chain1 + chain2);
        }
        System.out.println(accountNumber);
    }

}
