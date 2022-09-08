package jalau.at18.katas.bankocr.alvaro;

public class Number {
    private static final int SIZE = 3;
    private char[][] number =  new char[SIZE][SIZE];
    private int value;
    public Number(char[][] number, int value) {
        this.number = number;
        this.value =  value;
    }
    public int getNumber() {
        return value;
    }
    public char[][] getData() {
        return number;
    }

}
