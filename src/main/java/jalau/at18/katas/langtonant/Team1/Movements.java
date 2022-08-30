package jalau.at18.katas.langtonant.Team1;

public class Movements {
    
    //Ant position = new Ant();
    Board board= new Board();
    //int row;
    //int column;
    Position position = new Position();
    public Movements(){
        board = new Board();
    }

    public char[][] moveWhite(char[][] tabs ){
        
        tabs[position.posX][position.posY]=' ';
        position.rightPosition();
        System.out.println(position.posX + " " + position.posY);
        tabs[position.posX][position.posY]='8';
        // board.setElementBoard(position.posX, position.posY, '8');
        return tabs;
    }
    public char[][] moveBlack(char[][] tabs){
        position.upPosition();
        System.out.println(position.posX + " " + position.posY);
        tabs[position.posX][position.posY]='8';
        // board.setElementBoard(position.posX, position.posY, '8');
        return tabs;
    }

    /*public void move(String [][] board, int row, int colum){
        for(int i =0; i < row.length; i++){
            
        }
    }*/
}
