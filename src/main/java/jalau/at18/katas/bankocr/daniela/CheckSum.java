package jalau.at18.katas.bankocr.daniela;

public class CheckSum extends BankAccount {
    private int sizeValue;
    private String entry = getDigitChar();

    public CheckSum(String line1, String line2, String line3, int sizeValue, int sizenumbers) {
        super(line1, line2, line3, sizenumbers);
        this.sizeValue = sizeValue;
    }

    public int getziseValue() {
        return sizeValue;
    }

    public String[] letsSplitValue() {
        String[] arrOfStr = entry.split("");
        return arrOfStr;
    }

    public int result(int total) {
        int finallook = getziseValue();
        for (String positionnumber : letsSplitValue()) {
            total += (Integer.parseInt(positionnumber) * (finallook--));
        }
        return total;
    }

}
