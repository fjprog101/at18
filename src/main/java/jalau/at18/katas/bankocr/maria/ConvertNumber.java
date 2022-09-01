package jalau.at18.katas.bankocr.maria;

public class ConvertNumber {
    public static final int INITIAL_VALUE = -1;
    public static final int NUMBER_THREE = 3;
    public static final int NUMBER_FOUR = 4;
    public static final int NUMBER_FIVE = 5;
    public static final int NUMBER_SIX = 6;
    public static final int NUMBER_SEVEN = 7;
    public static final int NUMBER_EIGHT = 8;
    public static final int NUMBER_NINE = 9;
    public int convert(String firstColumn, String secondColumn, String thirdColumn) {
        int number = INITIAL_VALUE;

        ZeroNumber zeroNumber = new ZeroNumber();
        OneNumber oneNumber = new OneNumber();
        TwoNumber twoNumber = new TwoNumber();
        ThreeNumber threeNumber = new ThreeNumber();
        FourNumber fourNumber = new FourNumber();
        FiveNumber fiveNumber = new FiveNumber();
        SixNumber sixNumber = new SixNumber();
        SevenNumber sevenNumber = new SevenNumber();
        EightNumber eightNumber = new EightNumber();
        NineNumber nineNumber = new NineNumber();

        if (zeroNumber.isThisNumber(firstColumn, secondColumn, thirdColumn)) {
            number = 0;
        } else if (oneNumber.isThisNumber(firstColumn, secondColumn, thirdColumn)) {
            number = 1;
        } else if (twoNumber.isThisNumber(firstColumn, secondColumn, thirdColumn)) {
            number = 2;
        } else if (threeNumber.isThisNumber(firstColumn, secondColumn, thirdColumn)) {
            number = NUMBER_THREE;
        } else if (fourNumber.isThisNumber(firstColumn, secondColumn, thirdColumn)) {
            number = NUMBER_FOUR;
        } else if (fiveNumber.isThisNumber(firstColumn, secondColumn, thirdColumn)) {
            number = NUMBER_FIVE;
        } else if (sixNumber.isThisNumber(firstColumn, secondColumn, thirdColumn)) {
            number = NUMBER_SIX;
        } else if (sevenNumber.isThisNumber(firstColumn, secondColumn, thirdColumn)) {
            number = NUMBER_SEVEN;
        } else if (eightNumber.isThisNumber(firstColumn, secondColumn, thirdColumn)) {
            number = NUMBER_EIGHT;
        } else if (nineNumber.isThisNumber(firstColumn, secondColumn, thirdColumn)) {
            number = NUMBER_NINE;
        }

        return number;
    }
}
