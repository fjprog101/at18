package jalau.at18.katas.langtonant.Team1;

public class Main {

    // public void flushScreen() {

    // }

    public static void main(String[] args) {
        Position positionAnt = new Position();
        Board board = new Board();
        Movements movements = new Movements();
        // Position pos = new Position();
        board.intializeBoard();
        System.out.println(positionAnt.posX + " " + positionAnt.posY);
        System.out.println(positionAnt.direct);
        System.out.println(board.getBoard()[positionAnt.posX][positionAnt.posX]);

        int inc = 0;
        // ------------------------------------------------------------------------
        try {
            while (true) {

                inc++;

                if (board.getBoard()[positionAnt.posX][positionAnt.posX] == '█') {
                    positionAnt = movements.moveWhite(board.getBoard(), true);

                    // board.setBoard(setElementBoard(int posX, int posY, char antContent) );
                } else {
                    positionAnt = movements.moveBlack(board.getBoard(), false);
                }

                System.out.println(" " + inc);
                board.toStrings();
                Thread.sleep(1000);
                System.out.print("\033[H\033[2J");
                System.out.flush();

            }

        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        // ------------------------------------------------------------------------

        // positionAnt = movements.moveWhite(board.getBoard(), true);
        // System.out.println(positionAnt.posX + " " + positionAnt.posY);
        // System.out.println(positionAnt.direct);
        // // board.setBoard(setElementBoard(int posX, int posY, char antContent) );
        // positionAnt = movements.moveWhite(board.getBoard(), true);
        // System.out.println(positionAnt.posX + " " + positionAnt.posY);
        // System.out.println(positionAnt.direct);

        // System.out.println("mi posicion"+
        // board.getBoard()[positionAnt.getPosX()][positionAnt.getPosY()]+" esta es");

    }

}
