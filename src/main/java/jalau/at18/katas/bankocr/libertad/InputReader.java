package jalau.at18.katas.bankocr.libertad;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class InputReader {
    private File file;
    public InputReader(File file) {
        this.file = file;
    }

    public String[] getLinesOfInput() throws IOException {
        List<String> lines = new LinkedList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line = bufferedReader.readLine();
        while (line != null) {
            lines.add(line);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
        return lines.toArray(new String[]{});
    }

}
