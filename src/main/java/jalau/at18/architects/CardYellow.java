package jalau.at18.architects;

public class CardYellow extends Card {
    private final int wildcard = 1;
    @Override
    public String getColor() {
        return "Yellow";
    }
    public int getWildcard() {
        return wildcard;
    }
}
