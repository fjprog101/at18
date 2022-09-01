package jalau.at18.katas.bankocr.maria;

public class FiveNumber extends TypeNumber {
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
}
