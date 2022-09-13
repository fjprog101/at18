package jalau.at18.katas.bankocr.mauricio;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] arg) {
        ArrayList<Integer> initialList = new ArrayList<Integer>();
        IntroduceNumbers listNumbers = new IntroduceNumbers();
        ShowNumbers show = new ShowNumbers();
        Checksum checksum = new Checksum();
        IllegibleOrNotChecksumAccount illegibleOrChecksum = new IllegibleOrNotChecksumAccount();
        int[] accountNumber = new MakeTheList().makeAList(initialList);

        illegibleOrChecksum.checkMistakes(accountNumber);

        if (checksum.calculationChecksum(accountNumber)) {
            String[][][] numbersToVisualize = listNumbers.introduceYourNumbers(accountNumber);
            show.showNumberSelected(numbersToVisualize);
        }
    }
}
