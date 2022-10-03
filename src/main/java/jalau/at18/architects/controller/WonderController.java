package jalau.at18.architects.controller;

import jalau.at18.architects.model.BuildStage;
import jalau.at18.architects.model.player.Player;
import jalau.at18.architects.view.PlayerStatus;
import jalau.at18.architects.view.ResourcePanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WonderController implements ActionListener {
    private BuildStage buildStage;
    private PlayerStatus playerStatus;
    private Player player;
    private ResourcePanel resourcePanel;
    private static final int THREE = 3;
    private static final int FOUR = 3;
    private static final int FIVE = 3;

    public WonderController(BuildStage buildStage, PlayerStatus playerStatus, Player player,
            ResourcePanel resourcePanel) {
        // this.boardFrame = frame;
        this.buildStage = buildStage;
        this.playerStatus = playerStatus;
        this.player = player;
        this.resourcePanel = resourcePanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Size of List: " + player.getPlaycard().getResourceSection().sizeOfUpdateList());
        System.out.println("Components number: " + resourcePanel.getComponentCount());
        if (player.getPlaycard().getResourceSection().compareCards(player.getWonder())) {
            System.out.println("Number of Stage: " + buildStage.getStagesCompleted());
            if ((buildStage.getStagesCompleted() < 2)
                    && resourcePanel.getComponentCount() == 2) {
                System.out.println("Take two elements out");
                resourcePanel.remove(0);
                resourcePanel.remove(0);
                playerStatus.add(resourcePanel);
                buildStage.buildStage();
                playerStatus.addStage(buildStage.getStagesCompleted());
            } else if ((buildStage.getStagesCompleted() > 2 && buildStage.getStagesCompleted() <= FOUR)
                    && resourcePanel.getComponentCount() == THREE) {
                System.out.println("Take three elements out");
                resourcePanel.remove(0);
                resourcePanel.remove(0);
                resourcePanel.remove(0);
                playerStatus.add(resourcePanel);
                buildStage.buildStage();
                playerStatus.addStage(buildStage.getStagesCompleted());
            } else if ((buildStage.getStagesCompleted() == FIVE)
                    && resourcePanel.getComponentCount() == FOUR) {
                System.out.println("Take four elements out");
                resourcePanel.remove(0);
                resourcePanel.remove(0);
                resourcePanel.remove(0);
                resourcePanel.remove(0);
                playerStatus.add(resourcePanel);
                buildStage.buildStage();
                playerStatus.addStage(buildStage.getStagesCompleted());
            } else {
                System.out.println("Keep the elements");
            }
            playerStatus.repaint();
            playerStatus.revalidate();
        } else {
            System.out.println("ListEmpty");
            playerStatus.repaint();
            playerStatus.revalidate();
        }
    }
    // player.setName("Alvaro");
    // player.nextPLayer();
}