package jalau.at18.architects;
public class MilitaryStrengthCounter {
    private int shieldPermanent;
    private int shieldTemporal;
    private RedCard redCard;

    public MilitaryStrengthCounter() {
        shieldPermanent = 0;
        shieldTemporal = 0;
    }
    public void setMilitaryStrength(RedCard cardRed) {
        this.redCard = cardRed;
        if (redCard.getHorns() != 0) {
            shieldTemporal += redCard.getShields();
        } else {
            shieldPermanent += redCard.getShields();
        }
    }
    public int getShieldPermanent() {
        return shieldPermanent;
    }
    public int getShieldTemporal() {
        return shieldTemporal;
    }
    public int getMilitaryStrength() {
        return shieldPermanent + shieldTemporal;
    }
    public void resetShieldsTemporal() {
        shieldTemporal = 0;
    }
}
