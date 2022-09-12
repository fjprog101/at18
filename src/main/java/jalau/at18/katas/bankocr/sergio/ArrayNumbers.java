package jalau.at18.katas.bankocr.sergio;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ArrayNumbers {
    private int singleNumberSize = 3;
    private char[][] matrix;
    private List<Integer> listNumbers = new ArrayList<Integer>();
    ConvertOcrToNumber convertOcrToNumber = new ConvertOcrToNumber();

    ArrayNumbers() throws FileNotFoundException {
        FileToMatrix fileToMatrix = new FileToMatrix();
        matrix = fileToMatrix.convertScannerToMatrix();
    }

    public List<Integer> numbersToList() {
        for (int i = 0; i < singleNumberSize * singleNumberSize; i++) {
            SplitMatrix splitMatrix = new SplitMatrix();
            listNumbers.add(convertOcrToNumber.analizeSingleNumbers(splitMatrix.singleNumber(matrix)));
            matrix = splitMatrix.removeSingleNumber(matrix);
        }
        return listNumbers;
    }

}
