package jalau.at18.katas.bankocr.daniela;

public class SetPossibleDigit {

    public String setPos(int index, char data, String oldNumber) {
        StringBuilder numerTest = new StringBuilder(oldNumber);
        numerTest.setCharAt(index, data);
        return numerTest.toString();
    }
}
