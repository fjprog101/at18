package jalau.at18.katas.bankocr.maria;

public class SixNumber extends TypeNumber {
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
}
