package jalau.at18.architects.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jalau.at18.architects.model.player.Player;
import jalau.at18.architects.model.wonders.Wonders;
import jalau.at18.architects.model.cards.Card;
import jalau.at18.architects.view.BoardFrame;
import jalau.at18.architects.view.ResourceLabel;

public class ResourceController implements ActionListener {
    private Card card;
    private BoardFrame boardFrame;

    public ResourceController(Card card, BoardFrame boardFrame) {
        this.card = card;
        this.boardFrame = boardFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Player player = new Player("Mauricio", Wonders.ONE);
        player.addNewCard(card);
        ResourceLabel resourceLabel = new ResourceLabel(
                player.getPlaycard().getResourceSection().getUpdateList().getAResource(0));
        boardFrame.add(resourceLabel);
        boardFrame.validate();
    }
}
