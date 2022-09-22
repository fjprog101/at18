package jalau.at18.azul.view;
import java.awt.GridLayout;
import javax.swing.JPanel;

import jalau.at18.azul.Tile;
import jalau.at18.azul.TileColor;

public class PyramidBoard extends JPanel {

    public static final int WIDTH = 220;
    public static final int HEIGHT = 120;
    private final int pyramidMatrixSize = 5;
    private PyramidTileButton[][] tileButton = new PyramidTileButton[pyramidMatrixSize][pyramidMatrixSize];
    private Tile emptyTile = new Tile(TileColor.EMPTY);
    private final int dividePyramid = 4;

    public PyramidBoard() {
        setLayout(new GridLayout(pyramidMatrixSize, pyramidMatrixSize, pyramidMatrixSize, pyramidMatrixSize));
        setBounds(0, 0, WIDTH, HEIGHT);
        getPyramid();
    }

    public void getPyramid() {
        for (int row = 0; row < pyramidMatrixSize; row++) {
            for (int column = 0; column < pyramidMatrixSize; column++) {
                tileButton[row][column] = new PyramidTileButton();
                if (row + column >= dividePyramid) {
                    tileButton[row][column].updateLabel(emptyTile.getColor().getName());
                    add(tileButton[row][column]);
                } else {
                    tileButton[row][column].hideButton();
                    add(tileButton[row][column]);
                }
            }
        }
    }
}