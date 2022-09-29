package jalau.at18.azul.view;

import javax.swing.*;
import jalau.at18.azul.model.Floor;
import java.awt.*;

public class PlayerPanel extends JPanel {
    private PyramidBoard pyramidBoard;
    private FloorButtons floorButtonGroup;
    private StackButtonGroup stackButtonGroup;
    private Floor floor;
    private WallBoard wallBoard;
    private ScoreLabel score;

    // private WinnerLabel winner;
    public PlayerPanel(int player, int posy, StackButtonGroup newStackButtonGroup) {
        pyramidBoard = new PyramidBoard();
        floorButtonGroup = new FloorButtons(floor);
        floor = new Floor();
        wallBoard = new WallBoard();
        score = new ScoreLabel(player);
        // winner = new WinnerLabel(player);
        stackButtonGroup = newStackButtonGroup;
        initializePlayerPanel();
        // add(winner, BorderLayout.PAGE_START);
        setBounds(Dimensions.PlayerPanel.DEFAULT_POSX_PLAYER_PANEL, posy,
                Dimensions.PlayerPanel.DEFAULT_WIDTH_PLAYER_PANEL, Dimensions.PlayerPanel.DEFAULT_HEIGHT_PLAYER_PANEL);
        setBorder(BorderFactory.createLineBorder(Color.BLUE));
    }

    public void initializePlayerPanel() {
        setLayout(new BorderLayout(Dimensions.PlayerPanel.HORIZONTAL_GAP_PLAYER_PANEL,
                Dimensions.PlayerPanel.VERTIXCAL_GAP_PLAYER_PANEL));
        add(new PointerGroup(stackButtonGroup, pyramidBoard, floorButtonGroup, floor), BorderLayout.LINE_START);
        add(pyramidBoard, BorderLayout.CENTER);
        add(wallBoard, BorderLayout.LINE_END);
        add(floorButtonGroup, BorderLayout.PAGE_END);
        add(score, BorderLayout.PAGE_START);
    }

    public FloorButtons getfloorButtonGroup() {
        return this.floorButtonGroup;
    }

    public PyramidBoard getPyramidBoard() {
        return this.pyramidBoard;
    }

    public WallBoard getWallBoard() {
        return this.wallBoard;
    }

    public ScoreLabel getScore() {
        return this.score;
    }

    public Floor getfloor() {
        return this.floor;
    }

}