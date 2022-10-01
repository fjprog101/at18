package jalau.at18.architects.controller;
import jalau.at18.architects.model.Game;
import jalau.at18.architects.view.WondersFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Controller implements ActionListener {
    private WondersFrame wondersFrame;
    private static final int QUANTITY_COMPONENTS = 4;
    private boolean pressedCheckBox = false;
    public Controller(WondersFrame frame) {
        this.wondersFrame = frame;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == wondersFrame.getButton() && pressedCheckBox) {
            wondersFrame.getTextField();
            int numberOfPlayers = Integer.valueOf(wondersFrame.getChoice().getSelectedItem().toString());
            Game game = Game.getInstance();
            List<String> names = wondersFrame.getPlayersNames();
            game.initGame(numberOfPlayers, names);
            wondersFrame.closeWindow(game);
        } else if (e.getSource() == wondersFrame.getChoice()) {
            wondersFrame.setLabels("Game players: " + wondersFrame.getChoice().getSelectedItem().toString());
            pressedCheckBox = true;
            if (wondersFrame.getContentPane().getComponentCount() == QUANTITY_COMPONENTS) {
                wondersFrame.getContentPane().remove(QUANTITY_COMPONENTS - 1);
            }
            wondersFrame.addNewComponents(Integer.parseInt(wondersFrame.getChoice().getSelectedItem().toString()));
            wondersFrame.repaint();
            wondersFrame.revalidate();

        }
    }
}


