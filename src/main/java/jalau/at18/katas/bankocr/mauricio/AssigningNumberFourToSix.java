package jalau.at18.katas.bankocr.mauricio;

public class AssigningNumberFourToSix {
    private CreateCharacter character;
    private CharacterNumbers number = new CharacterNumbers();
    private BuildNumber build;
    private String[][] numOut;
    private final int four = 4;
    private final int five = 5;

    public String[][] chooseChar(int num) {
        if (num == four) {
            build = new BuildNumber(CharValue.FOUR, number);
            character = new CreateCharacter(CharValue.FOUR, build);
            numOut = character.makeNumber();
        } else if (num == five) {
            build = new BuildNumber(CharValue.FIVE, number);
            character = new CreateCharacter(CharValue.FIVE, build);
            numOut = character.makeNumber();
        } else {
            build = new BuildNumber(CharValue.SIX, number);
            character = new CreateCharacter(CharValue.FIVE, build);
            numOut = character.makeNumber();
        }
        return numOut;
    }
}
