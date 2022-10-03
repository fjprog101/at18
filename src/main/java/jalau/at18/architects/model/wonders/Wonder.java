package jalau.at18.architects.model.wonders;

public abstract class Wonder {
    private final int maxOfStages = 5;
    private Stage[] stages;
    private String name;
    private int points = 0;

    public int getPointsWonder() {
        // Wrong here
        for (Stage stage : getStages()) {
            if (stage.isBuilt()) {
                this.points += stage.getPoints();
                System.out.println(">>>>--->" + stage.getPoints());
            }
        }
        return this.points;
    }

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
