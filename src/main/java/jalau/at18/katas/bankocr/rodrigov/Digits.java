package jalau.at18.katas.bankocr.rodrigov;
import java.util.ArrayList;
import java.util.List;

public class Digits {
    private List<String> listOfNumbers = new ArrayList<>();

    public void addDigitsFirstPart() {
        listOfNumbers.add(" _ | ||_|");
        listOfNumbers.add("     |  |");
        listOfNumbers.add(" _  _||_ ");
        listOfNumbers.add(" _  _| _|");
        listOfNumbers.add("   |_|  |");
    }
    public void addDigitsSecondPart() {
        listOfNumbers.add(" _ |_  _|");
        listOfNumbers.add(" _ |_ |_|");
        listOfNumbers.add(" _   |  |");
        listOfNumbers.add(" _ |_||_|");
        listOfNumbers.add(" _ |_| _|");
    }

    public List<String> getListOfNumbers() {
        return listOfNumbers;
    }

    public void setListOfNumbers(List<String> listOfDigits) {
        this.listOfNumbers = listOfDigits;
    }
}