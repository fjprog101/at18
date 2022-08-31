package jalau.at18.katas.langtonant.Team1;

public class Position {
    private Ant ant;
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

    public void upPosition(char[][] tabs, String direction, Boolean pos) {
        this.setDirect(direction);
        if (pos) {tabs[posX][posY] = ' ';} else {tabs[posX][posY] = '█';}
        tabs[posX][posY] = ' ';
        posX -= 1;
        tabs[posX][posY] = '¥';
    }

    public void downPosition(char[][] tabs, String direction, Boolean pos) {
        this.setDirect(direction);
        if (pos) {tabs[posX][posY] = ' ';} else {tabs[posX][posY] = '█';}
        posX += 1;
        tabs[posX][posY] = '¥';
    }

    public void rightPosition(char[][] tabs, String direction, Boolean pos) {
        this.setDirect(direction);
        if (pos) {tabs[posX][posY] = ' ';} else {tabs[posX][posY] = '█';}
        posY += 1;
        tabs[posX][posY] = '¥';
    }

    public void leftPosition(char[][] tabs, String direction, Boolean pos) {
        this.setDirect(direction);
        if (pos) {tabs[posX][posY] = ' ';} else {tabs[posX][posY] = '█';}
        posY -= 1;
        tabs[posX][posY] = '¥';
    }
    
}
