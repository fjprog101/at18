package jalau.at18.kingoftokyo;

public abstract class Board {
    abstract boolean thereIsMonsterInside();
    abstract void addMonster(Player player);
    abstract void removeMonster();
    abstract Monster getMonster();
}
