package jalau.at18.katas.pokerhands.alvaro;


public class IdentifyHand {
    
    public int searchTypeHand(PokerHand hand) {

        for (TypesOfHands typeHand : TypesOfHands.values()) {
            if (typeHand.getTypeHand().identify(hand)) {
                return typeHand.getRankValue();
            }
        }
        return 0;
    }
}
