package jalau.at18.katas.pokerhands.adriana.identifier;

import jalau.at18.katas.pokerhands.adriana.HandKind;
import jalau.at18.katas.pokerhands.adriana.PokerHand;

public class NoTypeIdentifier extends HandIdentifier {

    @Override
    public boolean identify(PokerHand hand) {
        return true;
    }

    @Override
    public HandKind getKind() {
        return HandKind.NONE;
    }

}
