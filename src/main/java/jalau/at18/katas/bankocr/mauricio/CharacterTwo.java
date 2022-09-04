package jalau.at18.katas.bankocr.mauricio;

public class CharacterTwo extends CharacterNumbers {
    @Override
    public String[][] character(CharValue value) {
        if (value == value.TWO) {
            return value.TWO.getcharacternumbers();
        } else {
            return value.ZERO.getcharacternumbers();
        }
    }
}
