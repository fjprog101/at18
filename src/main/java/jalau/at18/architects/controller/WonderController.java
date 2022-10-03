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
    private static final int FOUR = 4;

    public WonderController(BuildStage buildStage, PlayerStatus playerStatus, Player player,
            ResourcePanel resourcePanel) {
        this.buildStage = buildStage;
        this.playerStatus = playerStatus;
        this.player = player;
        this.resourcePanel = resourcePanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Size of List: " + player.getPlaycard().getResourceSection().sizeOfUpdateList());
        System.out.println("Components number: " + resourcePanel.getComponentCount());
        if (buildStage.getStagesCompleted() < 2) {
            System.out.println("Number of Stage: " + buildStage.getStagesCompleted());
            if (resourcePanel.getComponentCount() == 2) {
                if ((player.getPlaycard().getResourceSection().compareCards(player.getWonder()))) {
                    System.out.println("Take two elements out");
                    resourcePanel.remove(0);
                    resourcePanel.remove(0);
                    playerStatus.add(resourcePanel);
                    buildStage.buildStage();
                    playerStatus.addStage(buildStage.getStagesCompleted());
                    playerStatus.unableAddStagesButton();
                } else {
                    System.out.println("Keep the elements");
                }
                playerStatus.repaint();
                playerStatus.revalidate();
            } else {
                System.out.println("It is not exist 2 elements");
                playerStatus.repaint();
                playerStatus.revalidate();
            }

        } else if ((buildStage.getStagesCompleted() >= 2 && buildStage.getStagesCompleted() < FOUR)) {
            System.out.println("Number of Stage: " + buildStage.getStagesCompleted());
            if (resourcePanel.getComponentCount() == THREE) {
                if ((player.getPlaycard().getResourceSection().compareCards(player.getWonder()))) {
                    System.out.println("Take three elements out");
                    resourcePanel.remove(0);
                    resourcePanel.remove(0);
                    resourcePanel.remove(0);
                    playerStatus.add(resourcePanel);
                    buildStage.buildStage();
                    playerStatus.addStage(buildStage.getStagesCompleted());
                    playerStatus.unableAddStagesButton();
                } else {
                    System.out.println("Keep the elements");
                }
                playerStatus.repaint();
                playerStatus.revalidate();
            } else {
                System.out.println("It is not exist 3 elements");
                playerStatus.repaint();
                playerStatus.revalidate();
            }
        } else if ((buildStage.getStagesCompleted() == FOUR)) {
            System.out.println("Number of Stage: " + buildStage.getStagesCompleted());
            if (resourcePanel.getComponentCount() == FOUR) {
                if ((player.getPlaycard().getResourceSection().compareCards(player.getWonder()))) {
                    System.out.println("Take four elements out");
                    resourcePanel.remove(0);
                    resourcePanel.remove(0);
                    resourcePanel.remove(0);
                    resourcePanel.remove(0);
                    playerStatus.add(resourcePanel);
                    buildStage.buildStage();
                    playerStatus.addStage(buildStage.getStagesCompleted());
                    playerStatus.unableAddStagesButton();
                } else {
                    System.out.println("Keep the elements");
                }
                playerStatus.repaint();
                playerStatus.revalidate();
            } else {
                System.out.println("It is not exist 4 elements");
                playerStatus.repaint();
                playerStatus.revalidate();
            }
        } else {
            System.out.println("ListEmpty");
            playerStatus.repaint();
            playerStatus.revalidate();
        }
    }
}