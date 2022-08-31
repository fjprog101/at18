package jalau.at18.katas.langtonant.Team1;

public class Position {
    private Ant ant;
    int posY;
    int posX;
    String direct;
    char figure;

    public String getDirect() {
        return direct;
    }

    public void setDirect(String direct) {
        this.direct = direct;
    }

    public char getFigure() {
        return figure;
    }

    public void setFigure(char figure) {
        this.figure = figure;
    }

    public Position() {
        ant = new Ant();
        posY = ant.getPosY();
        posX = ant.getPosX();
        direct = "Left";
        figure = ' ';
    }

    public void upPosition(char[][] tabs, String direction, char figure) {
        this.setDirect(direction);
        this.setFigure(figure);
        tabs[posX][posY] = getFigure();
        posX -= 1;
        tabs[posX][posY] = '8';
    }

    public void downPosition(char[][] tabs, String direction, char figure) {
        this.setDirect(direction);
        this.setFigure(figure);
        tabs[posX][posY] = getFigure();
        posX += 1;
        tabs[posX][posY] = '8';
    }

    public void rightPosition(char[][] tabs, String direction, char figure) {
        this.setDirect(direction);
        this.setFigure(figure);
        tabs[posX][posY] = getFigure();
        posY += 1;
        tabs[posX][posY] = '8';
    }

    public void leftPosition(char[][] tabs, String direction, char figure) {
        this.setDirect(direction);
        this.setFigure(figure);
        tabs[posX][posY] = getFigure();
        posY -= 1;
        tabs[posX][posY] = '8';
    }
    
}
