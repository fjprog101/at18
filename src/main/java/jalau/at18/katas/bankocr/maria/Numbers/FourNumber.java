package jalau.at18.katas.bankocr.maria.Numbers;

public class FourNumber extends TypeNumber {
    public static final int FOUR = 4;

    public FourNumber() {
        super();
    }

    @Override
    public boolean isThisNumber(String firstColumn, String secondColumn, String thirdColumn) {
        boolean result = NumberEnum.FOUR.getFirstColumn().equals(firstColumn)
                && NumberEnum.FOUR.getSecondColumn().equals(secondColumn)
                && NumberEnum.FOUR.getThirdColumn().equals(thirdColumn);
        return result;
    }

    @Override
    public int getValue() {
        return FOUR;
    }
}
