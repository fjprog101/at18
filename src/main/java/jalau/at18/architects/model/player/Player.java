package jalau.at18.architects.model.player;

import jalau.at18.architects.model.wonders.Wonders;

public class Player {
    private String name;
    private Wonders wonder;
    public Player(String name, Wonders wonder) {
        this.name = name;
        this.wonder = wonder;
    }

    public String getName() {
        return name;
    }

    public Wonders getWonder() {
        return wonder;
    }
}
