package jalau.at18.katas.bankocr.libertad;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
public class InputNumber {
    private static final int MAX_NUMBER_CHARACTER = 27;
    private static final int MAX_COL_NUMBER = 3;
    private InputReader inputReader;
    private ChainHandler chainHandler;
    public InputNumber(File file) throws IOException {
        inputReader = new InputReader(file);
        chainHandler = new ChainHandler(inputReader.getLinesOfInput());
    }
    public List<String[]> getSeparateHasNumbers() {
        int posIni = 0;
        int posFinal = MAX_COL_NUMBER;
        List<String[]> listInputNumbers = fillList(new LinkedList<>(), posIni, posFinal);
        return listInputNumbers;
    }
    private List<String[]> fillList(List<String[]> listInputNumbers, int posIni, int posFinal) {
        if (posFinal <= MAX_NUMBER_CHARACTER) {
            listInputNumbers.add(chainHandler.getNumber(posIni, posFinal));
            fillList(listInputNumbers, posIni + MAX_COL_NUMBER, posFinal + MAX_COL_NUMBER);
        }
        return listInputNumbers;
    }
}