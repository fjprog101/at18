package jalau.at18.katas.langtonant.Team1;

public class Main {
    public static void main(String[] args) {
        // Ant positionAnt = new Ant();
        Board board = new Board();
        Movements movements = new Movements();
        Direction direction = new Direction();
        // Position pos = new Position();


        board.intializeBoard();
        // board.setBoard(movements.moveWhite(board.getBoard()));
        // board.setBoard(movements.moveWhite(board.getBoard()));
        // board.setBoard(movements.moveWhite(board.getBoard()));
        board.setBoard(direction.confDirection(board.getBoard()));
        board.setBoard(direction.confDirection(board.getBoard()));
        board.setBoard(direction.confDirection(board.getBoard()));
        

        // board.setBoard(movements.moveWhite(board.getBoard()));
        // board.setBoard(movements.moveWhite(board.getBoard()));
        // board.setBoard(movements.moveWhite(board.getBoard()));
        // board.setBoard(movements.moveBlack(board.getBoard()));
        // board.setBoard(movements.moveBlack(board.getBoard()));

        System.out.println(board.toString());
       /*  pos.upPosition();
        pos.upPosition();
        pos.upPosition();*/
        //System.out.println("Hi ANt");
    }

}
