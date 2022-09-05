package jalau.at18.katas.bankocr.joser;

public class ExtPossible {

    public String getPossiblity(int index, String oldNumber) {
        String[] numT = Digits.values()[Character.getNumericValue(oldNumber.charAt(index))].getCharacters();
        Reconstruct data = new Reconstruct(numT);
        return data.result();
    }

    public String setPos(int index, char data, String oldNumber) {
        StringBuilder numerTest = new StringBuilder(oldNumber);
        numerTest.setCharAt(index, data);
        return numerTest.toString();
    }

    public String isPossibility(String resNum) {
        Check check = new Check(resNum);
        return check.checkNumber() ? "'" + resNum + "', " : "";
    }

}
