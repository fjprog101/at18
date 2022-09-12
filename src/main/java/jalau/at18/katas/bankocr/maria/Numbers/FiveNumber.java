package jalau.at18.katas.bankocr.maria.Numbers;

public class FiveNumber extends TypeNumber {
    public static final int FIVE = 5;

    public FiveNumber() {
        super();
    }

    @Override
    public boolean isThisNumber(String firstColumn, String secondColumn, String thirdColumn) {
        boolean result = NumberEnum.FIVE.getFirstColumn().equals(firstColumn)
                && NumberEnum.FIVE.getSecondColumn().equals(secondColumn)
                && NumberEnum.FIVE.getThirdColumn().equals(thirdColumn);
        return result;
    }

    @Override
    public int getValue() {
        return FIVE;
    }
}
