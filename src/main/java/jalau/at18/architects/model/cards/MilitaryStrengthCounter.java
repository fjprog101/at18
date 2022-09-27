package jalau.at18.architects.model.cards;

public class MilitaryStrengthCounter {
    private int permanentShield;
    private int temporalShield;
    private RedCard redCard;

    public MilitaryStrengthCounter() {
        permanentShield = 0;
        temporalShield = 0;
    }
    public void setMilitaryStrength(RedCard cardRed) {
        this.redCard = cardRed;
        if (redCard.getHorns() != 0) {
            temporalShield += redCard.getShields();
        } else {
            permanentShield += redCard.getShields();
        }
    }
    public int getPermanentShield() {
        return permanentShield;
    }
    public int getTemporalShield() {
        return temporalShield;
    }
    public int getMilitaryStrength() {
        return permanentShield + temporalShield;
    }
    public void resetTemporalShields() {
        temporalShield = 0;
    }
}
