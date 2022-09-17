package jalau.at18.architects.Wonders;

public class Rhodes extends Wonder {
    private Stage[] stageRhodes;
    private static final int STAGES = 5;
    private static final int INDEX = 3;
    public Rhodes() {
        stageRhodes =  new Stage[STAGES];
    }
    public Stage[] getStages() {
        return stageRhodes;
    }
    @Override
    public void fillStages() {
        stageRhodes[0] = new Stage(StagesRhodes.ONE.getCountOfResources(), StagesRhodes.ONE.getEquals(), StagesRhodes.ONE.getPoints());
        stageRhodes[1] = new Stage(StagesRhodes.TWO.getCountOfResources(), StagesRhodes.TWO.getEquals(), StagesRhodes.TWO.getPoints());
        stageRhodes[2] = new Stage(StagesRhodes.THREE.getCountOfResources(), StagesRhodes.THREE.getEquals(), StagesRhodes.THREE.getPoints());
        stageRhodes[INDEX] = new Stage(StagesRhodes.FOUR.getCountOfResources(), StagesRhodes.FOUR.getEquals(), StagesRhodes.FOUR.getPoints());
        stageRhodes[INDEX + 1] = new Stage(StagesRhodes.FIVE.getCountOfResources(), StagesRhodes.FIVE.getEquals(), StagesRhodes.FIVE.getPoints());
    }
}
