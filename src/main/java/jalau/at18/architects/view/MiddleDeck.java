package jalau.at18.architects.view;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
public class MiddleDeck extends JPanel{
    public String direction = "src/main/java/jalau/at18/resources/images/reverse.jpg";
    MiddleDeck() {
        initComponets();
        loadCards();
    }
    private void initComponets() {
        //setLayout(new GridLayout(1, 2));
    }
    private void loadCards() {
        setBounds(400, 5, 200, 250);
        JLabel mazo = new JLabel();
        mazo.setBounds(410, 10, 100, 150);
        ImageIcon image = new ImageIcon(direction);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(mazo.getWidth(), mazo.getHeight(), Image.SCALE_DEFAULT));
        mazo.setIcon(icon);
        add(mazo);
        repaint();
        setVisible(true);
    }
}