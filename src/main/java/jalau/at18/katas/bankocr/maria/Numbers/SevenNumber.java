package jalau.at18.katas.bankocr.maria.Numbers;

public class SevenNumber extends TypeNumber {
    public static final int SEVEN = 7;

    public SevenNumber() {
        super();
    }

    @Override
    public boolean isThisNumber(String firstColumn, String secondColumn, String thirdColumn) {
        boolean result = NumberEnum.SEVEN.getFirstColumn().equals(firstColumn)
                && NumberEnum.SEVEN.getSecondColumn().equals(secondColumn)
                && NumberEnum.SEVEN.getThirdColumn().equals(thirdColumn);
        return result;
    }

    @Override
    public int getValue() {
        return SEVEN;
    }
}
