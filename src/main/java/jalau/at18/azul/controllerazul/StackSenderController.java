package jalau.at18.azul.controllerazul;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
<<<<<<< HEAD


import jalau.at18.azul.Floor;
=======
import java.util.ArrayList;
import java.util.List;
import jalau.at18.azul.Tile;
import jalau.at18.azul.TileColor;
>>>>>>> d2ae7b82 (Fix pyramid add tiles logic)
import jalau.at18.azul.view.FloorButtons;
import jalau.at18.azul.view.PointerGroup;
import jalau.at18.azul.view.PyramidBoard;
import jalau.at18.azul.view.StackButtonGroup;
public class StackSenderController implements ActionListener {
    private StackButtonGroup stackButtonGroup;
    private PointerGroup pointerGroup;
    private PyramidBoard pyramidBoard;
    private FloorButtons floorButtons;
    private final int counter = 4;
    private int count;
    private Floor colorPyramidTilesList;

<<<<<<< HEAD
    public StackSenderController(StackButtonGroup newStack, PointerGroup newPointer, PyramidBoard newPyramid, FloorButtons newFloor, Floor floort) {
=======
   public StackSenderController(StackButtonGroup newStack, PointerGroup newPointer, PyramidBoard newPyramid,
            FloorButtons newFloor) {
>>>>>>> d2ae7b82 (Fix pyramid add tiles logic)
        count = counter;
        this.stackButtonGroup = newStack;
        this.pointerGroup = newPointer;
        this.pyramidBoard = newPyramid;
        this.floorButtons = newFloor;
        this.colorPyramidTilesList = floort;
    }

   @Override
    public void actionPerformed(ActionEvent e) {
        Tile emptyTile = new Tile(TileColor.EMPTY);
        boolean pyramidplay = false;
        stackButtonGroup.sentStackColorList();
        System.out.println(stackButtonGroup.getStackColorList().size());
        for (int index = 0; index < pointerGroup.getComponentCount(); index++) {
            if (e.getSource() == (pointerGroup.getComponent(index))) {
                count = pyramidBoard.sendEmptyTiles(index);
                for (int jindex = 0; jindex < stackButtonGroup.getStackColorList().size(); jindex++) {
                    if (pyramidBoard.countEmptyPyramidTiles(index) > 0) {
                        if ((pyramidBoard.getTileButton()[index][counter].getTileValue() == emptyTile.getColor().getName()) || (pyramidBoard.getTileButton()[index][counter].getTileValue() == stackButtonGroup.getStackColorList().get(0).getColor().getName())) {
                            pyramidBoard.updateTiles(index, count, stackButtonGroup.getStackColorList().get(jindex));
                            count--;
                            pyramidplay = true;
                        } else {
                            stackButtonGroup.getStackColorList().clear();
                            
                        }
                    } else {
                        System.out.println("Entro");
                        colorPyramidTilesList.add(stackButtonGroup.getStackColorList().get(jindex));
                        stackButtonGroup.clearStackList();
                        stackButtonGroup.getStackColorList().clear();
                    }
                }
            }
            floorButtons.updateButtonGroup(colorPyramidTilesList);
            count = counter;
            colorPyramidTilesList.clear();
            if (pyramidplay) {
                stackButtonGroup.clearStackList();
                stackButtonGroup.getStackColorList().clear();
            }
        }
    }
}