package jalau.at18.architects.view;
import java.util.ArrayList;
import javax.swing.*;
import static jalau.at18.architects.view.Constants.WonderStructure.*;
class WonderStructure extends JPanel {
    public static final int QUANTITY_STAGES = 4;
    private int index = QUANTITY_STAGES;
    private ArrayList<JLabel> stages;
    private JLabel stage;
    WonderStructure() {
        generateWonder();
    }
    public void generateWonder() {
        setBounds(DEFAULT_POSX, DEFAULT_POSY, DEFAULT_WIDTH, DEFAULT_HEIGHT);
        GenerateWonder generate = new GenerateWonder();
        stages = generate.getJLabelStages();

    }
    public void addStage() {
        if (index >= 0) {
            stage = stages.get(index);
            setBounds(DEFAULT_POSX, DEFAULT_POSY, DEFAULT_WIDTH, DEFAULT_HEIGHT);
            add(stage);
            index--;
        }
    }
    public void buildStages(int quantity) {
        for (int ind = 0; ind < quantity; ind++) {
            addStage();
        }
    }
}
