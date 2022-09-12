package jalau.at18.katas.pokerhands.alvaro;
public class IdentifyHand {
    private String nameHand;
    private int rankValue;

    public int searchTypeHand(PokerHand hand) {
        for (TypesOfHands typeHand : TypesOfHands.values()) {
            if (typeHand.getTypeHand().identify(hand)) {
                nameHand = typeHand.getHand();
                rankValue = typeHand.getRankValue();
            }
        }
        return rankValue;
    }
    public String getNameHand() {
        return nameHand;
    }
}
