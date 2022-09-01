package jalau.at18.katas.bankocr.maria;

public class ZeroNumber extends TypeNumber {
    public ZeroNumber() {
        super();
    }

    @Override
    public int whatNumberI(String firstColumn, String secondColumn, String thirdColumn) {
        int number = 0;
        if (firstColumn.equals(" _ ") && secondColumn.equals("| |") & thirdColumn.equals("|_|")) {
            number = 0;
        }
        return number;
    }
}
