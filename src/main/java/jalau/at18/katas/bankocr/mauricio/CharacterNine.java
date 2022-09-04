package jalau.at18.katas.bankocr.mauricio;

public class CharacterNine extends CharacterNumbers {
    @Override
    public String[][] character(CharValue value) {
        if (value == value.NINE) {
            return value.NINE.getcharacternumbers();
        }
        return value.ZERO.getcharacternumbers();
    }
}
