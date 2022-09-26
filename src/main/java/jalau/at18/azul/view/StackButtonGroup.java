package jalau.at18.azul.view;

import java.util.List;

import javax.swing.JPanel;

import jalau.at18.azul.Tile;

public class StackButtonGroup extends JPanel {
    public StackButtonGroup(int y){
        add(new StackTileButton());
        add(new StackTileButton());
        add(new StackTileButton());
        add(new StackTileButton());
        setBounds(515, y, 90, 200);
    }

    public void updateStackButtons(List<Tile> stackList) {
        for (int index = 0; index < stackList.size(); index++) {
            StackTileButton stackLabel = (StackTileButton) getComponent(index);
            Tile stackTileSource = stackList.get(index);
            stackLabel.updateLabel(stackTileSource.getColor().getName());
        }
    }
}
