package jalau.at18.kingoftokyo.view;

import javax.swing.*;

public class FrameInit {
    private JFrame frame;
    
    public FrameInit(String title, int width, int height) {
        this.frame = new JFrame();
        this.frame.setTitle(title);
        this.frame.setResizable(false);
        this.frame.setSize(width,height);
        this.frame.setVisible(true);
    }

}
