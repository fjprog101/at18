package jalau.at18.katas.bankocr.maria;

public class EightNumber extends TypeNumber {
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
}
