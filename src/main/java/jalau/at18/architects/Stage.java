package jalau.at18.architects;

public class Stage {
    private int countOfResources;
    private boolean equals;
    private int points;
    private boolean isBuilt;
    public Stage(int countOfResources, boolean equals, int points) {
        this.countOfResources = countOfResources;
        this.equals = equals;
        this.points = points;
        isBuilt = false;
    }
    public int getCountOfResources() {
        return countOfResources;
    }
    public boolean isEquals() {
        return equals;
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
