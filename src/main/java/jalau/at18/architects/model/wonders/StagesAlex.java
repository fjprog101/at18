package jalau.at18.architects.model.wonders;

enum StagesAlex {
    ONE(2, false, 4),
    TWO(2, true, 3),
    THREE(3, false, 6),
    FOUR(3, true, 5),
    FIVE(4, false, 7);

    private int countOfResources;
    private boolean conditionToBuild;
    private int points;
    StagesAlex(int countOfResources, boolean equals, int points) {
        this.countOfResources = countOfResources;
        this.conditionToBuild = equals;
        this.points = points;
    }
    public int getCountOfResources() {
        return countOfResources;
    }
    public int getPoints() {
        return points;
    }
    public boolean getEquals() {
        return conditionToBuild;
    }
}