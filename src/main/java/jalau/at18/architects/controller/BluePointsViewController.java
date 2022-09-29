package jalau.at18.architects.controller;

import jalau.at18.architects.model.cards.BluePoints;

public class BluePointsViewController {
    private BluePoints bluePoints;
    public BluePointsViewController() {
        bluePoints = new BluePoints();
        bluePoints.getPoints();
    }

    public int getBluePoints() {
        return this.bluePoints.getPoints();
    }
}
