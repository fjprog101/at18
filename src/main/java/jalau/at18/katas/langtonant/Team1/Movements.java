package jalau.at18.katas.langtonant.Team1;

public class Movements {
    
    Ant position = new Ant();
    Board board= new Board();
    int row;
    int column;
    public void moveWhite(){

        
    }
    public void moveBlack(){

    }

    public void move(String [][] board, int row, int colum){
        for(int i =0; i <row.length; i++){
            
        }
    }
    public void moveRight(String [][] board, int row, int colum){
        removeAnt();
        column +=1;
    }

    public void moveLeft(){
        column -=1;
    }

    public void moveUp(){
        row-=1;
    }
    public void moveDown(){
        row+=1;
    }
    public void removeAnt(){
        
    }
}
