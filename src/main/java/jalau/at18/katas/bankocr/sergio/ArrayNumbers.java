package jalau.at18.katas.bankocr.sergio;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ArrayNumbers {
    private final int singleNumberSize = 3;
    private char[][] matrix;
    private List<Integer> listNumbers = new ArrayList<Integer>();
    private ConvertOcrToNumber convertOcrToNumber = new ConvertOcrToNumber();

    ArrayNumbers() throws FileNotFoundException {
        FileToMatrix fileToMatrix = new FileToMatrix();
        matrix = fileToMatrix.convertScannerToMatrix();
    }

    public List<Integer> numbersToList() {
        for (int index = 0; index < singleNumberSize * singleNumberSize; index++) {
            SplitMatrix splitMatrix = new SplitMatrix();
            listNumbers.add(convertOcrToNumber.analizeSingleNumbers(splitMatrix.singleNumber(matrix)));
            matrix = splitMatrix.removeSingleNumber(matrix);
        }
        return listNumbers;
    }

}
