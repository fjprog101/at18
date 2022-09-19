package jalau.at18.architects.wonders;

public class Stage {
    private int countOfResources;
    private boolean condition;
    private int points;
    private boolean isBuilt;
    public Stage(int countOfResources, boolean equals, int points) {
        this.countOfResources = countOfResources;
        this.condition = equals;
        this.points = points;
        isBuilt = false;
    }
    public int getCountOfResources() {
        return countOfResources;
    }
    public boolean isEquals() {
        return condition;
    }
    public int getPoints() {
        return points;
    }
    public boolean isBuilt() {
        return isBuilt;
    }
    public void finishBuilt() {
        this.isBuilt = true;
    }
}
