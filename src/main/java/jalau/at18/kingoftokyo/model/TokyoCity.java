package jalau.at18.kingoftokyo.model;

public class TokyoCity extends Board {
    private Monster monsterInsideTokyo;
    private boolean monsterInside;

    @Override
    public boolean thereIsMonsterInside() {
        return monsterInside;
    }

    @Override
    public void addMonster(Player player) {
        if (!monsterInside) {
            monsterInsideTokyo = player.getMonster();
            monsterInside = true;
        }
    }

    @Override
    public void removeMonster() {
        if (monsterInside) {
            monsterInsideTokyo = null;
            monsterInside = false;
        }
    }

    @Override
    public Monster getMonster() {
        return monsterInsideTokyo;
    }
}
