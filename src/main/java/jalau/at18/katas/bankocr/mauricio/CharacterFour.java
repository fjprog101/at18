package jalau.at18.katas.bankocr.mauricio;

public class CharacterFour extends CharacterNumbers {
    @Override
    public String[][] character(CharValue value) {
        if (value == value.FOUR) {
            return value.FOUR.getcharacternumbers();
        } else {
            return value.ZERO.getcharacternumbers();
        }
    }
}
