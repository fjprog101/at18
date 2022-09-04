package jalau.at18.katas.bankocr.joser;

public class Reconstruct {
    private static final int NINE = 9;
    private static final int THREE = 3;
    private String[] number;
    private String results;

    public Reconstruct(String[] number) {
        this.number = number;
        this.results = "";
    }

    public void result() {
        for (int index = 0; index <= NINE; index++) {
            if (possible(0, Digits.values()[index].getCharacters()) == 1) {
                System.out.println(Digits.values()[index].getCharacters()[0]);
                System.out.println(Digits.values()[index].getCharacters()[1]);
                System.out.println(Digits.values()[index].getCharacters()[2]);
                System.out.println(index);
                this.results += index;
            }
        }
    }

    public int possible(int con, String[] digits) {
        for (int pos = 0; con < 2 && pos < this.number.length; pos++) {
            con += filter(digits[pos], this.number[pos], 0) + filter(digits[pos], this.number[pos], 1);
            con += filter(digits[pos], this.number[pos], 2);
        }
        return con < 2 ? 1 : 0;
    }

    public int filter(String ori, String digit, int pos) {
        return (ori.charAt(pos) != digit.charAt(pos)) ? 1 : 0;
    }

}
