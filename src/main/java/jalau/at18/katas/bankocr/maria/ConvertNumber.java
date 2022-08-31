package jalau.at18.katas.bankocr.maria;

public class ConvertNumber {
    public int convert(String firstColumn, String secondColumn, String thirdColumn) {
        int number = 0;
        if (firstColumn.equals(" _ ") && secondColumn.equals("| |") & thirdColumn.equals("|_|")) {
            number = 0;
        } else if (firstColumn.equals("   ") && secondColumn.equals("  |") & thirdColumn.equals("  |")) {
            number = 1;
        }
        return number;
    }
}
