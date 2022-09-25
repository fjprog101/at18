package jalau.at18.architects.controller;

import java.awt.event.MouseEvent;

import javax.swing.event.MouseInputListener;

import jalau.at18.architects.model.CardFace;
import jalau.at18.architects.model.Deck;
import jalau.at18.architects.view.CardLabel;

public class CardController implements MouseInputListener {
    private Deck deck;
    private CardLabel card;
    public CardController(CardLabel mazo) {
        deck = new Deck();
        card = mazo;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        CardFace cardFace = deck.getRamdomCard();
        String newImage = cardFace.getNameOfFile();
        card.setImage(newImage);
        System.out.println("Mouse just used");
    }
    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
    }
    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
    }
    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub
    }
}