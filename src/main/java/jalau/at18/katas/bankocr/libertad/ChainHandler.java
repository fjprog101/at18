package jalau.at18.katas.bankocr.libertad;

public class ChainHandler {
    private final int countMaxOfCharacter = 3;
    private String[] lines;
    public ChainHandler(String[] lines) {
        this.lines = lines;
    }
    public String[] getNumber(int startPos, int finalPos) {
        String[] number = new String[countMaxOfCharacter];
        for (int iterator = 0; iterator < number.length; iterator++) {
            number[iterator] = lines[iterator].substring(startPos, finalPos);
        }
        return number;
    }
}
