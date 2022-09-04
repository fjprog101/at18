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

    public String checkMistakes(int[] listNumbers) {
        String listNumbersStr = String.valueOf(listNumbers[0]) + "" + String.valueOf(listNumbers[one]) + ""
                + String.valueOf(listNumbers[two]) + "" + String.valueOf(listNumbers[three]) + ""
                + String.valueOf(listNumbers[four]) + "" + String.valueOf(listNumbers[five]) + ""
                + String.valueOf(listNumbers[six]) + "" + String.valueOf(listNumbers[seven]) + ""
                + String.valueOf(listNumbers[eight]);
        if (checksum.calculationChecksum(listNumbers) && illegible.illegibleNumber(listNumbers)) {
            System.out.println(listNumbersStr);
            return listNumbersStr;
        } else if (illegible.illegibleNumber(listNumbers)) {
            System.out.println(listNumbersStr + " ERR");
            return listNumbersStr + " ERR";
        } else {
            System.out.println("Illegible");
            return listNumbersStr;
        }
    }
}
