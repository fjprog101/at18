package jalau.at18.katas.bankocr.mauricio;

public class AssiginigNumberOnetoThree {

    private CreateCharacter character;
    private CharacterNumbers number = new CharacterNumbers();
    private BuildNumber build;
    private String[][] numOut;
    private final int one = 1;
    private final int two = 2;

    public String[][] chooseChar(int num) {
        if (num == one) {
            build = new BuildNumber(CharValue.ONE, number);
            character = new CreateCharacter(CharValue.ONE, build);
            numOut = character.makeNumber();
        } else if (num == two) {
            build = new BuildNumber(CharValue.TWO, number);
            character = new CreateCharacter(CharValue.TWO, build);
            numOut = character.makeNumber();
        } else {
            build = new BuildNumber(CharValue.THREE, number);
            character = new CreateCharacter(CharValue.THREE, build);
            numOut = character.makeNumber();
        }
        return numOut;
    }
}
