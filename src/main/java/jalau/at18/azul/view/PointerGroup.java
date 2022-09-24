package jalau.at18.azul.view;

import javax.swing.JPanel;

public class PointerGroup extends JPanel {
    public PointerGroup() {
        add(new PyramidPointer());
        add(new PyramidPointer());
        add(new PyramidPointer());
        add(new PyramidPointer());
        add(new PyramidPointer());
    }
}
