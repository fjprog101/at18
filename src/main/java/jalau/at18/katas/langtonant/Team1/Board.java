package jalau.at18.katas.langtonant.Team1;
public class Board {
    private String[][] board = new String[15][15];
    String showBoard = "";
    public void intializeBoard() {
        for (int row = 0; row < board.length; row++) {
            intializeBoardSecondPart(row);
        }
    }
    public void intializeBoardSecondPart(int row){
        for (int column = 0; column < board.length; column++) {
            board[row][column] = " ";
        }
    }
    public String toString(){
        showBoard += "----------------------------------------------" + "\n";
        for (int row = 0; row < board.length; row++) {
            showBoard += "|";
            for (int col = 0; col < board.length; col++) {
                showBoard += board[row][col] + " |";
            }
            showBoard += "\n";
            showBoard += "----------------------------------------------" + "\n";
        }
        return showBoard;
    }
    public void toStringSecondPart(String showBoard, int row){         
    }
}