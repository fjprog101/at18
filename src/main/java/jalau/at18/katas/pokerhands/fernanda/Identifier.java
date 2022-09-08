package jalau.at18.katas.pokerhands.fernanda;

abstract class Identifier {
    abstract boolean identify(PokerHand hand);
    abstract RankHand getTypeofHand();
}
