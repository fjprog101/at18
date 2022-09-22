package jalau.at18.architects.model.wonders;
enum StagesHal {
    ONE(2, false, 3),
    TWO(2, true, 3),
    THREE(3, true, 5),
    FOUR(3, false, 6),
    FIVE(4, false, 7);

    private int countOfResources;
    private boolean conditionToBuild;
    private int points;
    StagesHal(int countOfResources, boolean equals, int points) {
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