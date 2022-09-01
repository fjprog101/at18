package jalau.at18.katas.bankocr.maria;

public class ThreeNumber extends TypeNumber {
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
}
