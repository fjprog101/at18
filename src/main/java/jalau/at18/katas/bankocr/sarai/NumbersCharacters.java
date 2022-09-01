package jalau.at18.katas.bankocr.sarai;

public enum NumbersCharacters {
    ZERO(new String[][] {
            {" ", "_", " "},
            {"|", " ", "|"},
            {"|", "_", "|"},
    }),
    ONE(new String[][] {
            {" ", "|", " "},
            {" ", "|", " "},
            {" ", "|", " "},
    }),
    TWO(new String[][] {
            {" ", "_", " " },
            {" ", "_", "|" },
            {"|", "_", " " },
    }),
    THREE(new String[][] {
            {" ", "_", " " },
            {" ", "_", "|" },
            {" ", "_", "|" },
    }),
    FOUR(new String[][] {
            {" ", " ", " " },
            {"|", "_", "|" },
            {" ", " ", "|" },
    }),
    FIVE(new String[][] {
            {" ", "_", " " },
            {"|", "_", " " },
            {" ", "_", "|" },
    }),
    SIX(new String[][] {
            {" ", "_", " " },
            {"|", "_", " " },
            {"|", "_", "|" },
    }),
    SEVEN(new String[][] {
            {" ", "_", " " },
            {" ", " ", "|" },
            {" ", " ", "|" },
    }),
    EIGTH(new String[][] {
            {" ", "_", " " },
            {"|", "_", "|" },
            {"|", "_", "|" },
    }),
    NINE(new String[][] {
            {" ", "_", " " },
            {"|", "_", "|" },
            {" ", "_", "|" },
    });

    private String[][] characternumbers;

    NumbersCharacters(String[][] characternumbers) {
        this.characternumbers = characternumbers;
    }

    public String[][] getcharacternumbers() {
        return characternumbers;
    }
}
