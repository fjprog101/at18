package jalau.at18.katas.langtonant.Team1;

public class Board {
    private String[][] board = new String[15][15];

    public void showBoard() {
        for (int i = 0; i <= board.length; i++) {
            for (int j = 0; j <= board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
