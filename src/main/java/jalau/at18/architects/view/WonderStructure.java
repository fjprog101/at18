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
        // setBounds(DEFAULT_POSX, DEFAULT_POSY, DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setOpaque(false);
        GenerateWonder generate = new GenerateWonder();
        stages = generate.getJLabelStages();

    }
    // public void addStage() {

    // if (index >= 0) {
    // stage = stages.get(index);
    // // setBounds(DEFAULT_POSX, DEFAULT_POSY, DEFAULT_WIDTH, DEFAULT_HEIGHT);
    // add(stage);
    // index--;
    // }
    // }
    // public void buildStages(int quantity) {
    // for (int ind = 0; ind < quantity; ind++) {
    // addStage();
    // }
    // index = QUANTITY_STAGES;
    // }
    public void buildStages(int quantity) {
        // for (int ind = 0; ind < quantity; ind++) {
        // remove(stage);
        // stage.setIcon(null);
        removeAll();
        stage = stages.get(quantity);

        add(stage);
        // setBounds(DEFAULT_POSX, DEFAULT_POSY, DEFAULT_WIDTH, 500);
        // repaint();
        // }
    }
    public void showWonder() {
        stage = stages.get(0);
        add(stage);
    }
}
