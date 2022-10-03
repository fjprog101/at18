package jalau.at18.architects.view;

import static jalau.at18.architects.view.Constants.WonderFrame.*;
import javax.swing.*;
import java.awt.*;

import javax.swing.JFrame;
import jalau.at18.architects.model.Game;
import jalau.at18.architects.model.player.Player;

public class GameOver extends JFrame {

    private static final int SIENCE_POSITION_X = 40;
    private static final int SIENCE_POSITION_Y = 500;
    private static final int SIENCE_WIDTH = 550;
    private static final int SIENCE_HEIGHT = 80;

    private static final int FONT_SIZE = 30;
    private static final int FONT_STYLE = 10;

    // public BoardFrame(Game game)
    public GameOver(Game game) {
        setContentPane(new JLabel(new ImageIcon("src/main/resources/architects/images/backimage.jpg")));
        add(new IcoColumn());

        int posY = 0;
        int maxPoints = 0;
        String winner = "";
        for (Player player : game.getPlayers()) {
            add(new ResultColumn(
                    player.getPlaycard().getBluePoints().getPoints(),
                    player.getPlaycard().getWarWinnerPoints().getPoints(),
                    player.getPlaycard().getResourceSection().checkPoints(),
                    0,
                    posY,
                    (posY++ * SIENCE_HEIGHT)));
            // add(new ResultColumn(1, 2, 3, 0, 5, (posY++ * 80)));
            // if(player.getPointsPlayer()> maxPoints){
            if (posY > maxPoints) {
                winner = player.getName();
            }
        }
        add(getWinner(winner));
        setTitle(WINDOW_NAME);
        setSize(DEFAULT_SIZE, DEFAULT_SIZE2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
    }

    public JLabel getWinner(String winner) {
        JLabel puntaje = new JLabel();
        puntaje.setBounds(SIENCE_POSITION_X, SIENCE_POSITION_Y, SIENCE_WIDTH, SIENCE_HEIGHT);
        puntaje.setText("El ganador es: " + winner);
        puntaje.setHorizontalAlignment(SwingConstants.CENTER);
        puntaje.setVerticalAlignment(SwingConstants.CENTER);
        puntaje.setFont(new Font("Arial Black", FONT_STYLE, FONT_SIZE));
        return puntaje;
    }
}
