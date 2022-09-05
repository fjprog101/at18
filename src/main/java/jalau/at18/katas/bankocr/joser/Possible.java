package jalau.at18.katas.bankocr.joser;

public class Possible extends ExtPossible {
    private String number;
    private String result;
    private static final int NINE = 9;

    public Possible(String number) {
        this.number = number;
        this.result = "[";
    }

    public String getAmb() {
        for (int index = 0; index < NINE; index++) {
            tourPossibilities(index);
        }
        return result.substring(0, result.length() - 2) + "]";
    }

    public void tourPossibilities(int index) {
        String posib = getPossiblity(index, this.number);
        for (int jindex = 0; jindex < posib.length(); jindex++) {
            result += isPossibility(setPos(index, posib.charAt(jindex), this.number));
        }
    }
}