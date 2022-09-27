package jalau.at18.war.model;

public class DieRoller {

    public DieFace roll() {
        int randomIndex = (int) (Math.random() * DieFace.values().length);
        return DieFace.values()[randomIndex];
    }
}
