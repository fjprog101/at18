package jalau.at18.kingoftokyo;

public class Player {
    private String userName;
    private Monster monster;
    private int energy;
    private boolean start;

    public Player() {
        this.monster = null;
        this.energy = 0;
    }

    public void addMonster(Monster newMonster) {
        this.monster = newMonster;
    }

    public Monster getMonster() {
        return this.monster;
    }

    public int getEnergy() {
        return this.energy;
    }

    public boolean isStart() {
        return start;
    }

    public void setStart(boolean begin) {
        this.start = begin;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String name) {
        this.userName = name;
    }

    public void setMonster(Monster monsterObj) {
        this.monster = monsterObj;
    }
}
