package jalau.at18.architects.wonders;

public abstract class Wonder {
    private final int maxOfStages = 5;
    private Stage[] stages;
    public Wonder() {
        stages = new Stage[maxOfStages];
    }
    public Stage[] getStages() {
        return stages;
    }
    abstract void fillStages();
}
