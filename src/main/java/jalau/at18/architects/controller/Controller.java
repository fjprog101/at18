package jalau.at18.architects.controller;
import jalau.at18.architects.view.WondersFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    private WondersFrame wondersFrame;
    private boolean pressedCheckBox = false;
    public Controller(WondersFrame frame) {
        this.wondersFrame = frame;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == wondersFrame.getButton() && pressedCheckBox) {
            wondersFrame.getTextField();
            wondersFrame.closeWindow();

        } else if (e.getSource() == wondersFrame.getChoice()) {
            wondersFrame.setLabels("Game players: " + wondersFrame.getChoice().getSelectedItem().toString());
            pressedCheckBox = true;
            wondersFrame.addNewComponents(Integer.parseInt(wondersFrame.getChoice().getSelectedItem().toString()));

        }
    }
}


