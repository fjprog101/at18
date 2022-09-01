package jalau.at18.katas.bankocr.mauricio;

public class Checksum {
    private final int one = 1;
    private final int two = 2;
    private final int three = 3;
    private final int four = 4;
    private final int five = 5;
    private final int six = 6;
    private final int seven = 7;
    private final int eight = 8;
    private final int nine = 9;
    private final int eleven = 11;

    public boolean calculationChecksum(int[] listNumbers) {
        int formula = (listNumbers[eight] + two * listNumbers[seven] + three * listNumbers[six]
                + four * listNumbers[five]
                + five * listNumbers[four] + six * listNumbers[three] + seven * listNumbers[two]
                + eight * listNumbers[one]
                + nine * listNumbers[0]);
        if (formula % eleven == 0) {
            System.out.println("Validated number account");
            return true;
        }
        System.out.println("Not Validated number account");
        return false;
    }

}
