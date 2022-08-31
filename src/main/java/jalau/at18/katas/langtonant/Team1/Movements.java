package jalau.at18.katas.langtonant.Team1;

public class Movements {

    // Ant ant = new Ant();
    // Board board = new Board();
    // int row;
    // int column;
    private Position position = new Position();
    private char emptySpace = ' ';
    private char fullSpace = '█';

    // public Movements() {
    //     board = new Board();
    // }

    public Position moveWhite(char[][] tabs) {
        switch (position.getDirect()) {
            case "Up":
                position.rightPosition(tabs, "Right", emptySpace);
                break;
            case "Right":
                position.downPosition(tabs, "Down", emptySpace);
                break;
            case "Down":
                position.leftPosition(tabs, "Left", emptySpace);
                break;
            case "Left":
                position.upPosition(tabs, "Up", emptySpace);
                break;
            default:
                break;
        }
        return position;

    }

    public Position moveBlack(char[][] tabs) {
        switch (position.getDirect()) {
            case "Up":
                position.leftPosition(tabs, "Left", fullSpace);
                break;
            case "Right":
                position.upPosition(tabs, "Up", fullSpace);
                break;
            case "Down":
                position.rightPosition(tabs, "Right", fullSpace);
                break;
            case "Left":
                position.downPosition(tabs, "Down", fullSpace);
                break;
            default:
                break;
        }
        return position;
    }

    // public Ant getAnt() {
    // return this.ant;
    // }

    /*
     * public void move(String [][] board, int row, int colum){
     * for(int i =0; i < row.length; i++){
     * }
     * }
     */
}
