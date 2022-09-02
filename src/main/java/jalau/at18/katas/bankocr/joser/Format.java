package jalau.at18.katas.bankocr.joser;

public class Format {
    private String number;

    public Format(String number) {
        this.number = number;
    }

    public String formated() {
        if (isIll()) {
            return number + " ERR";
        }

        return "";
    }

    public boolean isIll() {
        if (this.number.indexOf("?") != -1) {
            return true;
        }
        return false;
    }

    public boolean isERR() {
        Check checksum = new Check(number);
        if (checksum.checkNumber()) {
            return true;
        }
        return false;
    }
}
