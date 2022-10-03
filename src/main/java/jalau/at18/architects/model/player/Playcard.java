package jalau.at18.architects.model.player;

import jalau.at18.architects.model.cards.BlueCard;
import jalau.at18.architects.model.cards.BluePoints;
import jalau.at18.architects.model.cards.Card;
import jalau.at18.architects.model.cards.GreenCard;
import jalau.at18.architects.model.cards.MilitaryStrengthCounter;
import jalau.at18.architects.model.cards.RedCard;
import jalau.at18.architects.model.cards.UpdateResourceList;
import jalau.at18.architects.model.cards.ScienceList;
import jalau.at18.architects.model.cards.WarWinnerPoints;

public class Playcard {
    private ScienceList scienceSection;
    private MilitaryStrengthCounter militarySection;
    private UpdateResourceList resourceSection;
    private BluePoints bluePoints;
    private WarWinnerPoints warWinnerPoints;
    private int totalPoints = 0;

    public int getPointsPlaycard() {
        totalPoints += bluePoints.getPoints();
        totalPoints += warWinnerPoints.getPoints();
        return totalPoints;
    }

    public Playcard() {
        scienceSection = new ScienceList();
        militarySection = new MilitaryStrengthCounter();
        resourceSection = new UpdateResourceList();
        bluePoints = new BluePoints();
        warWinnerPoints = new WarWinnerPoints();

    }

    public void addNewCard(Card card) {
        String color = card.color();
        switch (color) {
            case "Red":
                militarySection.setMilitaryStrength((RedCard) card);
                break;
            case "Green":
                scienceSection.addElementToList((GreenCard) card);
                break;
            case "Blue":
                bluePoints.addPoints((BlueCard) card);
                break;
            default:
                resourceSection.addTheCard(card);
                break;
        }
    }

    public ScienceList getScienceSection() {
        return scienceSection;
    }

    
    public void setMilitarySection(MilitaryStrengthCounter militarySection) {
        this.militarySection = militarySection;
    }

    public MilitaryStrengthCounter getMilitarySection() {
        return militarySection;
    }

    public UpdateResourceList getResourceSection() {
        return resourceSection;
    }

    public BluePoints getBluePoints() {
        return bluePoints;
    }

    public void addPointToWarWinner(int points) {
        warWinnerPoints.setQuantityToken(points);
    }
    public WarWinnerPoints getWarWinnerPoints() {
        return warWinnerPoints;
    }
}
