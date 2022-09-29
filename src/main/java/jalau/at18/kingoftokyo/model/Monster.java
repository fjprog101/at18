package jalau.at18.kingoftokyo.model;

public enum Monster {
    ALIENOID("Alienoid", "src/main/resources/kingoftokyo/monsters/Alienoid.png"),
    SPACE_PENGUIN("Space Penguin", "src/main/resources/kingoftokyo/monsters/Space_Penguin.png"),
    CYBER_KITTY("Cyber Kitty", "src/main/resources/kingoftokyo/monsters/Cyber_Kitty.png"),
    THE_KING("The King", "src/main/resources/kingoftokyo/monsters/The_King.png"),
    MEKA_DRAGON("Meka Dragon", "src/main/resources/kingoftokyo/monsters/Meka_dragon.png"),
    GIGAZAUR("Gigazaur", "src/main/resources/kingoftokyo/monsters/Gigazaur.png");


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
