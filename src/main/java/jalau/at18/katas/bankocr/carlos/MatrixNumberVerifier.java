package jalau.at18.katas.bankocr.carlos;

public class MatrixNumberVerifier {
    private char[][] matrixNumberOne;
    private char[][] matrixNumberTwo;
    private char[][] matrixNumberThree;

    public MatrixNumberVerifier() {
        matrixNumberOne = new char [3][3];
        matrixNumberOne[0][0] = ' ';
        matrixNumberOne[0][1] = ' ';
        matrixNumberOne[0][2] = ' ';
        matrixNumberOne[1][0] = ' ';
        matrixNumberOne[1][1] = ' ';
        matrixNumberOne[1][2] = '|';
        matrixNumberOne[2][0] = ' ';
        matrixNumberOne[2][1] = ' ';
        matrixNumberOne[2][2] = '|';
        
        matrixNumberTwo = new char [3][3];
        matrixNumberTwo[0][0] = ' ';
        matrixNumberTwo[0][1] = '_';
        matrixNumberTwo[0][2] = ' ';
        matrixNumberTwo[1][0] = ' ';
        matrixNumberTwo[1][1] = '_';
        matrixNumberTwo[1][2] = '|';
        matrixNumberTwo[2][0] = '|';
        matrixNumberTwo[2][1] = '_';
        matrixNumberTwo[2][2] = ' ';
        
        matrixNumberThree = new char [3][3];
        matrixNumberThree[0][0] = ' ';
        matrixNumberThree[0][1] = '_';
        matrixNumberThree[0][2] = ' ';
        matrixNumberThree[1][0] = ' ';
        matrixNumberThree[1][1] = '_';
        matrixNumberThree[1][2] = '|';
        matrixNumberThree[2][0] = ' ';
        matrixNumberThree[2][1] = '_';
        matrixNumberThree[2][2] = '|';

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

    private boolean isMatrixNumber(char[][] matrixNumber, char[][] matrixToVerify) {
        int rowCount = matrixNumber.length,
        colCount = matrixNumber[0].length;
        if (matrixToVerify.length != rowCount || matrixToVerify[0].length != colCount) {
            return false;
        }
        for (int row = 0; row < rowCount; row++){
            for (int colum = 0; colum < colCount; colum++) {
                if (matrixToVerify[row][colum] != matrixNumber[row][colum]) {
                    return false;
                }
            }
        }
        return true;
    }
}
