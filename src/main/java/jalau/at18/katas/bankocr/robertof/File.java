package jalau.at18.katas.bankocr.robertof;

import java.util.ArrayList;

public class File {
    private final String path;
    private ArrayList<String> tableValue;
    public File(String path) {
        this.path = path;
        this.tableValue = new ArrayList<>();
    }

    public String getPath() {
        return path;
    }

    public ArrayList<String> getTableValue() {
        return tableValue;
    }
}
