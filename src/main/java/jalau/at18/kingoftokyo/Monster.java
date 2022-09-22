package jalau.at18.kingoftokyo;

public enum Monster {
    ALIENOID("Alienoid", 0, 0, "src/main/resources/kingoftokyo/monsters/Alienoid.png"),
    SPACE_PENGUIN("Space Penguin", 0, 0, "src/main/resources/kingoftokyo/monsters/Space_Penguin.png"),
    CYBER_KITTY("Cyber Kitty", 0, 0, "src/main/resources/kingoftokyo/monsters/Cyber_Kitty.png");

    private final String name;
    private int lifePoints;
    private int victoryPoints;
    private static final int TEN = 10;
    private final String iconPath;

    Monster(String name, int lifePoints, int victoryPoints, String iconPath) {
        this.name = name;
        this.lifePoints = TEN;
        this.victoryPoints = 0;
        this.iconPath = iconPath;
    }

    public String getName() {
        return this.name;
    }

    public int getLifePoints() {
        return this.lifePoints;
    }

    public int getVictoryPoints() {
        return this.victoryPoints;
    }
    public String getIconPath() {
        return this.iconPath;
    }
}
