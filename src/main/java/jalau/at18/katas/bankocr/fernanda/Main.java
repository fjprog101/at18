package jalau.at18.katas.bankocr.fernanda;

public class Main {
    public static void main(String[] args) {
        ConvertNumber convertNumber = new ConvertNumber();
        char[][] testNum = {//411377968{' ', ' ', ' '}, {'|', '_', '|'}, {' ', ' ', '|'}
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', '_', ' '},
            {'|', '_', '|', ' ', ' ', '|', ' ', ' ', '|', ' ', '_', '|', ' ', ' ', '|', ' ', ' ', '|', '|', '_', '|', '|', '_', ' ', '|', '_', '|'},
            {' ', ' ', '|', ' ', ' ', '|', ' ', ' ', '|', ' ', '_', '|', ' ', ' ', '|', ' ', ' ', '|', ' ', '_', '|', '|', '_', '|', '|', '_', '|'}};
        int numericDigits = convertNumber.convertedNumber(testNum);
        System.out.print(numericDigits);
    }
}
