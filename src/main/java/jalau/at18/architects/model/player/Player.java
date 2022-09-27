package jalau.at18.architects.model.player;

import jalau.at18.architects.model.wonders.Wonder;

public class Player {
    private String name;
    private Wonder wonder;
    public Player(String name, Wonder wonder) {
        this.name = name;
        this.wonder = wonder;
    }

    public String getName() {
        return name;
    }

    public Wonder getWonder() {
        return wonder;
    }
}
