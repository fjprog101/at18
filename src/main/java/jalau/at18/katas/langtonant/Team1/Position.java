package jalau.at18.katas.langtonant.Team1;

public class Position {
    Ant ant;
    int posY;
    int posX;
    String direct;
    

    public String getDirect() {
        return direct;
    }

    public void setDirect(String direct) {
        this.direct = direct;
    }

    public Position() {
        ant = new Ant();
        posY = ant.getPosY();
        posX = ant.getPosX();
        direct = "Left";
    }

    public void upPosition(char[][] tabs, String direction) {
        this.setDirect(direction);
        tabs[posX][posY] = ' ';
        posX -= 1;
        // System.out.println(posX + " " + posY);
        // tabs[posX][posY] = '8';
    }

    public void downPosition(char[][] tabs, String direction) {
        this.setDirect(direction);
        tabs[posX][posY] = ' ';
        posX += 1;
        // System.out.println(posX + " " + posY);
        // tabs[posX][posY] = '8';
    }

    public void rightPosition(char[][] tabs, String direction) {
        this.setDirect(direction);
        tabs[posX][posY] = ' ';
        posY += 1;
        // System.out.println(posX + " " + posY);
        // tabs[posX][posY] = '8';
    }

    public void leftPosition(char[][] tabs, String direction) {
        this.setDirect(direction);
        tabs[posX][posY] = ' ';
        posY -= 1;
        // System.out.println(posX + " " + posY);
        // tabs[posX][posY] = '8';
    }
    
}
