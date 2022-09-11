package jalau.at18.katas.pokerhands.alvaro;


public class IdentifyHand {
    private String nameHand;

    public int searchTypeHand(PokerHand hand) {
        for (TypesOfHands typeHand : TypesOfHands.values()) {
            if (typeHand.getTypeHand().identify(hand)) {
                nameHand = typeHand.getHand();
                return typeHand.getRankValue();
            }
        }
        return 0;
    }
    public String getNameHand() {
        return nameHand;
    }
}
