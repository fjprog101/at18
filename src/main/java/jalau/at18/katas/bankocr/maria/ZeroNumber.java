package jalau.at18.katas.bankocr.maria;

public class ZeroNumber extends TypeNumber {
    public ZeroNumber() {
        super();
    }

    @Override
    public int whatNumberI(String firstColumn, String secondColumn, String thirdColumn) {
        int number = 0;
        if (firstColumn.equals(NumberEnum.ONLYUNDERSCORE) && secondColumn.equals(NumberEnum.TWOPIPESSPACE) & thirdColumn.equals(NumberEnum.PIPESUNDERSCORE)) {
            number = 0;
        }
        return number;
    }
}
