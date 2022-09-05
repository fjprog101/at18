package jalau.at18.katas.bankocr.rodrigob;

public class VerifyIlegibleNumber {

    public VerifyIlegibleNumber() {

    }

    public boolean isLegibleNumber(String account) {
        return !account.contains("?") ? true : false;
    }
}
