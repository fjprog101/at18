package jalau.at18.katas.langtonant.Team1;

public class Board {
    private String[][] board = new String[15][15];

    public void showBoard() {
        for (int row = 0; row <= board.length; row++) {
            showBoard2(row);
        }
    }

    public void showBoard2(int row){
        for (int column = 0; column <= board.length; column++) {
            System.out.print(board[row][column] + " ");
        }
        System.out.println("");
    }

 

}
