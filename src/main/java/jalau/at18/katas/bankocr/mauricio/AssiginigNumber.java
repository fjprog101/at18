package jalau.at18.katas.bankocr.mauricio;

public class AssiginigNumber {
    private SecondAssigningNumber secondAssingment = new SecondAssigningNumber();
    private CharacterNumbers number = new CharacterNumbers();
    private String[][] numOut;
    private final int one = 1;
    private final int two = 2;

    public String[][] chooseChar(int num) {
        if (num == one) {
            numOut = new CreateCharacter(CharValue.ONE, new BuildNumber(CharValue.ONE, number)).makeNumber();
            return numOut;
        } else if (num == two) {
            numOut = new CreateCharacter(CharValue.TWO, new BuildNumber(CharValue.TWO, number)).makeNumber();
            return numOut;
        }
        return secondAssingment.chooseChar(num);
    }
}
