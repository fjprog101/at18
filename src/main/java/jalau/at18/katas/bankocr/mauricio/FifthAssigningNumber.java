package jalau.at18.katas.bankocr.mauricio;

public class FifthAssigningNumber {
    private CharacterNumbers number = new CharacterNumbers();
    private String[][] numOut;

    public String[][] chooseChar(int num) {
        numOut = new CreateCharacter(CharValue.NINE, new BuildNumber(CharValue.NINE, number)).makeNumber();
        return numOut;
    }
}
