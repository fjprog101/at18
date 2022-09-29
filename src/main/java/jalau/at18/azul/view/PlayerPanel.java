package jalau.at18.azul.view;

import javax.swing.*;

import jalau.at18.azul.Floor;

import java.awt.*;

public class PlayerPanel extends JPanel {
    public static final int DEFAULT_POSX = 10;
    public static final int DEFAULT_POSY = 0;
    public static final int DEFAULT_WIDTH = 700;
    public static final int DEFAULT_HEIGHT = 350;
    public static final int HORIZONTAL_GAP = 30;
    public static final int VERTIXCAL_GAP = 50;
    private PyramidBoard pyramidBoard;
    private FloorButtons floorButtonGroup;
    private StackButtonGroup stackButtonGroup;
    private Floor floor;
    private WallBoard wallBoard;
    private ScoreLabel score;
  //  private WinnerLabel winner;
    public PlayerPanel(int player, int posy, StackButtonGroup newStackButtonGroup) {
        pyramidBoard = new PyramidBoard();
        floorButtonGroup = new FloorButtons(floor);
        floor = new Floor();
        wallBoard = new WallBoard();
        score = new ScoreLabel(player);
     //   winner = new WinnerLabel(player);
        stackButtonGroup = newStackButtonGroup;
        setLayout(new BorderLayout(HORIZONTAL_GAP, VERTIXCAL_GAP));
        add(new PointerGroup(stackButtonGroup, pyramidBoard, floorButtonGroup, floor), BorderLayout.LINE_START);
        add(pyramidBoard, BorderLayout.CENTER);
        add(wallBoard, BorderLayout.LINE_END);
        add(floorButtonGroup, BorderLayout.PAGE_END);
        add(score, BorderLayout.PAGE_START);
       // add(winner, BorderLayout.PAGE_START);
        setBounds(DEFAULT_POSX, posy, DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setBorder(BorderFactory.createLineBorder(Color.BLUE));
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