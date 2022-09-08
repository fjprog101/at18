package jalau.at18.katas.bankocr.adriana;

public class PrinterEntry extends Printers {
    private String[] entry;
    private String message;

    public PrinterEntry(String[] entry) {
        this.entry = entry;
        message = "";
    }

    @Override
    public String getMessage() {
        for (int index = 0; index < entry.length; index++) {
            message = message + entry[index] + "\n";
        }
        return message;
    }
}
