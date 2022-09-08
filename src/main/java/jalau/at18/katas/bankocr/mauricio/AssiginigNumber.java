package jalau.at18.katas.bankocr.mauricio;

public class AssiginigNumber {
    private CharacterNumbers number;
    private CharValue value;
    private String[][] numOut;

    public AssiginigNumber(CharValue value, CharacterNumbers number) {
        this.value = value;
        this.number = number;
    }

    public String[][] chooseChar() {
        numOut = new CreateCharacter(value, new BuildNumber(value, number)).makeNumber();
        return numOut;
    }
}
