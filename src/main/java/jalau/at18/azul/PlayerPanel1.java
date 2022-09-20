package jalau.at18.azul;

import javax.swing.*;


import java.awt.*;

public class PlayerPanel1 extends JPanel {

    public PlayerPanel1(int default_posx, int default_posy, int default_size, int default_size2) {
        setBounds(default_posx, default_posy, default_size, default_size2);
        setBorder(BorderFactory.createLineBorder(Color.BLUE));
    }
}
