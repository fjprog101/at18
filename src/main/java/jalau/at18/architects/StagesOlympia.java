package jalau.at18.architects;
enum StagesOlympia {
    ONE(2, false, 3),
    TWO(2, true, 2),
    THREE(3, false, 5),
    FOUR(3, true, 5),
    FIVE(4, false, 7);

    private int countOfResources;
    private boolean equals;
    private int points;
    StagesOlympia(int countOfResources, boolean equals, int points) {
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