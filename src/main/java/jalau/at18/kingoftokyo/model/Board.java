package jalau.at18.kingoftokyo.model;

public abstract class Board {
    abstract boolean thereIsMonsterInside();
    abstract void addMonster(Player player);
    abstract void removeMonster();
    abstract Monster getMonster();
}
