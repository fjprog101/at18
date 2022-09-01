package jalau.at18.katas.bankocr.rodrigov;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    
    private int cont = 0;
    final String path = "D:/AutomationTesting/Prog101/gitRemote/at18/src/main/java/jalau/at18/katas/bankocr/rodrigov/account.txt";
    String lines[] = new String[3];

    public void readAccountsTxt() throws FileNotFoundException{
        File myObj = new File(path);
        Scanner myReader = new Scanner(myObj);
        while(myReader.hasNextLine()){
            lines[cont] = myReader.nextLine();
            cont++;
        }
        myReader.close();
    }

    public void printMatrix(){
        for (int i = 0; i < lines.length; i++) {
            System.out.println(lines[i]);
        }
    }
}
