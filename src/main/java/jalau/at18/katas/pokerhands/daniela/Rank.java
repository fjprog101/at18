package jalau.at18.katas.pokerhands.daniela;

public enum Rank {
    HIGHCARD('1'),
    PAIR('2'),
    TWOPAIRS('3'),
    THREEOFAKIND('4'),
    STRAIGHT('5'),
    FLUSH('6'),
    FULLHOUSE('7'),
    FOUROFAKIND('8'),
    STRAIGHTFLUSH('9');

    private final char rankpokerhand;

    Rank(char charValue) {
        this.rankpokerhand = charValue;
    }

    public char getCharValue() {
        return rankpokerhand;
    }
}
