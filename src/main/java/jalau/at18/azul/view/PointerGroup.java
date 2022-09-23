package jalau.at18.azul.view;

import java.io.IOException;

import javax.swing.JPanel;

public class PointerGroup extends JPanel {
    public PointerGroup(int posx, int posy, int width, int height) {
        add(new PyramidPointer());
        add(new PyramidPointer());
        add(new PyramidPointer());
        add(new PyramidPointer());
        add(new PyramidPointer());
        setBounds(posx, posy, width, height);
    }
}
