package jalau.at18.katas.bankocr.mauricio;

public class FourthAssigningNumber {
    private FifthAssigningNumber fifthAssignment = new FifthAssigningNumber();
    private CharacterNumbers number = new CharacterNumbers();
    private String[][] numOut;
    private final int seven = 7;
    private final int eight = 8;

    public String[][] chooseChar(int num) {
        if (num == seven) {
            numOut = new CreateCharacter(CharValue.SEVEN, new BuildNumber(CharValue.SEVEN, number)).makeNumber();
            return numOut;
        } else if (num == eight) {
            numOut = new CreateCharacter(CharValue.EIGHT, new BuildNumber(CharValue.EIGHT, number)).makeNumber();
            return numOut;
        }
        return fifthAssignment.chooseChar(num);
    }
}
