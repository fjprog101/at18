package jalau.at18.architects.model.cards;

public class ShowTheElement {
    public static String directory;
    public static String element;
    public static Card cardToPlayer;
    public ShowTheElement(Card card) {
        if (card.getColor() == "Gray") {
            directory = ((GrayCard) card).getImage();
            element = ((GrayCard) card).getResource();
        } else if (card.getColor() == "Green") {
            directory = ((GreenCard) card).getImage();
            element = ((GreenCard) card).getSymbol();
        }
        cardToPlayer = card;
    }

}
