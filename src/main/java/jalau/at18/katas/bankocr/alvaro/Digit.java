package jalau.at18.katas.bankocr.alvaro;

public class Digit {
    private static final int DIMENSION_MATRIX = 3;
    private char[][] mat3x3 = new char[DIMENSION_MATRIX][DIMENSION_MATRIX];
    private Number number;
    public Digit(char[][] matrix) {
        this.mat3x3 = matrix;
        convertToNumber();
    }
    public int convertToNumber() {
        number = new Number(mat3x3);
        number.compareNumber();
        System.out.print(number.getNumber());
        return number.getNumber();
    }

}
