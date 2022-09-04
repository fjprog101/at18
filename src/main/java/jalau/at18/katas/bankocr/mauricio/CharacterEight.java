package jalau.at18.katas.bankocr.mauricio;

public class CharacterEight extends CharacterNumbers {
    @Override
    public String[][] character(CharValue value) {
        if (value == value.EIGHT) {
            return value.EIGHT.getcharacternumbers();
        }
        return value.ZERO.getcharacternumbers();
    }
}
