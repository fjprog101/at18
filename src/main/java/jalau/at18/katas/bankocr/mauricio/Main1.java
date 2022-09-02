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
        // 3  4  5  8  8  2  8  6  5
        int[] listChoose = {three, four, five, eight, eight, two, eight, six, five};
        IntroduceNumbers listNumbers = new IntroduceNumbers();
        ShowFirstThreeNumbers show = new ShowFirstThreeNumbers();
        Checksum checksum = new Checksum();
        if (checksum.calculationChecksum(listChoose)) {
            String[][][] numbersToVisualize = listNumbers.introduceYourNumbers(listChoose);
            show.showNumberSelected(numbersToVisualize[0], numbersToVisualize[one], numbersToVisualize[two]);
            show.showNumberSelected(numbersToVisualize[three], numbersToVisualize[four], numbersToVisualize[five]);
            show.showNumberSelected(numbersToVisualize[six], numbersToVisualize[seven], numbersToVisualize[eight]);
        }
    }
}
