package jalau.at18.architects;

public class GenerateARandomBluePointForBluePoints {
    private final int two = 2;
    private final int three = 3;
    private int randomNum = (int) (Math.random() * ((three - two) + 1)) + two;

    public BluePoints randomBluePoint() {
        BluePoints bluePoints = new BluePoints();
        switch (randomNum) {
            case two:
                bluePoints.addPoints(new BlueCard(true, two));
            case three:
                bluePoints.addPoints(new BlueCard(false, three));
            default:
                System.out.println("Random number out of Range");
        }
        return bluePoints;
    }
}
