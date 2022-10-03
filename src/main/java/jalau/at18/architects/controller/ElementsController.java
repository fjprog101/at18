package jalau.at18.architects.controller;

import jalau.at18.architects.model.cards.GrayCard;
import jalau.at18.architects.model.cards.Resource;
import jalau.at18.architects.model.cards.ShowTheElement;
import jalau.at18.architects.model.player.Player;
import jalau.at18.architects.view.ElementLabel;
import jalau.at18.architects.view.ResourcePanel;
import jalau.at18.architects.view.SciencePanel;
import jalau.at18.architects.view.PlayerStatus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ElementsController implements ActionListener {
    private PlayerStatus playerStatus;
    private ResourcePanel resourcePanel;
    private SciencePanel sciencePanel;
    private Player player;

    public ElementsController(PlayerStatus playerStatus, ResourcePanel resourcePanel, SciencePanel sciencePanel,
            Player player) {
        this.playerStatus = playerStatus;
        this.resourcePanel = resourcePanel;
        this.sciencePanel = sciencePanel;
        this.player = player;
        player.getWonder().fillStages();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ElementLabel elementLabel = new ElementLabel();
        elementLabel.setImage(ShowTheElement.directory);
        if (ShowTheElement.directory != "table.png" && ShowTheElement.directory != "compas.png"
                && ShowTheElement.directory != "rueda.png") {
            System.out.println("Resource bar");
            if (ShowTheElement.element == Resource.BRICK.getResource()) {
                System.out.println("Brick Choose");
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
            System.out.println(resourcePanel.getComponentCount());
        } else {
            System.out.println("Symbol bar");
            sciencePanel.loadCards(elementLabel);
            playerStatus.add(sciencePanel);
            playerStatus.repaint();
            playerStatus.revalidate();
        }
    }

    // public void compareList(){
    // if(player.getPlaycard().getResourceSection().compareCards(player.getWonder())){
    // System.out.println("Take elements out");
    // if(resourcePanel.getComponentCount() == 2){
    // System.out.println("Take two elements out");
    // resourcePanel.remove(0);
    // resourcePanel.remove(0);
    // // resourcePanel.remove(1);
    // playerStatus.add(resourcePanel);
    // } else if (resourcePanel.getComponentCount() == 3){
    // System.out.println("Take three elements out");
    // resourcePanel.remove(0);
    // resourcePanel.remove(0);
    // resourcePanel.remove(0);
    // playerStatus.add(resourcePanel);
    // } else if (resourcePanel.getComponentCount() == 4){
    // System.out.println("Take four elements out");
    // resourcePanel.remove(0);
    // resourcePanel.remove(0);
    // resourcePanel.remove(0);
    // resourcePanel.remove(0);
    // playerStatus.add(resourcePanel);
    // } else {
    // System.out.println("Keep the elements");
    // }
    // playerStatus.repaint();
    // playerStatus.revalidate();
    // }
    // }
}
