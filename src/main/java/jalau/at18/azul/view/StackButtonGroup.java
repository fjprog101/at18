package jalau.at18.azul.view;

import java.util.List;

import javax.swing.JPanel;

import jalau.at18.azul.Tile;

public class StackButtonGroup extends JPanel {

    private final int posX = 515;
    private final int posY = 90;
    private final int height = 300;
    public StackButtonGroup(int y) {
        add(new StackTileButton());
        add(new StackTileButton());
        add(new StackTileButton());
        add(new StackTileButton());
        add(new StackTileButton());
        add(new StackTileButton());
        setBounds(posX, y, posY, height);
    }

    public void updateStackButtons(List<Tile> stackList) {
        for (int index = 0; index < stackList.size(); index++) {
            StackTileButton stackLabel = (StackTileButton) getComponent(index);
            Tile stackTileSource = stackList.get(index);
            stackLabel.updateLabel(stackTileSource.getColor().getName());
            stackLabel.updateColor(stackTileSource.getColor().getColorPath());
        }
    }
}
