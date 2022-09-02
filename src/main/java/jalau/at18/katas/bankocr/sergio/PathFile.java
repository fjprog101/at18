package jalau.at18.katas.bankocr.sergio;

import java.io.File;

public class PathFile {
    private File file;
    private String pathString = new String(
            "C:\\Users\\Sergio-Depa\\Desktop\\AT18\\Coding AT18\\practice_git\\dev101\\at18\\src\\main\\java\\jalau\\at18\\katas\\bankocr\\sergio\\BankAccounts\\BankAccounts.txt");

    PathFile() {
        file = new File(pathString);
    }

    public File getPathFile() {
        return file;
    }
}
