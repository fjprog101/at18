package jalau.at18.katas.bankocr.mauricio;

public class main {
    public static void main(String[] arg) {
        final int one = 1;
        final int two = 2;
        final int three = 3;
        final int four = 4;
        final int five = 5;
        final int six = 6;
        final int seven = 7;
        final int eight = 8;
        final int nine = 9;
        AssiginigNumberOnetoThree numToCharOneToThree = new AssiginigNumberOnetoThree();
        AssigningNumberFourToSix numToCharFourToSix = new AssigningNumberFourToSix();
        AssigningNumberSevenToNine numToCharSevenToNine = new AssigningNumberSevenToNine();
        ShowFirstThreeNumbers show = new ShowFirstThreeNumbers();
        String[][] number1 = numToCharOneToThree.chooseChar(one);
        String[][] number2 = numToCharOneToThree.chooseChar(two);
        String[][] number3 = numToCharSevenToNine.chooseChar(nine);
        String[][] number4 = numToCharSevenToNine.chooseChar(nine);
        // String[][] number4 = numToChar.chooseChar(TWO);
        // String[][] number5 = numToChar.chooseChar(TWO);
        // String[][] number6 = numToChar.chooseChar(ONE);
        // String[][] number7 = numToChar.chooseChar(TWO);
        // String[][] number8 = numToChar.chooseChar(TWO);
        // String[][] number9 = numToChar.chooseChar(ONE);
        show.showNumberSelected(number1, number2, number3);
    }
}
