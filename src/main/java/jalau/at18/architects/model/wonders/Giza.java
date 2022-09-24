package jalau.at18.architects.model.wonders;

public class Giza extends Wonder {
    private Stage[] stageGiza;
    private static final int STAGES = 5;
    private static final int INDEX = 3;
    public Giza() {
        stageGiza =  new Stage[STAGES];
    }
    public Stage[] getStages() {
        return stageGiza;
    }
    @Override
    public void fillStages() {
        stageGiza[0] = new Stage(StagesGiza.ONE.getCountOfResources(), StagesGiza.ONE.getEquals(), StagesGiza.ONE.getPoints());
        stageGiza[1] = new Stage(StagesGiza.TWO.getCountOfResources(), StagesGiza.TWO.getEquals(), StagesGiza.TWO.getPoints());
        stageGiza[2] = new Stage(StagesGiza.THREE.getCountOfResources(), StagesGiza.THREE.getEquals(), StagesGiza.THREE.getPoints());
        stageGiza[INDEX] = new Stage(StagesGiza.FOUR.getCountOfResources(), StagesGiza.FOUR.getEquals(), StagesGiza.FOUR.getPoints());
        stageGiza[INDEX + 1] = new Stage(StagesGiza.FIVE.getCountOfResources(), StagesGiza.FIVE.getEquals(), StagesGiza.FIVE.getPoints());
    }
}
