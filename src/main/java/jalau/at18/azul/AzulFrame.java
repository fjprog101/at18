package jalau.at18.azul;

import javax.swing.*;
import java.awt.*;

public class AzulFrame extends JFrame{

   private JPanel player1;
   private JPanel player2;
   private JPanel factory;
   private static final int DEFAULT_POS = 305;
   private static final int DEFAULT_POS1 = 500;
   private static final int DEFAULT_SIZE = 300;
   private static final int DEFAULT_SIZE1 = 600;
public AzulFrame() {
    //this.setLayout(new BorderLayout());
    player1 = new JPanel();
    this.add(player1);
    player1.setBounds(0,0,DEFAULT_POS1,DEFAULT_SIZE);
    player1.setLayout(null);
    player1.setBorder(BorderFactory.createLineBorder(Color.red, 3));
    player2 = new JPanel();
    player2.setBounds(0,DEFAULT_POS,DEFAULT_POS1,DEFAULT_SIZE);
    player2.setLayout(null);
    player2.setBorder(BorderFactory.createLineBorder(Color.blue, 3));
    this.add(player2);
    factory = new JPanel();
    factory.setBounds(DEFAULT_POS1,0,DEFAULT_SIZE,DEFAULT_SIZE1);
    factory.setLayout(null);
    factory.setBorder(BorderFactory.createLineBorder(Color.black, 3));
    this.add(factory);
}
}
