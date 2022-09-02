package jalau.at18.katas.bankocr.rodrigob;

public class VerifyAccount {
    private VerifyCheckSum verifyCheckSum = new VerifyCheckSum();

    public VerifyAccount() {

    }

    public String getStatusAccount(String account) {
        return verifyCheckSum.checkSumValid(account);
    }

}
