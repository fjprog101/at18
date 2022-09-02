package jalau.at18.katas.bankocr.maria.Numbers;

public class OneNumber extends TypeNumber {
    public OneNumber() {
        super();
    }

    @Override
    public boolean isThisNumber(String firstColumn, String secondColumn, String thirdColumn) {
        boolean result = NumberEnum.ONE.getFirstColumn().equals(firstColumn)
                && NumberEnum.ONE.getSecondColumn().equals(secondColumn)
                && NumberEnum.ONE.getThirdColumn().equals(thirdColumn);
        return result;
    }
}
