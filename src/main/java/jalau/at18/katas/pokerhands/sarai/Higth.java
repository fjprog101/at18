package jalau.at18.katas.pokerhands.sarai;

public enum Higth {
    FULLHOUSE(new FullHouseIdentify()),
    PAIR(new PairsIdentify()),
    TWOPAIR(new TwoPairsIdentify()),
    THREEPAIR(new ThreePairsIdentify()),
    FOURPAIR(new FourOfaKindIdentify()),
    STRAIGHT(new Straight()),
    FLUSH(new Flush());

    private Cardhigth op;

    Higth(Cardhigth op) {

        this.op = op;

    }
    public Cardhigth getidentifyOperation() {
        return op;
    }

}
