package jalau.at18.katas.bankocr.sergio;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileToMatrix {
    private final int sizeRow = 4;
    private final int sizeColum = 27;
    private char[][] matrix;

    FileToMatrix() {
        matrix = new char[sizeRow][sizeColum];
    }

    public char[][] convertScannerToMatrix() throws FileNotFoundException {
        FileReader input = new FileReader();
        Scanner file = input.getReadFile();
        int rowCounter = 0;
        while (file.hasNextLine()) {
            String rows = file.nextLine();
            for (int colum = 0; colum < rows.length(); colum++) {
                matrix[rowCounter][colum] = rows.charAt(colum);
            }
            rowCounter++;
        }
        return matrix;
    }
}
