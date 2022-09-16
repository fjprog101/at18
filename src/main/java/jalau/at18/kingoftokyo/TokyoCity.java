package jalau.at18.kingoftokyo;

public class TokyoCity extends Board {
    private Monster monsterInsideTokyo;
    private boolean monsterInside;

    @Override
    boolean thereIsMonsterInside() {
        return monsterInside;
    }

    @Override
    void addMonster(Player player) {
        if (!monsterInside) {
            monsterInsideTokyo = player.getMonster();
            monsterInside = true;
        }
    }

    @Override
    void removeMonster() {
        if (monsterInside) {
            monsterInsideTokyo = null;
            monsterInside = false;
        }
    }

    @Override
    Monster getMonster() {
        return monsterInsideTokyo;
    }
}
