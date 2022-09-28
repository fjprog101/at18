package jalau.at18.architects.model.wonders;

public enum Wonders {
    ONE(new Alexandria(), 1),
    TWO(new Babylon(), 2),
    THREE(new Ephesus(), 3),
    FOUR(new Giza(), 4),
    FIVE(new Halicarnassus(), 5),
    SIX(new Olympia(), 6),
    SEVEN(new Rhodes(), 7);
    private Wonder wonders;
    private int numberWonder;
    Wonders(Wonder wonders, int numberWonder) {
        this.wonders = wonders;
        this.numberWonder = numberWonder;
    }
    public Wonder getWonder() {
        return wonders;
    }
    public int getNumberWonder() {
        return numberWonder;
    }

}