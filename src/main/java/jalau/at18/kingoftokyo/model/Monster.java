package jalau.at18.kingoftokyo.model;

public enum Monster {
    ALIENOID("Alienoid", "src/main/resources/kingoftokyo/monsters/Alienoid.png"),
    SPACE_PENGUIN("Space Penguin", "src/main/resources/kingoftokyo/monsters/Space_Penguin.png"),
    CYBER_KITTY("Cyber Kitty", "src/main/resources/kingoftokyo/monsters/Cyber_Kitty.png");

    private final String name;
    private final String iconPath;

    Monster(String name, String iconPath) {
        this.name = name;
        this.iconPath = iconPath;
    }

    public String getName() {
        return this.name;
    }

    public String getIconPath() {
        return this.iconPath;
    }
}
