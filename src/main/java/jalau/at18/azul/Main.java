package jalau.at18.azul;

public class Main {
    private static final int DEFAULT_POS = 200;
    private static final int DEFAULT_SIZE = 900;
    private static final int DEFAULT_SIZE1 = 600;

    public static void main(String[] args) {
        AzulFrame player = new AzulFrame();
        player.setVisible(true);
        player.setBounds(DEFAULT_POS, DEFAULT_POS, DEFAULT_SIZE, DEFAULT_SIZE1);
    }
}