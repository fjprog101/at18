package jalau.at18.katas.bankocr.maria;

public class ConvertNumber {
    public int convert(String firstColumn, String secondColumn, String thirdColumn) {
        int number = 0;
        ZeroNumber zeroNumber = new ZeroNumber();
        number = zeroNumber.whatNumberI(" _ ", "| |", "|_|");
        if (number == 0) {
            number = 0;
        }
        return number;
    }
}
