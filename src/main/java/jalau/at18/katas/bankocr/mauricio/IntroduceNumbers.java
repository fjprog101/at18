package jalau.at18.katas.bankocr.mauricio;

public class IntroduceNumbers {
    private final int one = 1;
    private final int two = 2;
    private final int three = 3;
    private final int four = 4;
    private final int five = 5;
    private final int six = 6;
    private final int seven = 7;
    private final int eight = 8;
    private String[][][] chooseNumbers;
    private AssiginigNumber numToChar = new AssiginigNumber();


    public String[][][] introduceYourNumbers(int[] listNumbers) {
        chooseNumbers = new String[][][] {numToChar.chooseChar(listNumbers[0]), numToChar.chooseChar(listNumbers[one]),
                numToChar.chooseChar(listNumbers[two]), numToChar.chooseChar(listNumbers[three]),
                numToChar.chooseChar(listNumbers[four]), numToChar.chooseChar(listNumbers[five]),
                numToChar.chooseChar(listNumbers[six]), numToChar.chooseChar(listNumbers[seven]),
                numToChar.chooseChar(listNumbers[eight])};
        return chooseNumbers;
    }
}
