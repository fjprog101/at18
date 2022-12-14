package jalau.at18.architects.model.cards;

public class YellowCard extends Card {
    private final int wildcard = 1;

    public YellowCard() {
        super("Yellow");
    }

    @Override
    public String getColor() {
        return super.color();
    }

    public int getWildcard() {
        return wildcard;
    }
}
