package jalau.at18.katas.bankocr.maria;

public class Main {
    public static void main(String args[]) {
        String chainFile1 = " _  _  _  _  _  _  _  _  _ ";
        String chainFile2 = "| || || || || || || || || |";
        String chainFile3 = "|_||_||_||_||_||_||_||_||_|";

        ManageInputString manageInputString = new ManageInputString();
        manageInputString.divideString(chainFile1,chainFile2, chainFile3);
        //manageInputString.divideStringSimple(chainFile1);
    }
}
