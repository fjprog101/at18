package jalau.at18.katas.pokerhands.adriana.identifier;

import jalau.at18.katas.pokerhands.adriana.*;

public abstract class HandIdentifier {

    public abstract boolean identify(PokerHand hand);
    public abstract HandKind getKind();
}
