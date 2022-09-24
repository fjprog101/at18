package jalau.at18.architects.controller;
import jalau.at18.architects.view.BoardFrame;
import jalau.at18.architects.view.WondersFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    private WondersFrame wondersFrame;
    public Controller(WondersFrame frame) {
        this.wondersFrame = frame;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == wondersFrame.getButton()) {
            wondersFrame.getContentPane().removeAll();
            wondersFrame.repaint();
            System.out.println("Pressed start");
            // wondersFrame.addNewComponents();
        }
        wondersFrame.setLabels("Game players: " + wondersFrame.getChoice().getSelectedItem().toString());
        wondersFrame.setVisible(false);
        new BoardFrame(wondersFrame.getChoice().getSelectedItem().toString());
    }
}


