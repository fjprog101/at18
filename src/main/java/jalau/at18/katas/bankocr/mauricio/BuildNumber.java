package jalau.at18.katas.bankocr.mauricio;

public class BuildNumber {

    private String[][] matNumber;
    private CharValue value;
    private CharacterNumbers number;

    public BuildNumber(CharValue value, CharacterNumbers number) {
        this.value = value;
        this.number = number;
    }

    public String[][] buildANumber() {
        if (value == value.ONE) {
            matNumber = number.characterForOne();
        } else if (value == value.TWO) {
            matNumber = number.characterForTwo();
        } else if (value == value.THREE) {
            matNumber = number.characterForThree();
        } else if (value == value.FOUR) {
            matNumber = number.characterForFour();
        } else if (value == value.FIVE) {
            matNumber = number.characterForFive();
        } else if (value == value.SIX) {
            matNumber = number.characterForSix();
        } else if (value == value.SEVEN) {
            matNumber = number.characterForSeven();
        } else if (value == value.EIGHT) {
            matNumber = number.characterForEight();
        } else {
            matNumber = number.characterForNine();
        }
        return matNumber;
    }
}
