package jalau.at18.katas.bankocr.rodrigob;

public class VerifyAccount {
    private VerifyCheckSum verifyCheckSum = new VerifyCheckSum();
    private VerifyIlegibleNumber verifyIlegibleNumber = new VerifyIlegibleNumber();

    public VerifyAccount() {

    }

    public String getStatusAccount(String account) {
        if (!verifyIlegibleNumber.isLegibleNumber(account)) {
            return " ILL";
        } else {
            return verifyCheckSum.checkSumValid(account);
        }
    }

}
