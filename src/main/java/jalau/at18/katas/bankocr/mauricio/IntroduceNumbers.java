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
    private AssiginigNumberOnetoThree numToCharOneToThree = new AssiginigNumberOnetoThree();
    private AssigningNumberFourToSix numToCharFourToSix = new AssigningNumberFourToSix();
    private AssigningNumberSevenToNine numToCharSevenToNine = new AssigningNumberSevenToNine();

    public String[][][] introduceYourNumbers(int[] listNumbers) {
        String[][] number1 = numToCharOneToThree.chooseChar(listNumbers[0]);
        String[][] number2 = numToCharOneToThree.chooseChar(listNumbers[one]);
        String[][] number3 = numToCharOneToThree.chooseChar(listNumbers[two]);
        String[][] number4 = numToCharFourToSix.chooseChar(listNumbers[three]);
        String[][] number5 = numToCharFourToSix.chooseChar(listNumbers[four]);
        String[][] number6 = numToCharFourToSix.chooseChar(listNumbers[five]);
        String[][] number7 = numToCharSevenToNine.chooseChar(listNumbers[six]);
        String[][] number8 = numToCharSevenToNine.chooseChar(listNumbers[seven]);
        String[][] number9 = numToCharSevenToNine.chooseChar(listNumbers[eight]);
        chooseNumbers = new String[][][] {number1, number2, number3, number4, number5, number6, number7, number8,
            number9};
        return chooseNumbers;
    }
}
