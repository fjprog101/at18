package jalau.at18.architects.model.wonders;

public abstract class Wonder {
    private final int maxOfStages = 5;
    private Stage[] stages;
    private String name;
    public Wonder() {
        stages = new Stage[maxOfStages];
    }
    public Stage[] getStages() {
        return stages;
    }
    public abstract void fillStages();

    public String getName() {
        return name;
    }
}
