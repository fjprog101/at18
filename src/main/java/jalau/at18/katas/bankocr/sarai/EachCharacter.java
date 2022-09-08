package jalau.at18.katas.bankocr.sarai;

public enum EachCharacter {

    ZEROFIRST(new String[] {" _ ", "| |", "|_|"}),
    ONEFIRST(new String[] {"   ", "  |", "  |"}),
    TWOFIRST(new String[] {" _ ", " _|", "|_ " }),
    THREEFIRST(new String[] {" _ ", " _|", " _|" }),
    FOURFIRST(new String[] {"   ", "|_|", "  |" }),
    FIVEFIRST(new String[] {" _ ", "|_ ", " _|" }),
    SIXFIRST(new String[]  {" _ ", "|_ ", "|_|" }),
    SEVENFIRST(new String[] {" _ ", "  |", "  |" }),
    EIGTHFIRST(new String[] {" _ ", "|_|", "|_|" }),
    NINEFIRST(new String[] {" _ ", "|_|", " _|" });
    private String[] characterArray;

    EachCharacter(String[] character) {
        this.characterArray = character;
    }

    public String[] getEachCharacter() {
        return characterArray;
    }
}
