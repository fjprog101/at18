package jalau.at18.architects;

public abstract class Wonder {
    private final int maxOfStages = 5;
    private Stage[] architects;
    public Wonder() {
        architects = new Stage[maxOfStages];
    }
    public Stage[] getStages() {
        return architects;
    }
    abstract void fillStages();
}
