package jalau.at18.azul.view;

import javax.swing.JLabel;

public class ScoreLabel extends JLabel{
    public ScoreLabel(int player) {
        super("Player" + player +  ": " + "                                      "+ "0");
    }

    public void updateLabel(int newText, int player) {
        this.setText("Player" + player +  ": " + "                                      " + newText);
    }
}

