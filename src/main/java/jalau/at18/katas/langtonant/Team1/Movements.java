package jalau.at18.katas.langtonant.Team1;

public class Movements {

    // Ant ant = new Ant();
    // Board board = new Board();
    // int row;
    // int column;
    private Position position = new Position();

    // public Movements() {
    //     board = new Board();
    // }

    public Position moveWhite(char[][] tabs, Boolean pos) {
        switch (position.getDirect()) {
            case "Up":
                position.rightPosition(tabs, "Right", pos);
                break;
            case "Right":
                position.downPosition(tabs, "Down", pos);
                break;
            case "Down":
                position.leftPosition(tabs, "Left", pos);
                break;
            case "Left":
                position.upPosition(tabs, "Up", pos);
                break;
            default:
                break;
        }
        return position;

    }

    public Position moveBlack(char[][] tabs, Boolean pos) {
        switch (position.getDirect()) {
            case "Up":
                position.leftPosition(tabs, "Left", pos);
                break;
            case "Right":
                position.upPosition(tabs, "Up", pos);
                break;
            case "Down":
                position.rightPosition(tabs, "Right", pos);
                break;
            case "Left":
                position.downPosition(tabs, "Down", pos);
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
