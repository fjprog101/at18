package jalau.at18.katas.langtonant.Team1;

public class Main {

    public static void main(String[] args) {
        Position positionAnt = new Position();
        Board board = new Board();
        Movements movements = new Movements();
        // Position pos = new Position();
        board.intializeBoard();
        System.out.println(positionAnt.posX + " " + positionAnt.posY);
        System.out.println(positionAnt.direct);

        positionAnt = movements.moveWhite(board.getBoard());
        System.out.println(positionAnt.posX + " " + positionAnt.posY);
        System.out.println(positionAnt.direct);
        // board.setBoard(setElementBoard(int posX, int posY, char antContent) );
        positionAnt = movements.moveWhite(board.getBoard());
        System.out.println(positionAnt.posX + " " + positionAnt.posY);
        System.out.println(positionAnt.direct);

        positionAnt = movements.moveWhite(board.getBoard());
        System.out.println(positionAnt.posX + " " + positionAnt.posY);
        System.out.println(positionAnt.direct);

        positionAnt = movements.moveWhite(board.getBoard());
        System.out.println(positionAnt.posX + " " + positionAnt.posY);
        System.out.println(positionAnt.direct);
        // System.out.println(positionAnt.posX + " " + positionAnt.posY);
        // positionAnt = movements.moveWhite(board.getBoard());
        // System.out.println(positionAnt.posX + " " + positionAnt.posY);
        // positionAnt = movements.moveWhite(board.getBoard());
        // System.out.println(positionAnt.posX + " " + positionAnt.posY);

        // System.out.println(positionAnt.posX + " " + positionAnt.posY);
        // board.setBoard(board.getBoard()[][]);
        // System.out.println(positionAnt.posX);
        // System.out.println(board.toString());
        // board.setBoard(movements.moveWhite(board.getBoard()));
        // System.out.println(board.toString());
        // board.setBoard(movements.moveWhite(board.getBoard()));
        // System.out.println(board.toString());
        // board.setBoard(movements.moveWhite(board.getBoard()));
        // board.setBoard(movements.moveWhite(board.getBoard()));
        // board.setBoard(movements.moveBlack(board.getBoard()));

        System.out.println(board.toString());
        /*
         * pos.upPosition();
         * pos.upPosition();
         * pos.upPosition();
         */
        // System.out.println("Hi ANt");
    }

}
