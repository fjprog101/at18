package jalau.at18.katas.bankocr.mauricio;

public class CharacterSix extends CharacterNumbers {
    @Override
    public String[][] character(CharValue value) {
        if (value == value.SIX) {
            return value.SIX.getcharacternumbers();
        } else {
            return value.ZERO.getcharacternumbers();
        }
    }
}
