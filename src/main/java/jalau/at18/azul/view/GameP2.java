package jalau.at18.azul.view;

import jalau.at18.azul.model.Tile;
import jalau.at18.azul.model.TileColor;
import jalau.at18.azul.model.PyramidMovements;

public class GameP2 {
    private int scoreP2 = 0;
    private PyramidMovements movements;
    private PlayerPanel player2;
    private int deductionP1 = 0;
    private static final int PYRAMID_INDEX = 4;

    public GameP2(PlayerPanel newPlayer2) {
        this.player2 = newPlayer2;
        movements = new PyramidMovements(player2.getPyramidBoard());
    }
    public void player(int index, int column, PlayerPanel playertwo) {
        if (movements.countEmptyPyramidTiles(index) == 0) {
            Tile tileSelected = new Tile(TileColor.valueOf(playertwo.getPyramidBoard().getTileButton()[index][PYRAMID_INDEX].getTileValue()));
            playertwo.getWallBoard().verifyTileWall(index, tileSelected);
            movements.cleanPyramid(index);
            deductionP1 = (playertwo.getfloor()).pointsDeducted();
            scoreP2++;
            playertwo.getScore().updateLabel(scoreP2 - deductionP1, 2);
            if (playertwo.getWallBoard().verifyRowWall(index)) {
                System.out.println("winner is player1");
            }
        }
    }
}
