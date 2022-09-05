package jalau.at18.katas.bankocr.daniela;

public class Separatedigits extends AnalyzedDigit {
    private static final int SIZE = 3;
    private final String firstline;
    private final String secondline;
    private final String thirdline;

    public Separatedigits(String line1, String line2, String line3) {
        this.firstline = line1;
        this.secondline = line2;
        this.thirdline = line3;
    }

    @Override
    String hasSameLinesAs1(String line1, int searchminvalue) {
        return line1.substring(searchminvalue, searchminvalue + SIZE);
    }

    @Override
    String hasSameLinesAs2(String line2, int searchminvalue) {
        return line2.substring(searchminvalue, searchminvalue + SIZE);
    }

    @Override
    String hasSameLinesAs3(String line3, int searchminvalue) {
        return line3.substring(searchminvalue, searchminvalue + SIZE);
    }
}
