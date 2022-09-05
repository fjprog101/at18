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
    private ParseNumbers num = new ParseNumbers();
    private ParseCharacters cha = new ParseCharacters();

    public String[][][] introduceYourNumbers(int[] listNumbers) {
        chooseNumbers = new String[][][] {
                new AssiginigNumber(num.convertNumber(listNumbers[0]), cha.convertCharacters(listNumbers[0])).chooseChar(),
                new AssiginigNumber(num.convertNumber(listNumbers[one]), cha.convertCharacters(listNumbers[one])).chooseChar(),
                new AssiginigNumber(num.convertNumber(listNumbers[two]), cha.convertCharacters(listNumbers[two])).chooseChar(),
                new AssiginigNumber(num.convertNumber(listNumbers[three]), cha.convertCharacters(listNumbers[three])).chooseChar(),
                new AssiginigNumber(num.convertNumber(listNumbers[four]), cha.convertCharacters(listNumbers[four])).chooseChar(),
                new AssiginigNumber(num.convertNumber(listNumbers[five]), cha.convertCharacters(listNumbers[five])).chooseChar(),
                new AssiginigNumber(num.convertNumber(listNumbers[six]), cha.convertCharacters(listNumbers[six])).chooseChar(),
                new AssiginigNumber(num.convertNumber(listNumbers[seven]), cha.convertCharacters(listNumbers[seven])).chooseChar(),
                new AssiginigNumber(num.convertNumber(listNumbers[eight]), cha.convertCharacters(listNumbers[eight])).chooseChar()};
        return chooseNumbers;
    }
}
