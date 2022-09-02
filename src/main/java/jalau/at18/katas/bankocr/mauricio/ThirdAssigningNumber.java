package jalau.at18.katas.bankocr.mauricio;

public class ThirdAssigningNumber {
    private FourthAssigningNumber fourthAssignment = new FourthAssigningNumber();
    private CharacterNumbers number = new CharacterNumbers();
    private String[][] numOut;
    private final int five = 5;
    private final int six = 6;

    public String[][] chooseChar(int num) {
        if (num == five) {
            numOut = new CreateCharacter(CharValue.FIVE, new BuildNumber(CharValue.FIVE, number)).makeNumber();
            return numOut;
        } else if (num == six) {
            numOut = new CreateCharacter(CharValue.SIX, new BuildNumber(CharValue.SIX, number)).makeNumber();
            return numOut;
        }
        return fourthAssignment.chooseChar(num);
    }
}
