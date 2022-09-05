package jalau.at18.katas.bankocr.carlos;

import java.io.FileNotFoundException;
import java.util.Scanner;


public class MatrixCharParser {
    private final int sizeRow;
    private final int sizeCol;
    private char[][] matrix;

    public MatrixCharParser(int sizeRow, int sizeCol) throws FileNotFoundException {
        this.sizeRow = sizeRow;
        this.sizeCol = sizeCol;
        matrix = new char[sizeRow][sizeCol];
        convertToMatrix();
    }

    private void convertToMatrix() throws FileNotFoundException {
        ReadFile file = new ReadFile();
        Scanner text = file.getFile();
        int cont = 0;
        while (text.hasNextLine()) {
            String row = text.nextLine();
            for (int colum = 0; colum < row.length(); colum++) {
                matrix[cont][colum] = row.charAt(colum);
            }
            cont++;
        }
    }

    public char[][] getMatrixNumber(int pos) {
        char[][] matrixNumber = new char [3][3];
        for (int row = 0; row < matrixNumber.length; row++) {
            for (int col = 0; col < matrixNumber[0].length; col++) {
                matrixNumber[row][col] = matrix[row][col+pos*3];
            }
        }
        return matrixNumber;
    } 
}
