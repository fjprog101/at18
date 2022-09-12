package jalau.at18.katas.pokerhands.sarai;

public enum Patterns {
    HIGHTCARDS(new HightCardsIdentify()),
    FULLHOUSE(new FullHouseIdentify()),
    PAIR(new PairsIdentify()),
    TWOPAIR(new TwoPairsIdentify()),
    THREEPAIR(new ThreePairsIdentify()),
    FOURPAIR(new FourOfaKindIdentify()),
    STRAIGHT(new Straight()),
    FLUSH(new Flush());

    private Cardhigth op;

    Patterns(Cardhigth op) {

        this.op = op;

    }
    public Cardhigth getidentifyOperation() {
        return op;
    }

}
