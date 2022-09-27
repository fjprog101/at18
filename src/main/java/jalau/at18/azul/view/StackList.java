package jalau.at18.azul.view;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;

import jalau.at18.azul.StackTileBoard;
import jalau.at18.azul.Tile;
import jalau.at18.azul.TileColor;

public class StackList extends JPanel {
    private JList<String> stack;

    public StackList(int positionx, int positiony, int width, int height) {
        StackTileBoard stackTiles = new StackTileBoard();
        stackTiles.add(new Tile(TileColor.EMPTY));
        stackTiles.add(new Tile(TileColor.EMPTY));
        stackTiles.add(new Tile(TileColor.EMPTY));
        stackTiles.add(new Tile(TileColor.EMPTY));
        stackTiles.add(new Tile(TileColor.EMPTY));
        stackTiles.add(new Tile(TileColor.EMPTY));
        DefaultListModel<String> stackList = new DefaultListModel<>();
        for (int pos = 0; pos < stackTiles.size(); pos++) {
            stackList.addElement((stackTiles.get(pos)).toString());
        }
        stack = new JList<String>(stackList);
        add(stack);
        setBounds(positionx, positiony, width, height);
    }
}
