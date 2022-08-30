package jalau.at18.katas.langtonant.Team1;

public class Main {

    Ant positionAnt = new Ant();

    public static void main(String[] args) {
        Board board = new Board();
        Movements movements = new Movements();
        Position pos = new Position();
        board.intializeBoard();
        movements.moveWhite();
        System.out.println(board.toString());
       /*  pos.upPosition();
        pos.upPosition();
        pos.upPosition();*/
        //System.out.println("Hi ANt");
    }

}
