package jalau.at18.katas.bankocr.maria.Numbers;

public class EightNumber extends TypeNumber {
    public static final int EIGHT = 8;
    public EightNumber() {
        super();
    }

    @Override
    public boolean isThisNumber(String firstColumn, String secondColumn, String thirdColumn) {
        boolean result = NumberEnum.EIGHT.getFirstColumn().equals(firstColumn)
                && NumberEnum.EIGHT.getSecondColumn().equals(secondColumn)
                && NumberEnum.EIGHT.getThirdColumn().equals(thirdColumn);
        return result;
    }
    @Override
    public int getValue() {
        return EIGHT;
    }

}
