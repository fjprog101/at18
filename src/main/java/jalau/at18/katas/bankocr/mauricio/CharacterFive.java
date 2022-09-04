package jalau.at18.katas.bankocr.mauricio;

public class CharacterFive extends CharacterNumbers {
    @Override
    public String[][] character(CharValue value) {
        if (value == value.FIVE) {
            return value.FIVE.getcharacternumbers();
        }
        return value.ZERO.getcharacternumbers();
    }
}
