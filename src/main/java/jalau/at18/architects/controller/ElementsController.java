package jalau.at18.architects.controller;

import static jalau.at18.architects.view.Constants.PlayStatusConstants.*;
import jalau.at18.architects.model.cards.Card;
import jalau.at18.architects.model.cards.GrayCard;
import jalau.at18.architects.model.cards.RedCard;
import jalau.at18.architects.model.cards.Resource;
import jalau.at18.architects.model.cards.ShowTheElement;
import jalau.at18.architects.model.player.Player;
import jalau.at18.architects.view.BluePointsView;
import jalau.at18.architects.view.ElementLabel;
import jalau.at18.architects.view.MilitaryPanelView;
import jalau.at18.architects.view.ResourcePanel;
import jalau.at18.architects.view.SciencePanel;
import jalau.at18.architects.view.WarWinnerPointsView;
import jalau.at18.architects.view.PlayerStatus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ElementsController implements ActionListener {
    private PlayerStatus playerStatus;
    private ResourcePanel resourcePanel;
    private SciencePanel sciencePanel;
    private Player player;
    private Card card;
    private BluePointsView bluePointsView;
    private WarWinnerPointsView warWinnerPointsView;
    private MilitaryPanelView militaryPanel;

    public ElementsController(PlayerStatus playerStatus, ResourcePanel resourcePanel, SciencePanel sciencePanel,
            Player player) {
        this.playerStatus = playerStatus;
        this.resourcePanel = resourcePanel;
        this.sciencePanel = sciencePanel;
        this.player = player;
        warWinnerPointsView = new WarWinnerPointsView(player.getPlaycard().getWarWinnerPoints());
        player.getWonder().fillStages();
        bluePointsView = new BluePointsView(player.getPlaycard().getBluePoints());
        militaryPanel = new MilitaryPanelView(player.getPlaycard().getMilitarySection());

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // bluePointsView.removeAll();
        // System.out.println("blue" +
        // player.getPlaycard().getBluePoints().getPoints());
        ElementLabel elementLabel = new ElementLabel();
        elementLabel.setImage(ShowTheElement.directory);
        // warWinnerPointsView.setBounds(WAR_POINT_POSITION_X, WAR_POINT_POSITION_Y,
        // POINT_WIDTH, POINT_HEIGHT);
        // playerStatus.add(warWinnerPointsView);
        bluePointsView.setBounds(BLUE_POINT_POSITION_X, BLUE_POINT_POSITION_Y, POINT_WIDTH, POINT_HEIGHT);
        playerStatus.add(bluePointsView);
        militaryPanel.setBounds(MILITARY_PANEL_POS_X, MILITARY_PANEL_POS_Y, MILITARY_PANEL_WIDTH,
                MILITARY_PANEL_HEIGHT);
        playerStatus.add(militaryPanel);
        card = ShowTheElement.cardToPlayer;
        if ((card.getColor() == "Yellow" || card.getColor() == "Gray") && (player.getPlaycard().getResourceSection()
                .sizeOfUpdateList() == resourcePanel.getComponentCount())) {
            // System.out.println("Resource bar");
            System.out.println("Resource bar");
            elementLabel.setImage(ShowTheElement.directory);
            if (ShowTheElement.element == Resource.BRICK.getResource()) {
                // System.out.println("Brick Choose");
                player.addNewCard(new GrayCard(Resource.BRICK));
            } else if (ShowTheElement.element == Resource.PAPER.getResource()) {
                player.addNewCard(new GrayCard(Resource.PAPER));
            } else if (ShowTheElement.element == Resource.WATER.getResource()) {
                player.addNewCard(new GrayCard(Resource.WATER));
            } else if (ShowTheElement.element == Resource.WOOD.getResource()) {
                player.addNewCard(new GrayCard(Resource.WOOD));
            } else if (ShowTheElement.element == Resource.STONE.getResource()) {
                player.addNewCard(new GrayCard(Resource.STONE));
            } else {
                player.addNewCard(new GrayCard(Resource.GOLD));
            }
            resourcePanel.loadCards(elementLabel);
            playerStatus.add(resourcePanel);
            playerStatus.repaint();
            playerStatus.revalidate();
            ShowTheElement.directory = null;

        } else if (card.getColor() == "Red") {
            RedCard redCard = (RedCard) card;
            player.addNewCard(card);
            if (redCard.getHorns() == 0) {
                militaryPanel.setNumberPermanent(player.getPlaycard().getMilitarySection().getPermanentShield());
            } else {
                militaryPanel.setNumberTemporal(player.getPlaycard().getMilitarySection().getTemporalShield());
            }

        } else if (card.getColor() == "Blue") {
            player.addNewCard(card);
            bluePointsView.setNumber(player.getPlaycard().getBluePoints().getPoints());
        } else if (card.getColor() == "Green") {
            elementLabel.setImage(ShowTheElement.directory);
            System.out.println("Symbol bar");
            sciencePanel.loadCards(elementLabel);
            playerStatus.add(sciencePanel);
            playerStatus.repaint();
            playerStatus.revalidate();
            ShowTheElement.directory = null;
        } else {
            System.out.println("No card color");
        }
    }
}
