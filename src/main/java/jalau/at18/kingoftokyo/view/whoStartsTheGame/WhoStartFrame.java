package jalau.at18.kingoftokyo.view.whoStartsTheGame;
import java.awt.BorderLayout;

import javax.swing.*;
////////////////////////

import jalau.at18.kingoftokyo.DiceFace;
import jalau.at18.kingoftokyo.DiceRoller;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/////////////////////////

public class WhoStartFrame extends JFrame {

    private static final int DEFAULT_POS = 30;
    private static final int DEFAULT_WIDTH = 1200;
    private static final int DEFAULT_HEIGHT = 700;

    //////////////////
    private static final int DEFAULT_LABEL_POSX = 800;
    private static final int DEFAULT_LABEL_POSY = 250;
    private static final int DEFAULT_LABEL_WIDTH = 20;
    private static final int DEFAULT_LABEL_HEIGHT = 20;
    private static final int INCREMENT_SPACE_LABEL = 20;
    private static final int QUANTITY_DICES = 6;
    private RollerButton rollerButton = new RollerButton();
    private List<DiceFaceLabel> listDiceFaceLabel = new ArrayList<>();

    //////////////////
    public WhoStartFrame() {
        PanelSouth panelcenter = new PanelSouth(this);

        setResizable(false);
        //////////////////////

        int count = 1;
        int posX = DEFAULT_LABEL_POSX;
        for (int index = 1; index <= QUANTITY_DICES; index++) {
            DiceFaceLabel diceFaceLabel = new DiceFaceLabel(String.valueOf(count), posX,
                    DEFAULT_LABEL_POSY, DEFAULT_LABEL_WIDTH, DEFAULT_LABEL_HEIGHT);
            listDiceFaceLabel.add(diceFaceLabel);
            add(diceFaceLabel);
            count++;
            posX = posX + INCREMENT_SPACE_LABEL;
        }
        add(rollerButton);

        rollerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DiceRoller diceRoller = new DiceRoller();
                List<DiceFace> listDiceFace = new ArrayList<>();
                listDiceFace = diceRoller.randomDice(QUANTITY_DICES);
                int count = 0;
                for (DiceFaceLabel diceFaceLabel : listDiceFaceLabel) {
                    diceFaceLabel.setIcon(generateIcon(listDiceFace.get(count)));
                    //setText(String.valueOf(listDiceFace.get(count).getRepresentativeValue()));
                    count++;
                }
            }
        });
        //////////////

        initialize();
        add(panelcenter, BorderLayout.SOUTH);

    }
    //////////////////////////
    private ImageIcon generateIcon(DiceFace diceFace) {
        String imagePath = "src/main/resources/kingoftokyo/";
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(imagePath + diceFace.getRepresentativeValue()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Image dimg = img.getScaledInstance(DEFAULT_LABEL_WIDTH, DEFAULT_LABEL_HEIGHT,
                Image.SCALE_SMOOTH);
        return new ImageIcon(dimg);
    } /////////////////////////

    private void initialize() {
        setBounds(DEFAULT_POS, DEFAULT_POS, DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setTitle("King of Tokyo");
        setVisible(true);
    }
}