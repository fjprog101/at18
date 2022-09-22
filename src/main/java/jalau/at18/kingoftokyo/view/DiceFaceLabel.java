package jalau.at18.kingoftokyo.view;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class DiceFaceLabel extends JLabel {
    private static final int SIZE_ICON_WIDTH = 50;
    private static final int SIZE_ICON_HIGHT = 50;

    public DiceFaceLabel() {
        setDiceFaceImage("question.png");
    }

    public void setDiceFaceImage(String image) {
        ImageIcon imageIcon = generateIcon(image);
        setIcon(imageIcon);
    }

    private ImageIcon generateIcon(String image) {
        String imagePath = "kingtokyo/";
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
