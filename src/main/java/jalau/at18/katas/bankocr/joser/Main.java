package jalau.at18.katas.bankocr.joser;

public class Main {
    public static void main(String[] args) {
        System.out.println("hi");
        Digits[] digit = Digits.values();

        for (Digits number : Digits.values()) {

            System.out.println(number.getCharacters()[1]);
            System.out.println("--------------");
        }

    }
}
