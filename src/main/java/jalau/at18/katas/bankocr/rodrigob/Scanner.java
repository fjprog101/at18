package jalau.at18.katas.bankocr.rodrigob;

public class Scanner {

    public Scanner() {
    }

    public char[][] readInput() {
        String line1 = "    _  _     _  _  _  _  _ ";
        String line2 = "  | _| _||_||_ |_   ||_||_|";
        String line3 = "  ||_  _|  | _||_|  ||_| _|";
        ConvertInput convertInput = new ConvertInput(line1, line2, line3);
        return convertInput.getInputConverted(line1, line2, line3);
    }
}
