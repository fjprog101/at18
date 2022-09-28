package jalau.at18.kingoftokyo.view.general;

import javax.swing.*;
import java.awt.*;

public class MonsterList extends JComboBox {
    private static final String FONT_NAME = "Serif";
    private static final int FONT_SIZE = 18;
    public MonsterList() {
        super();
        new JComboBox<String>();
        addItem("Gigazaur");
        addItem("Kitty");
        addItem("something");
        addItem("other");
        setFont(new Font(FONT_NAME, Font.BOLD, FONT_SIZE));
    }
}
