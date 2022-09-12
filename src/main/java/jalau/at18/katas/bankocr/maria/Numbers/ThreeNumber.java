package jalau.at18.katas.bankocr.maria.Numbers;

public class ThreeNumber extends TypeNumber {
    public static final int THREE = 3;

    public ThreeNumber() {
        super();
    }

    @Override
    public boolean isThisNumber(String firstColumn, String secondColumn, String thirdColumn) {
        boolean result = NumberEnum.THREE.getFirstColumn().equals(firstColumn)
                && NumberEnum.THREE.getSecondColumn().equals(secondColumn)
                && NumberEnum.THREE.getThirdColumn().equals(thirdColumn);
        return result;
    }

    @Override
    public int getValue() {
        return THREE;
    }
}
