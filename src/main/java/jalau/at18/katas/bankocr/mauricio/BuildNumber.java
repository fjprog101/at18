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
        matNumber = number.character(value);
        return matNumber;
    }
}
