package jalau.at18.architects.view;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ContantsTest {
    @Test
    public void shouldReturnValuesOfFinalClassWonderFrame() {
        Constants constants = new Constants();
        Constants.WonderFrame wonderFrame = constants.new WonderFrame();
        assertEquals(100, wonderFrame.DEFAULT_POS_X);
    }
    @Test
    public void shouldReturnValuesOfFinalClassLabel() {
        Constants constants = new Constants();
        Constants.Label label = constants.new Label();
        assertEquals(120, label.POS_X_LABEL);
    }
    @Test
    public void shouldReturnValuesOfFinalClassButton() {
        Constants constants = new Constants();
        Constants.Button button = constants.new Button();
        assertEquals(280, button.DEFAULT_POSX);
    }
    @Test
    public void shouldReturnValuesOfFinalClassComboBox() {
        Constants constants = new Constants();
        Constants.ComboBox comboBox = constants.new ComboBox();
        assertEquals(300, comboBox.POS_X);
    }
}
