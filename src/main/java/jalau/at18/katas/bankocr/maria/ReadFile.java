package jalau.at18.katas.bankocr.maria;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadFile {
    private String file;

    public ReadFile(String file) {
        this.file = file;
    }

    public List<String> readFile() {
        try {
            return readFileLines();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private List<String> readFileLines() throws URISyntaxException, IOException {
        URL resource = getClass().getClassLoader().getResource(file);
        URI uri = resource.toURI();
        return Files.readAllLines(Path.of(uri));
    }
}
