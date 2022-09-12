package jalau.at18.katas.bankocr.maria;

public enum AccountStatusEnum {
    VALID(""), ERR("ERR"), ILL("ILL");

    private String value;

    AccountStatusEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
