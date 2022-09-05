package jalau.at18.katas.bankocr.mauricio;

import java.util.ArrayList;

public class IllegibleSecondPart {
    private final int one = 1;
    private final int two = 2;
    private final int three = 3;
    private final int four = 4;
    private final int five = 5;
    private final int six = 6;
    private final int seven = 7;
    private final int eight = 8;
    private final String questionMark = "?";

    public Boolean checkNumbers(int[] listNumbers, ArrayList<Object> listNumbersOrWrongCharacters) {
        for (int index = 0; index < listNumbers.length; index++) {
            if (listNumbersOrWrongCharacters.get(index) == questionMark) {
                System.out.println(listNumbersOrWrongCharacters.get(0).toString()
                        + listNumbersOrWrongCharacters.get(one).toString()
                        + listNumbersOrWrongCharacters.get(two).toString()
                        + listNumbersOrWrongCharacters.get(three).toString()
                        + listNumbersOrWrongCharacters.get(four).toString()
                        + listNumbersOrWrongCharacters.get(five).toString()
                        + listNumbersOrWrongCharacters.get(six).toString()
                        + listNumbersOrWrongCharacters.get(seven).toString()
                        + listNumbersOrWrongCharacters.get(eight).toString() + " ILL");
                return false;
            }
        }
        return true;
    }
}
