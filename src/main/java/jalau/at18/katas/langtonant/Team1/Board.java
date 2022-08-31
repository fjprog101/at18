package jalau.at18.katas.langtonant.Team1;
public class Board {
    private char[][] board = new char[15][15];
    
    public void setBoard(char[][] board) {
    this.board = board;
    }
    public char[][] getBoard() {
    return board;
    }
    String showBoard = "";
    public void intializeBoard() {
        for (int row = 0; row < board.length; row++) {
            intializeBoardSecondPart(row);
        }
    }

    public void intializeBoardSecondPart(int row){
        for (int column = 0; column < board.length; column++) {
            board[row][column] = '█';
        }
    }

    public void setElementBoard(int posX, int posY, char antContent) {
        board[posX][posY] = antContent;
    } 

    public int getElement(int posX, int posY) {
        return board[posX][posY];
    }
    public String toString() {
        showBoard += "------------------------------" + "\n";
        for (int row = 0; row < board.length; row++) {
            showBoard += "|";
            for (int col = 0; col < board.length; col++) {
                showBoard += board[row][col] + "|";
            }
            showBoard += "\n";
            showBoard += "------------------------------" + "\n";
        }
        return showBoard;
    }
}