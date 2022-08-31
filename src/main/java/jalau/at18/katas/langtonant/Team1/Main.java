package jalau.at18.katas.langtonant.Team1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Ant positionAnt = new Ant();
        Board board = new Board();
        Movements movements = new Movements();
        Direction direction = new Direction();
        List<Object> arr;
        List<Object> arr2;
        // Position pos = new Position();
        board.intializeBoard();

        /* 
        positionAnt = movements.getAnt();
        positionAnt.getPosY();
        positionAnt.getPosX();
       */
        arr = direction.confDirection(board.getBoard(), positionAnt.getDirection());
        board.setBoard((char[][]) arr.get(0));
        arr2 = direction.confDirection(board.getBoard(), (String) arr.get(1));
        board.setBoard((char[][]) arr2.get(0));
        // board.setBoard(movements.moveWhite(board.getBoard()));
        //System.out.println(positionAnt.getPosX() +" "+ positionAnt.getPosY());
         /* 
        if(){

        }else{
            
        }
        */
        // board.setBoard(movements.moveWhite(board.getBoard()));
        // board.setBoard(movements.moveWhite(board.getBoard()));
        // board.setBoard(movements.moveWhite(board.getBoard()));
        //System.out.println("mi posicion"+ board.getBoard()[positionAnt.getPosX()][positionAnt.getPosY()]+" esta es");

        System.out.println("mi posicion"+ board.getBoard()[positionAnt.getPosX()][positionAnt.getPosY()]+" esta es");
        System.out.println(board.toString());
        
    }

}
