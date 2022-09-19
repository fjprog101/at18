package jalau.at18.architects.wonders;

enum StagesGiza {
    ONE(2, false, 4),
    TWO(2, true, 5),
    THREE(3, false, 6),
    FOUR(3, true, 7),
    FIVE(4, false, 8);

    private int countOfResources;
    private boolean conditionToBuild;
    private int points;
    StagesGiza(int countOfResources, boolean equals, int points) {
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