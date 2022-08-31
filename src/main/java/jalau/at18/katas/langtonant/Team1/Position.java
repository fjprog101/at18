package jalau.at18.katas.langtonant.Team1;

public class Position {
    Ant ant;
    int posY;
    int posX;

    public Position() {
        ant = new Ant();
        posY = ant.getPosY();
        posX = ant.getPosX();
    }

    public void upPosition(char[][] tabs) {
        ant.setDirection();
        tabs[posX][posY] = ' ';
        posX -= 1;
        System.out.println(posX + " " + posY);
        //tabs[posX][posY] = '8';
    }

    public void downPosition(char[][] tabs) {
        ant.setDirection();
        tabs[posX][posY] = ' ';
        posX += 1;
        System.out.println(posX + " " + posY);
        //tabs[posX][posY] = '8';
    }

    public void rightPosition(char[][] tabs) {
        ant.setDirection();
        tabs[posX][posY] = ' ';
        posY += 1;
        System.out.println(posX + " " + posY);
        //tabs[posX][posY] = '8';
    }

    public void leftPosition(char[][] tabs) {
        ant.setDirection();
        tabs[posX][posY] = ' ';
        posY -= 1;
        System.out.println(posX + " " + posY);
        //tabs[posX][posY] = '8';
    }
}
