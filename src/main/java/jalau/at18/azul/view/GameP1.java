package jalau.at18.azul.view;

import jalau.at18.azul.model.Tile;
import jalau.at18.azul.model.TileColor;
import jalau.at18.azul.model.PyramidMovements;


public class GameP1 {
    private int scoreP1 = 0;
    private PyramidMovements movements;
    private PlayerPanel player1;
    private int deductionP1 = 0;
    private static final int PYRAMID_INDEX = 4;

    public GameP1(PlayerPanel newPlayer1) {
        this.player1 = newPlayer1;
        movements = new PyramidMovements(player1.getPyramidBoard());
    }
    public void player(int index, int column, PlayerPanel playerOne) {
        if (movements.countEmptyPyramidTiles(index) == 0) {
            Tile tileSelected = new Tile(TileColor.valueOf(playerOne.getPyramidBoard().getTileButton()[index][PYRAMID_INDEX].getTileValue()));
            playerOne.getWallBoard().verifyTileWall(index, tileSelected);
            movements.cleanPyramid(index);
            deductionP1 = (playerOne.getfloor()).pointsDeducted();
            scoreP1++;
            playerOne.getScore().updateLabel(scoreP1 - deductionP1, 1);
            if (playerOne.getWallBoard().verifyRowWall(index)) {
                System.out.println("winner is player1");
            }
        }
    }
}
