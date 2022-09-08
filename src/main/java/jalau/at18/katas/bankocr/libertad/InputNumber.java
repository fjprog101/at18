package jalau.at18.katas.bankocr.libertad;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
public class InputNumber {
    private static final int MAX_NUMBER_CHARACTER = 27;
    private static final int MAX_COL_NUMBER = 3;
    private InputReader inputReader;
    public InputNumber(File file) {
        inputReader = new InputReader(file);
    }
    public List<String[]> getSeparateHasNumbers() throws IOException {
        int posIni = 0;
        int posFinal = MAX_COL_NUMBER;
        List<String[]> listInputNumbers = new LinkedList<>();
        while (posFinal <= MAX_NUMBER_CHARACTER) {
            listInputNumbers.add(getNumber(posIni, posFinal));
            posIni += MAX_COL_NUMBER;
            posFinal += MAX_COL_NUMBER;
        }
        return listInputNumbers;
    }
    private String[] getNumber(int startPos, int finalPos) throws IOException {
        String[] lines = inputReader.getLinesOfInput();
        String firtsLine = lines[0].substring(startPos, finalPos);
        String secondLine = lines[1].substring(startPos, finalPos);
        String thridLine = lines[2].substring(startPos, finalPos);
        String[] number = {firtsLine, secondLine, thridLine};
        return number;
    }
}