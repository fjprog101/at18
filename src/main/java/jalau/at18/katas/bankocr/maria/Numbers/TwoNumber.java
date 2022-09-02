package jalau.at18.katas.bankocr.maria.Numbers;

public class TwoNumber extends TypeNumber {
    public TwoNumber() {
        super();
    }

    @Override
    public boolean isThisNumber(String firstColumn, String secondColumn, String thirdColumn) {
        boolean result = NumberEnum.TWO.getFirstColumn().equals(firstColumn)
                && NumberEnum.TWO.getSecondColumn().equals(secondColumn)
                && NumberEnum.TWO.getThirdColumn().equals(thirdColumn);
        return result;
    }
}
