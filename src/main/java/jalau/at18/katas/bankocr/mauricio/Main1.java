package jalau.at18.katas.bankocr.mauricio;

public class Main1 {
    public static void main(String[] arg) {
        final int one = 1;
        final int two = 2;
        final int three = 3;
        final int four = 4;
        final int five = 5;
        final int six = 6;
        final int seven = 7;
        final int eight = 8;
        IntroduceNumbers listNumbers = new IntroduceNumbers();
        ShowNumbers show = new ShowNumbers();
        Checksum checksum = new Checksum();
        IllegibleOrNotChecksumAccount illegibleOrChecksum = new IllegibleOrNotChecksumAccount();
        // This line fulfills with User Story 3
        int[] listChoose = {three, four, five, eight, eight, two, eight, six, five};
        illegibleOrChecksum.checkMistakes(listChoose);
        if (checksum.calculationChecksum(listChoose)) {
            String[][][] numbersToVisualize = listNumbers.introduceYourNumbers(listChoose);
            show.showNumberSelected(numbersToVisualize);
        }
    }
}
