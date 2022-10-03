package jalau.at18.architects.view;

import java.util.ArrayList;
import javax.swing.*;
class WonderStructure extends JPanel {
    public static final int QUANTITY_STAGES = 4;
    private ArrayList<JLabel> stages;
    private JLabel stage;

    WonderStructure() {
        generateWonder();
    }

    public void generateWonder() {
        setOpaque(false);
        GenerateWonder generate = new GenerateWonder();
        stages = generate.getJLabelStages();

    }
    public void buildStages(int quantity) {
        removeAll();
        stage = stages.get(quantity);
        add(stage);
    }
    public void showWonder() {
        stage = stages.get(0);
        add(stage);
    }
}
