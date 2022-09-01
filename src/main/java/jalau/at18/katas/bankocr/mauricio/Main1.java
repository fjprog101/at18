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
        final int nine = 9;
        int[] listChoose = {two, three, three, five, six, six, seven, nine, eight};
        IntroduceNumbers listNumbers = new IntroduceNumbers();
        ShowFirstThreeNumbers show = new ShowFirstThreeNumbers();
        Checksum checksum = new Checksum();
        if (checksum.calculationChecksum(listChoose)) {
            String[][][] numbersToVisualize = listNumbers.introduceYourNumbers(listChoose);
            show.showNumberSelected(numbersToVisualize[0], numbersToVisualize[1], numbersToVisualize[2]);
        }
    }
}
