package jalau.at18.katas.bankocr.mauricio;

public class AssigningNumberSevenToNine {
    private CreateCharacter character;
    private CharacterNumbers number = new CharacterNumbers();
    private BuildNumber build;
    private String[][] numOut;
    private final int seven = 7;
    private final int eight = 8;

    public String[][] chooseChar(int num) {
        if (num == seven) {
            build = new BuildNumber(CharValue.SEVEN, number);
            character = new CreateCharacter(CharValue.SEVEN, build);
            numOut = character.makeNumber();
        } else if (num == eight) {
            build = new BuildNumber(CharValue.EIGHT, number);
            character = new CreateCharacter(CharValue.EIGHT, build);
            numOut = character.makeNumber();
        } else {
            build = new BuildNumber(CharValue.NINE, number);
            character = new CreateCharacter(CharValue.NINE, build);
            numOut = character.makeNumber();
        }
        return numOut;
    }
}
