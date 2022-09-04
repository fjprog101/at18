package jalau.at18.katas.bankocr.sergio;

import java.util.Arrays;

public class OpticCharacterReader {
    private Numbers numbers;

    public int numberOne(char[][] number) {
        char[][] numberOne = {{' ', ' ', ' ' }, {' ', ' ', '|' }, {' ', ' ', '|' } };
        if (Arrays.deepEquals(numberOne, number)) {
            numbers = Numbers.ONE;
        }
        return numbers.getNumberValue();
    }

    public int numberTwo(char[][] number) {
        char[][] numberTwo = {{' ', '_', ' ' }, {' ', '_', '|' }, {'|', '_', ' ' } };
        if (Arrays.deepEquals(numberTwo, number)) {
            numbers = Numbers.TWO;
        }
        return numbers.getNumberValue();
    }

    public int numberThree(char[][] number) {
        char[][] numberThree = {{' ', '_', ' ' }, {' ', '_', '|' }, {' ', '_', '|' } };
        if (Arrays.deepEquals(numberThree, number)) {
            numbers = Numbers.THREE;
        }
        return numbers.getNumberValue();
    }

    public int numberFour(char[][] number) {
        char[][] numberFour = {{' ', ' ', ' ' }, {'|', '_', '|' }, {' ', ' ', '|' } };
        if (Arrays.deepEquals(numberFour, number)) {
            numbers = Numbers.FOUR;
        }
        return numbers.getNumberValue();
    }

    public int numberFive(char[][] number) {
        char[][] numberFive = {{' ', '_', ' ' }, {'|', '_', ' ' }, {' ', '_', '|' } };
        if (Arrays.deepEquals(numberFive, number)) {
            numbers = Numbers.FIVE;
        }
        return numbers.getNumberValue();
    }

    public int numberSix(char[][] number) {
        char[][] numberSix = {{' ', '_', ' ' }, {'|', '_', ' ' }, {'|', '_', '|' } };
        if (Arrays.deepEquals(numberSix, number)) {
            numbers = Numbers.SIX;
        }
        return numbers.getNumberValue();
    }

    public int numberSeven(char[][] number) {
        char[][] numberSeven = {{' ', '_', ' ' }, {' ', ' ', '|' }, {' ', ' ', '|' } };
        if (Arrays.deepEquals(numberSeven, number)) {
            numbers = Numbers.SEVEN;
        }
        return numbers.getNumberValue();
    }

    public int numberEight(char[][] number) {
        char[][] numberEight = {{' ', '_', ' ' }, {'|', '_', '|' }, {'|', '_', '|' } };
        if (Arrays.deepEquals(numberEight, number)) {
            numbers = Numbers.EIGHT;
        }
        return numbers.getNumberValue();
    }

    public int numberNine(char[][] number) {
        char[][] numberNine = {{' ', '_', ' ' }, {'|', '_', '|' }, {' ', '_', '|' } };
        if (Arrays.deepEquals(numberNine, number)) {
            numbers = Numbers.NINE;
        }
        return numbers.getNumberValue();
    }
}
