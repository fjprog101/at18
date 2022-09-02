package jalau.at18.katas.bankocr.sergio;

import java.util.Arrays;

public class OpticCharacterReader {

    public Boolean numberOne(char[][] number) {
        char[][] numberOne = {{' ', ' ', ' ' }, {' ', ' ', '|' }, {' ', ' ', '|' } };
        boolean check = false;
        if (Arrays.deepEquals(numberOne, number)) {
            check = true;
        }
        return check;
    }

    public Boolean numberTwo(char[][] number) {
        char[][] numberTwo = {{' ', '_', ' ' }, {' ', '_', '|' }, {'|', '_', ' ' } };
        boolean check = false;
        if (Arrays.deepEquals(numberTwo, number)) {
            check = true;
        }
        return check;
    }

    public Boolean numberThree(char[][] number) {
        char[][] numberThree = {{' ', '_', ' ' }, {' ', '_', '|' }, {' ', '_', '|' } };
        boolean check = false;
        if (Arrays.deepEquals(numberThree, number)) {
            check = true;
        }
        return check;
    }

    public Boolean numberFour(char[][] number) {
        char[][] numberFour = {{' ', ' ', ' ' }, {'|', '_', '|' }, {' ', ' ', '|' } };
        boolean check = false;
        if (Arrays.deepEquals(numberFour, number)) {
            check = true;
        }
        return check;
    }

    public Boolean numberFive(char[][] number) {
        char[][] numberFive = {{' ', '_', ' ' }, {'|', '_', ' ' }, {' ', '_', '|' } };
        boolean check = false;
        if (Arrays.deepEquals(numberFive, number)) {
            check = true;
        }
        return check;
    }

    public Boolean numberSix(char[][] number) {
        char[][] numberSix = {{' ', '_', ' ' }, {'|', '_', ' ' }, {'|', '_', '|' } };
        boolean check = false;
        if (Arrays.deepEquals(numberSix, number)) {
            check = true;
        }
        return check;
    }

    public Boolean numberSeven(char[][] number) {
        char[][] numberSeven = {{' ', '_', ' ' }, {' ', ' ', '|' }, {' ', ' ', '|' } };
        boolean check = false;
        if (Arrays.deepEquals(numberSeven, number)) {
            check = true;
        }
        return check;
    }

    public Boolean numberEight(char[][] number) {
        char[][] numberEight = {{' ', '_', ' ' }, {'|', '_', '|' }, {'|', '_', '|' } };
        boolean check = false;
        if (Arrays.deepEquals(numberEight, number)) {
            check = true;
        }
        return check;
    }

    public Boolean numberNine(char[][] number) {
        char[][] numberNine = {{' ', '_', ' ' }, {'|', '_', '|' }, {' ', '_', '|' } };
        boolean check = false;
        if (Arrays.deepEquals(numberNine, number)) {
            check = true;
        }
        return check;
    }
}
