package jalau.at18.katas.bankocr.mauricio;

public class ParseCharacters {
    private final int one = 1;
    private final int two = 2;
    private final int three = 3;
    private final int four = 4;
    private final int five = 5;
    private final int six = 6;
    private final int seven = 7;
    private final int eight = 8;
    private final int nine = 9;

    public CharacterNumbers convertCharacters(int num) {
        switch (num) {
            case one:
                return new CharacterOne();
            case two:
                return new CharacterTwo();
            case three:
                return new CharacterThree();
            case four:
                return new CharacterFour();
            case five:
                return new CharacterFive();
            case six:
                return new CharacterSix();
            case seven:
                return new CharacterSeven();
            case eight:
                return new CharacterEight();
            case nine:
                return new CharacterNine();
            default:
                return new CharacterZero();
        }
    }
}
