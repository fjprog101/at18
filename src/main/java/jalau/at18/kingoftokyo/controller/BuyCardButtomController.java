package jalau.at18.kingoftokyo.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jalau.at18.kingoftokyo.model.CompleteCard;
import jalau.at18.kingoftokyo.model.DeckCards;
import jalau.at18.kingoftokyo.model.Player;
import jalau.at18.kingoftokyo.model.Turn;
import jalau.at18.kingoftokyo.view.card.*;

public class BuyCardButtomController implements ActionListener {
    private CardPanel cardPanel;
    private DialogsController dialog;
    private Turn turn;

    public BuyCardButtomController(Turn turn, CardPanel cardPanel) {
        this.turn = turn;
        this.cardPanel = cardPanel;
        dialog = new DialogsController();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (enoughEnergy()) {
            buyCard();
        } else {
            dialog.showErrorMessage();
        }
    }
    public void buyCard() {
        Player playerWithTurn = turn.getPlayerWithTheTurn();
        if (dialog.confirmBuyDialogResult(((CardNameLabel) cardPanel.getComponent(1)))) {
            playerWithTurn.setEnergy(playerWithTurn.getEnergy() - ((CompleteCard) cardPanel.getCard()).getCard().getCost());
            ((CardsGroupPanel) cardPanel.getParent()).sendEffect(((CompleteCard) cardPanel.getCard()).getCard().getEffect());
            setCardPanel();
        }
    }
    public void setCardPanel() {
        DeckCards deck = ((CardsGroupPanel) cardPanel.getParent()).getDeck();
        CompleteCard card = (CompleteCard) deck.getRandomCard();
        deck.removeCard(card);
        cardPanel.setCard(card);
    }
    public boolean enoughEnergy() {
        Player playerWithTurn = turn.getPlayerWithTheTurn();
        boolean enoughEnergy = false;
        if (playerWithTurn.getEnergy() >= ((CompleteCard) cardPanel.getCard()).getCard().getCost()) {
            enoughEnergy = true;
        }
        return enoughEnergy;
    }
}