package jalau.at18.katas.bankocr.joser;

public class Main {
    public static void main(String[] args) {

        String[] scaned = new String[] {"    _  _     _  _  _  _  _ ",
                                        "  | _| _||_||_ |_   ||_||_|",
                                        "  ||_  _|  | _||_|  ||_| _|" };
        Converter conv = new Converter(scaned);
        Format form = new Format(conv.getNumberScaned());
        System.out.println(form.formated());

    }
}
