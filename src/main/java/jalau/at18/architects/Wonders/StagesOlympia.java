package jalau.at18.architects.wonders;
enum StagesOlympia {
    ONE(2, false, 3),
    TWO(2, true, 2),
    THREE(3, false, 5),
    FOUR(3, true, 5),
    FIVE(4, false, 7);

    private int countOfResources;
    private boolean conditionToBuild;
    private int points;
    StagesOlympia(int countOfResources, boolean equals, int points) {
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