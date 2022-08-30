package jalau.at18.katas.langtonant.Team1;

public class Movements {
    
    //Ant position = new Ant();
    Board board;
    //int row;
    //int column;
    Position position = new Position();
    public Movements(){
        board = new Board();
    }
    public void moveWhite(){
        position.rightPosition();
        System.out.println(position.posX + " " + position.posY);
        board.setElementBoard(position.posX, position.posY, '8');
        
    }
    public void moveBlack(){

    }

    /*public void move(String [][] board, int row, int colum){
        for(int i =0; i < row.length; i++){
            
        }
    }*/
}
