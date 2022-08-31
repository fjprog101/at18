package jalau.at18.katas.langtonant.Team1;

public class Main {
    public static void main(String[] args) {
        Ant positionAnt = new Ant();
        Board board = new Board();
        Movements movements = new Movements();
        // Position pos = new Position();
        board.intializeBoard();

        /* 
        positionAnt = movements.getAnt();
        positionAnt.getPosY();
        positionAnt.getPosX();
       */

        board.setBoard(movements.moveWhite(board.getBoard()));
        //System.out.println(positionAnt.getPosX() +" "+ positionAnt.getPosY());
         /* 
        if(){

        }else{
            
        }
        */
        board.setBoard(movements.moveWhite(board.getBoard()));
        board.setBoard(movements.moveWhite(board.getBoard()));
        board.setBoard(movements.moveWhite(board.getBoard()));
        //System.out.println("mi posicion"+ board.getBoard()[positionAnt.getPosX()][positionAnt.getPosY()]+" esta es");

        System.out.println("mi posicion"+ board.getBoard()[positionAnt.getPosX()][positionAnt.getPosY()]+" esta es");
        System.out.println(board.toString());
        
    }

}
