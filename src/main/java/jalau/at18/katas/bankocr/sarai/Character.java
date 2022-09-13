package jalau.at18.katas.bankocr.sarai;

import java.util.Arrays;

public class Character {
    private static final int NINE = 9;
    private String[] oneDigit;
    private int index;
    private boolean digit = false;

    public Character(String[] oneDigit) {
        this.oneDigit = oneDigit;
    }

    public String getValue() {
        for (this.index = 0; !digit && this.index <= NINE; this.index++) {
            digit = compareIfNumbersAreEqual(oneDigit, EachCharacter.values()[this.index].getEachCharacter());
        }
        return validcharacter();
    }
    public String validcharacter() {
        if (digit) {
            return EachCharacter.values()[this.index - 1].ordinal() + "";
        } else {
            return "?";
        }
    }

    public Boolean compareIfNumbersAreEqual(String[] newoneDigit, String[] numberofEachCharacter) {
        if (Arrays.deepEquals(newoneDigit, numberofEachCharacter)) {
            return true;
        }
        return false;
    }
}
