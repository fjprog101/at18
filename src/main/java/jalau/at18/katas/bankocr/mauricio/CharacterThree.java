package jalau.at18.katas.bankocr.mauricio;

public class CharacterThree extends CharacterNumbers {
    @Override
    public String[][] character(CharValue value) {
        if (value == value.THREE) {
            return value.THREE.getcharacternumbers();
        } else {
            return value.ZERO.getcharacternumbers();
        }
    }
}
