package jalau.at18.katas.bankocr.daniela;

public class Separeinthree extends AnalyzedDigit {
    private static final int ZISE = 3;
    private final String analyzedline1;
    private final String analyzedline2;
    private final String analyzedline3;

    public Separeinthree(String line1, String line2, String line3) {
        this.analyzedline1 = line1;
        this.analyzedline2 = line2;
        this.analyzedline3 = line3;
    }

    @Override
    String hasSameLinesAs1(String line1, int searchminvalue) {
        return line1.substring(searchminvalue, searchminvalue + ZISE);
    }

    @Override
    String hasSameLinesAs2(String line2, int searchminvalue) {
        return line2.substring(searchminvalue, searchminvalue + ZISE);
    }

    @Override
    String hasSameLinesAs3(String line3, int searchminvalue) {
        return line3.substring(searchminvalue, searchminvalue + ZISE);
    }
}
