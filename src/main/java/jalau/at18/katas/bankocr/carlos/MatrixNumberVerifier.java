package jalau.at18.katas.bankocr.carlos;

public class MatrixNumberVerifier {
    private char[][] matrixNumberOne;
    private char[][] matrixNumberTwo;
    private char[][] matrixNumberThree;
    private char[][] matrixNumberFour;
    private char[][] matrixNumberFive;
    private char[][] matrixNumberSix;
    private char[][] matrixNumberSeven;
    private char[][] matrixNumberEight;
    private char[][] matrixNumberNine;
    private char[][] matrixNumberZero;



    public MatrixNumberVerifier() {
        matrixNumberOne = new char[3][3];
        matrixNumberOne[0][0] = ' ';
        matrixNumberOne[0][1] = ' ';
        matrixNumberOne[0][2] = ' ';
        matrixNumberOne[1][0] = ' ';
        matrixNumberOne[1][1] = ' ';
        matrixNumberOne[1][2] = '|';
        matrixNumberOne[2][0] = ' ';
        matrixNumberOne[2][1] = ' ';
        matrixNumberOne[2][2] = '|';
        
        matrixNumberTwo = new char[3][3];
        matrixNumberTwo[0][0] = ' ';
        matrixNumberTwo[0][1] = '_';
        matrixNumberTwo[0][2] = ' ';
        matrixNumberTwo[1][0] = ' ';
        matrixNumberTwo[1][1] = '_';
        matrixNumberTwo[1][2] = '|';
        matrixNumberTwo[2][0] = '|';
        matrixNumberTwo[2][1] = '_';
        matrixNumberTwo[2][2] = ' ';
        
        matrixNumberThree = new char[3][3];
        matrixNumberThree[0][0] = ' ';
        matrixNumberThree[0][1] = '_';
        matrixNumberThree[0][2] = ' ';
        matrixNumberThree[1][0] = ' ';
        matrixNumberThree[1][1] = '_';
        matrixNumberThree[1][2] = '|';
        matrixNumberThree[2][0] = ' ';
        matrixNumberThree[2][1] = '_';
        matrixNumberThree[2][2] = '|';

        matrixNumberFour = new char[3][3];
        matrixNumberFour[0][0] = ' ';
        matrixNumberFour[0][1] = ' ';
        matrixNumberFour[0][2] = ' ';
        matrixNumberFour[1][0] = '|';
        matrixNumberFour[1][1] = '_';
        matrixNumberFour[1][2] = '|';
        matrixNumberFour[2][0] = ' ';
        matrixNumberFour[2][1] = ' ';
        matrixNumberFour[2][2] = '|';

        matrixNumberFive = new char[3][3];
        matrixNumberFive[0][0] = ' ';
        matrixNumberFive[0][1] = '_';
        matrixNumberFive[0][2] = ' ';
        matrixNumberFive[1][0] = '|';
        matrixNumberFive[1][1] = '_';
        matrixNumberFive[1][2] = ' ';
        matrixNumberFive[2][0] = ' ';
        matrixNumberFive[2][1] = '_';
        matrixNumberFive[2][2] = '|';

        matrixNumberSix = new char[3][3];
        matrixNumberSix[0][0] = ' ';
        matrixNumberSix[0][1] = '_';
        matrixNumberSix[0][2] = ' ';
        matrixNumberSix[1][0] = '|';
        matrixNumberSix[1][1] = '_';
        matrixNumberSix[1][2] = ' ';
        matrixNumberSix[2][0] = '|';
        matrixNumberSix[2][1] = '_';
        matrixNumberSix[2][2] = '|';

        matrixNumberSeven = new char[3][3];
        matrixNumberSeven[0][0] = ' ';
        matrixNumberSeven[0][1] = '_';
        matrixNumberSeven[0][2] = ' ';
        matrixNumberSeven[1][0] = ' ';
        matrixNumberSeven[1][1] = ' ';
        matrixNumberSeven[1][2] = '|';
        matrixNumberSeven[2][0] = ' ';
        matrixNumberSeven[2][1] = ' ';
        matrixNumberSeven[2][2] = '|';

        matrixNumberEight = new char[3][3];
        matrixNumberEight[0][0] = ' ';
        matrixNumberEight[0][1] = '_';
        matrixNumberEight[0][2] = ' ';
        matrixNumberEight[1][0] = '|';
        matrixNumberEight[1][1] = '_';
        matrixNumberEight[1][2] = '|';
        matrixNumberEight[2][0] = '|';
        matrixNumberEight[2][1] = '_';
        matrixNumberEight[2][2] = '|';

        matrixNumberNine = new char[3][3];
        matrixNumberNine[0][0] = ' ';
        matrixNumberNine[0][1] = '_';
        matrixNumberNine[0][2] = ' ';
        matrixNumberNine[1][0] = '|';
        matrixNumberNine[1][1] = '_';
        matrixNumberNine[1][2] = '|';
        matrixNumberNine[2][0] = ' ';
        matrixNumberNine[2][1] = '_';
        matrixNumberNine[2][2] = '|';

        matrixNumberZero = new char[3][3];
        matrixNumberZero[0][0] = ' ';
        matrixNumberZero[0][1] = '_';
        matrixNumberZero[0][2] = ' ';
        matrixNumberZero[1][0] = '|';
        matrixNumberZero[1][1] = ' ';
        matrixNumberZero[1][2] = '|';
        matrixNumberZero[2][0] = '|';
        matrixNumberZero[2][1] = '_';
        matrixNumberZero[2][2] = '|';
    }

    public boolean isNumberOne(char[][] matrixToVerify) {
        return isMatrixNumber(matrixNumberOne, matrixToVerify);
    }

    public boolean isNumberTwo(char[][] matrixToVerify) {
        return isMatrixNumber(matrixNumberTwo, matrixToVerify);
    }

    public boolean isNumberThree(char[][] matrixToVerify) {
        return isMatrixNumber(matrixNumberThree, matrixToVerify);
    }

    public boolean isNumberFour(char[][] matrixToVerify) {
        return isMatrixNumber(matrixNumberFour, matrixToVerify);
    }

    public boolean isNumberFive(char[][] matrixToVerify) {
        return isMatrixNumber(matrixNumberFive, matrixToVerify);
    }

    public boolean isNumberSix(char[][] matrixToVerify) {
        return isMatrixNumber(matrixNumberSix, matrixToVerify);
    }

    public boolean isNumberSeven(char[][] matrixToVerify) {
        return isMatrixNumber(matrixNumberSeven, matrixToVerify);
    }

    public boolean isNumberEight(char[][] matrixToVerify) {
        return isMatrixNumber(matrixNumberEight, matrixToVerify);
    }

    public boolean isNumberNine(char[][] matrixToVerify) {
        return isMatrixNumber(matrixNumberNine, matrixToVerify);
    }

    public boolean isNumberZero(char[][] matrixToVerify) {
        return isMatrixNumber(matrixNumberZero, matrixToVerify);
    }

    private boolean isMatrixNumber(char[][] matrixNumber, char[][] matrixToVerify) {
        int rowCount = matrixNumber.length; int colCount = matrixNumber[0].length;
        if (matrixToVerify.length != rowCount || matrixToVerify[0].length != colCount) {
            return false;
        }
        for (int row = 0; row < rowCount; row++) {
            for (int colum = 0; colum < colCount; colum++) {
                if (matrixToVerify[row][colum] != matrixNumber[row][colum]) {
                    return false;
                }
            }
        }
        return true;
    }
}
