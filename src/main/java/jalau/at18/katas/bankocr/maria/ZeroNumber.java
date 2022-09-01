package jalau.at18.katas.bankocr.maria;

public class ZeroNumber extends TypeNumber {
    public ZeroNumber() {
        super();
    }

    @Override
    public boolean isThisNumber(String firstColumn, String secondColumn, String thirdColumn) {
        boolean result = NumberEnum.ZERO.getFirstColumn().equals(firstColumn) &&
                NumberEnum.ZERO.getSecondColumn().equals(secondColumn) &&
                NumberEnum.ZERO.getThirdColumn().equals(thirdColumn);
        return result;
    }
}
