package jalau.at18.katas.bankocr.robertof;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileReader {
    private final File file;

    public FileReader(File file) {
        this.file = file;
    }

    public String getFilePath() {
        return file.getPath();
    }

    public ArrayList<String> readFile() throws IOException {
        ArrayList<String> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new java.io.FileReader(file.getPath()))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
        }
        return list;
    }
}