package jalau.at18.katas.bankocr.maria.Numbers;

public class SixNumber extends TypeNumber {
    public static final int SIX = 6;

    public SixNumber() {
        super();
    }

    @Override
    public boolean isThisNumber(String firstColumn, String secondColumn, String thirdColumn) {
        boolean result = NumberEnum.SIX.getFirstColumn().equals(firstColumn)
                && NumberEnum.SIX.getSecondColumn().equals(secondColumn)
                && NumberEnum.SIX.getThirdColumn().equals(thirdColumn);
        return result;
    }

    @Override
    public int getValue() {
        return SIX;
    }
}
