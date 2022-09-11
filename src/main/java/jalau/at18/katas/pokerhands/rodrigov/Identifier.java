package jalau.at18.katas.pokerhands.rodrigov;

abstract class Identifier {
    abstract boolean identify(PokerHand hand);
    abstract Rank identifyRank();
}
