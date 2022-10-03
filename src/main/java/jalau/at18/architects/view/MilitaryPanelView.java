package jalau.at18.architects.view;
import javax.swing.JPanel;
import jalau.at18.architects.model.cards.MilitaryStrengthCounter;

public class MilitaryPanelView extends JPanel {


    private static final int MILITARY_P_POSITION_X = 400;
    private static final int MILITARY_P_POSITION_Y = 600;
    private static final int MILITARY_P_WIDTH = 100;
    private static final int MILITARY_P_HEIGHT = 100;
    private MilitaryNumberPermanent militaryPermanent;
    private MilitaryNumberTemporal militaryTemporal;
    //private MilitaryNumberPermanent militaryPermanent;
    //private MilitaryNumberTemporal militaryTemporal;
    public MilitaryPanelView(MilitaryStrengthCounter militarySection) {
        setOpaque(false);
        setBounds(MILITARY_P_POSITION_X, MILITARY_P_POSITION_Y, MILITARY_P_WIDTH, MILITARY_P_HEIGHT);
        setLayout(null);
        militaryPermanent = new MilitaryNumberPermanent(militarySection);
        militaryTemporal = new MilitaryNumberTemporal(militarySection);
        initialize();
    }
    public void initialize() {
        add(militaryPermanent);
        add(militaryTemporal);
    }
    public void setNumberPermanent(int number) {
        militaryPermanent.setNumber(number);
    }
    public void setNumberTemporal(int number) {
        militaryTemporal.setNumber(number);
    }

}



