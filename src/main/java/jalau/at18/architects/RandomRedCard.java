package jalau.at18.architects;

public class RandomRedCard {

    public RedCard getRedCard() {
        return new RedCard(getHorn());
    }

    public int getHorn() {
        int max = 2;
        int min = 0;
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
