package jalau.at18.katas.bankocr.joser;

public class Main {
    public static void main(String[] args) {
        String[] result;

        String[] scaned = new String[] {"    _  _     _  _  _  _  _ ",
                                        "  | _| _||_||_ |_   ||_||_|",
                                        "  ||_  _|  | _||_|  ||_| _|" };
        Converter conv = new Converter(scaned);

        System.out.println(conv.getNumberScaned());
    }
}
