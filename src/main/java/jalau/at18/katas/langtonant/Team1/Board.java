package jalau.at18.katas.langtonant.Team1;

public class Board {
    public static final int SIZE = 5;
    private char[][] board = new char[SIZE][SIZE];

    private String showBoard = "";

    public void setBoard(char[][] board) {
        this.board = board;
    }

    public char[][] getBoard() {
        return board;
    }

    public void intializeBoard() {
        for (int row = 0; row < board.length; row++) {
            intializeBoardSecondPart(row);
        }
    }

    public void intializeBoardSecondPart(int row) {
        for (int column = 0; column < board.length; column++) {
            board[row][column] = '█';
        }
    }

    public void setElementBoard(int posX, int posY, char antContent)  {
        board[posX][posY] = antContent;
    }

    public int getElement(int posX, int posY)  {
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