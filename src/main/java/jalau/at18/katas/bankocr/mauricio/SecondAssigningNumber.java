package jalau.at18.katas.bankocr.mauricio;

public class SecondAssigningNumber {
    private ThirdAssigningNumber thirdAssignment = new ThirdAssigningNumber();
    private CharacterNumbers number = new CharacterNumbers();
    private String[][] numOut;
    private final int three = 3;
    private final int four = 4;

    public String[][] chooseChar(int num) {
        if (num == three) {
            numOut = new CreateCharacter(CharValue.THREE, new BuildNumber(CharValue.THREE, number)).makeNumber();
            return numOut;
        } else if (num == four) {
            numOut = new CreateCharacter(CharValue.FOUR, new BuildNumber(CharValue.FOUR, number)).makeNumber();
            return numOut;
        }
        return thirdAssignment.chooseChar(num);
    }
}
