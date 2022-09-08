package jalau.at18.katas.bankocr.adriana;


public class Print {
    private Printers printer;

    public Print(Printers printer) {
        this.printer = printer;
    }

    public void print() {
        System.out.print(printer.getMessage());
    }
}
