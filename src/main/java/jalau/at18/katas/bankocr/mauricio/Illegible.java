package jalau.at18.katas.bankocr.mauricio;

import java.util.ArrayList;

public class Illegible {
    private final int nine = 9;
    private final String questionMark = "?";
    private ArrayList<Object> listNumbersOrWrongCharacters = new ArrayList<Object>();
    private IllegibleSecondPart illegiblePart2 = new IllegibleSecondPart();

    public Boolean illegibleNumber(int[] listNumbers) {
        for (int index = 0; index < listNumbers.length; index++) {
            if (listNumbers[index] >= 0 && listNumbers[index] <= nine) {
                listNumbersOrWrongCharacters.add(listNumbers[index]);
            } else {
                String unknownNumber = String.valueOf(listNumbers[index]);
                unknownNumber = questionMark;
                listNumbersOrWrongCharacters.add(unknownNumber);
            }
        }
        return illegiblePart2.checkNumbers(listNumbers, listNumbersOrWrongCharacters);
    }
}
