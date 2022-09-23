package jalau.at18.architects.view;

import javax.swing.JPanel;

public class MiddleDeck extends JPanel{
    private CardLabel mazo;
    private CardLabel card;
    MiddleDeck() {
        mazo = new CardLabel();
        card = new CardLabel();
        setBounds(10, 200, 150, 70);
        setVisible(true);
        addCards();
    }
    private void addCards() {
        add(mazo);
        add(card);
        this.repaint();
    }
}