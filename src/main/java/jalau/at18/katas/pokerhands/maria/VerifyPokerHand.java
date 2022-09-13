package jalau.at18.katas.pokerhands.maria;

import java.util.List;

public class VerifyPokerHand {

    public PokerHandRank returnTypePokerHand(PokerHand pokerHand) {
        TypesPokerHandIdentifier typesPokerHandValue = new TypesPokerHandIdentifier();

        List<PokerHandIdentifier> typesPokerHandIdentifier = typesPokerHandValue.typesPokerHandIdentifier();
        for (PokerHandIdentifier typeHand : typesPokerHandIdentifier) {
            if (typeHand.identify(pokerHand)) {
                return typeHand.getRank(pokerHand);
            }
        }
        return null;
    }
}
