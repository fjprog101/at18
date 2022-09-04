package jalau.at18.katas.bankocr.mauricio;

public class ParseNumbers {
    private final int one = 1;
    private final int two = 2;
    private final int three = 3;
    private final int four = 4;
    private final int five = 5;
    private final int six = 6;
    private final int seven = 7;
    private final int eight = 8;
    private final int nine = 9;

    public CharValue convertNumber(int num) {
        switch (num) {
            case one:
                return CharValue.ONE;
            case two:
                return CharValue.TWO;
            case three:
                return CharValue.THREE;
            case four:
                return CharValue.ONE;
            case five:
                return CharValue.TWO;
            case six:
                return CharValue.THREE;
            case seven:
                return CharValue.ONE;
            case eight:
                return CharValue.TWO;
            case nine:
                return CharValue.THREE;
            default:
                return CharValue.ZERO;
        }
    }
}
