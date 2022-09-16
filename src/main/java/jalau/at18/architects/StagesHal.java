package jalau.at18.architects;
enum StagesHal {
    ONE(2, false, 3),
    TWO(2, true, 3),
    THREE(3, true, 5),
    FOUR(3, false, 6),
    FIVE(4, false, 7);

    private int countOfResources;
    private boolean equals;
    private int points;
    StagesHal(int countOfResources, boolean equals, int points) {
        this.countOfResources = countOfResources;
        this.equals = equals;
        this.points = points;
    }
    public int getCountOfResources() {
        return countOfResources;
    }
    public int getPoints() {
        return points;
    }
    public boolean getEquals() {
        return equals;
    }
}