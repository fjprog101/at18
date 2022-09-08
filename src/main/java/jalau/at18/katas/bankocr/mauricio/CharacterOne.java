package jalau.at18.katas.bankocr.mauricio;

public class CharacterOne extends CharacterNumbers {
    @Override
    public String[][] character(CharValue value) {
        return value.ONE.getcharacternumbers();
    }
}
