package jalau.at18.katas.bankocr.mauricio;

public class CharacterSeven extends CharacterNumbers {
    @Override
    public String[][] character(CharValue value) {
        if (value == value.SEVEN) {
            return value.SEVEN.getcharacternumbers();
        } else {
            return value.ZERO.getcharacternumbers();
        }
    }
}
