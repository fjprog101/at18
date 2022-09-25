package jalau.at18.architects.view;
import java.util.ArrayList;
import javax.swing.*;
public class GenerateWonder extends JPanel {
    public static final int HEIGHT = 100;
    public static final int MIDDLE = 50;
    public static final int TRIANGLE_TIPS = 3;
    private String stageOne = "src/main/resources/architects/images/stage1.png";
    private String stageTwo = "src/main/resources/architects/images/stage2.png";
    private String stageThree = "src/main/resources/architects/images/stage3.png";
    private String stageFour = "src/main/resources/architects/images/stage4.png";
    private String stageFive = "src/main/resources/architects/images/stage5.png";
    private ArrayList<JLabel> stages;
    public GenerateWonder() {
        stages = new ArrayList<>();
        stages.add(new StagesWonder(stageOne));
        stages.add(new StagesWonder(stageTwo));
        stages.add(new StagesWonder(stageThree));
        stages.add(new StagesWonder(stageFour));
        stages.add(new StagesWonder(stageFive));
    }
    public ArrayList<JLabel> getJLabelStages() {
        return stages;
    }
}