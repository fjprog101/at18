package jalau.at18.katas.bankocr.maria.Numbers;

public class NineNumber extends TypeNumber {
    public static final int NINE = 9;

    public NineNumber() {
        super();
    }

    @Override
    public boolean isThisNumber(String firstColumn, String secondColumn, String thirdColumn) {
        boolean result = NumberEnum.NINE.getFirstColumn().equals(firstColumn)
                && NumberEnum.NINE.getSecondColumn().equals(secondColumn)
                && NumberEnum.NINE.getThirdColumn().equals(thirdColumn);
        return result;
    }

    @Override
    public int getValue() {
        return NINE;
    }
}
