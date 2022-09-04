package jalau.at18.katas.bankocr.mauricio;

public class CharacterOne extends CharacterNumbers {
    @Override
    public String[][] character(CharValue value) {
        if (value == value.ONE) {
            return value.ONE.getcharacternumbers();
        } else {
            return value.ZERO.getcharacternumbers();
        }
    }
}
