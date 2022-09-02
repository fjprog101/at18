package jalau.at18.katas.bankocr.mauricio;

public class IllegibleOrNotChecksumAccount {
    private final int one = 1;
    private final int two = 2;
    private final int three = 3;
    private final int four = 4;
    private final int five = 5;
    private final int six = 6;
    private final int seven = 7;
    private final int eight = 8;
    private Illegible illegible = new Illegible();
    private Checksum checksum = new Checksum();

    public void checkMistakes(int[] listNumbers) {
        if (checksum.calculationChecksum(listNumbers) && illegible.illegibleNumber(listNumbers)) {
            System.out.println(
                    listNumbers[0] + "" + listNumbers[one] + "" + listNumbers[two] + "" + listNumbers[three] + ""
                            + listNumbers[four] + "" + listNumbers[five] + "" + listNumbers[six] + "" + listNumbers[seven]
                            + "" + listNumbers[eight]);
        } else if (illegible.illegibleNumber(listNumbers)) {
            System.out.println(
                    listNumbers[0] + "" + listNumbers[one] + "" + listNumbers[two] + "" + listNumbers[three] + ""
                            + listNumbers[four] + "" + listNumbers[five] + "" + listNumbers[six] + "" + listNumbers[seven]
                            + "" + listNumbers[eight] + " ERR");
        } else {
            System.out.println("Illegible");
        }
    }
}
