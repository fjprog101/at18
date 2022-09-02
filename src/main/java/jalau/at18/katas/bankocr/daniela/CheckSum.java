package jalau.at18.katas.bankocr.daniela;

public class CheckSum extends BankAccount {
    private static final int MODULE = 11;
    private int sizeValue;

    public CheckSum(String line1, String line2, String line3, int sizeValue, int sizenumbers) {
        super(line1, line2, line3, sizenumbers);
        this.sizeValue = sizeValue;
    }

    public int getziseValue() {
        return sizeValue;
    }

    public String[] letsSplitValue() {
        String entry = getDigitChar();
        String[] arrOfStr = entry.split("");
        return arrOfStr;
    }

    public int result(int value, int total) {
        String summatory = "";
        int finallook = getziseValue();
        for (String positionnumber : letsSplitValue()) {
            summatory += positionnumber;
            value = Integer.parseInt(summatory);
            finallook--;
            total += value * finallook;
            summatory = "0";
        }
        return total;
    }

    public boolean checkSum(int value, int total, int finalresult) {
        finalresult = result(value, total) % MODULE;
        if (finalresult == 0) {
            return true;
        }
        return false;
    }
}
