package jalau.at18.katas.bankocr.carlos;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        MatrixCharParser matrixCharParser = new MatrixCharParser(3,27);
        MatrixNumberVerifier matrixNumberVerifier = new MatrixNumberVerifier();
        //char[][] matrix = matrixCharParser.getMatrixNumber(2);
        int digsWanted = 9;
        for (int index = 0; index < digsWanted; index++) {
            char[][] matrix = matrixCharParser.getMatrixNumber(index);
            if (matrixNumberVerifier.isNumberOne(matrix)) {
                System.out.print("1");
            }
            if (matrixNumberVerifier.isNumberTwo(matrix)) {
                System.out.print("2");
            }
            if (matrixNumberVerifier.isNumberThree(matrix)) {
                System.out.print("3");
            }
            if (matrixNumberVerifier.isNumberFour(matrix)) {
                System.out.print("4");
            }
            if (matrixNumberVerifier.isNumberFive(matrix)) {
                System.out.print("5");
            }
            if (matrixNumberVerifier.isNumberSix(matrix)) {
                System.out.print("6");
            }
            if (matrixNumberVerifier.isNumberSeven(matrix)) {
                System.out.print("7");
            }
            if (matrixNumberVerifier.isNumberEight(matrix)) {
                System.out.print("8");
            }
            if (matrixNumberVerifier.isNumberNine(matrix)) {
                System.out.print("9");
            }
            if (matrixNumberVerifier.isNumberZero(matrix)) {
                System.out.print("0");
            }
        }
    }
}
