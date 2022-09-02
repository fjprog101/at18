package jalau.at18.katas.bankocr.sarai;

public enum EachCharacter {

    ZEROFIRST(new String[][] {{" ", "_", " "}}),
    ONEFIRST(new String[][] {{" ", "|", " "}}),
    TWOFIRST(new String[][] {{" ", "_", " " }}),
    THREEFIRST(new String[][] {{" ", "_", " " }}),
    FOURFIRST(new String[][] {{" ", " ", " " }}),
    FIVEFIRST(new String[][] {{" ", "_", " " }}),
    SIXFIRST(new String[][] {{" ", "_", " " }}),
    SEVENFIRST(new String[][] {{" ", "_", " " }}),
    EIGTHFIRST(new String[][] {{" ", "_", " " }}),
    NINEFIRST(new String[][] {{" ", "_", " " }});

    private String[][] character;

    EachCharacter(String[][] character) {
        this.character = character;
    }

    public String[][] getEachCharacter() {
        return character;
    }
}
