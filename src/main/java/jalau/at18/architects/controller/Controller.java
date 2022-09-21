package jalau.at18.architects.controller;
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
        System.out.println("");
    }
}

