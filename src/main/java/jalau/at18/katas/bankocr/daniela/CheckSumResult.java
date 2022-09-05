package jalau.at18.katas.bankocr.daniela;

public class CheckSumResult extends CheckSum {
    private static final int MODULE = 11;

    public CheckSumResult(String line1, String line2, String line3, int sizeValue, int sizenumbers) {
        super(line1, line2, line3, sizeValue, sizenumbers);
    }

    public String checkSum(int total, int finalresult) {
        finalresult = result(total) % MODULE;
        if (finalresult == 0) {
            return "OK";
        }
        return "ERR";
    }

}
