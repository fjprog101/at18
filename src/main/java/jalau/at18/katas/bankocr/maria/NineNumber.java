package jalau.at18.katas.bankocr.maria;

public class NineNumber extends TypeNumber {
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
}
