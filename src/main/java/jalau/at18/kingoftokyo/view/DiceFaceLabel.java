package jalau.at18.kingoftokyo.view;

import jalau.at18.kingoftokyo.DiceFace;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class DiceFaceLabel extends JLabel {
    private static final int SIZE_ICON_WIDTH = 50;
    private static final int SIZE_ICON_HIGHT = 50;
    private boolean selected; // when user click a label
    private boolean initialize; // when the dice has DiceFace
    private DiceFace diceFace;

    public DiceFaceLabel() {
        setDiceFaceImage("question.png");
    }

    public boolean isSelected() {
        return selected;
    }

    public boolean isInitialize() {
        return initialize;
    }

    //This is when user click in some label/click mouse, already has a Dice Face
    public void paintDiceFace(DiceFace diceFacee) {
        this.diceFace = diceFacee;
        setDiceFaceImage(diceFace.getRepresentativeValue());
        initialize = true;
    }

    public DiceFace getPaintDiceFace() {
        return diceFace;
    }

    public void painQuestionMark() {
        setDiceFaceImage("question.png");
    }

    private void setDiceFaceImage(String image) {
        ImageIcon imageIcon = generateIcon(image);
        setIcon(imageIcon);
    }

    private ImageIcon generateIcon(String image) {
        String imagePath = "kingoftokyo/";
        BufferedImage bufferedImage = null;
        try {
            URL resource = getClass().getClassLoader().getResource(imagePath + image);
            bufferedImage = ImageIO.read(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimentionImage = bufferedImage.getScaledInstance(SIZE_ICON_WIDTH, SIZE_ICON_HIGHT, Image.SCALE_SMOOTH);
        return new ImageIcon(dimentionImage);
    }
}
