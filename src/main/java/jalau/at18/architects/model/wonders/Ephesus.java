package jalau.at18.architects.model.wonders;

public class Ephesus extends Wonder {
    private Stage[] stageEphesus;
    private static final int STAGES = 5;
    private static final int INDEX = 3;
    public Ephesus() {
        stageEphesus =  new Stage[STAGES];
    }
    public Stage[] getStages() {
        return stageEphesus;
    }
    @Override
    public void fillStages() {
        stageEphesus[0] = new Stage(StagesEphesus.ONE.getCountOfResources(), StagesEphesus.ONE.getEquals(), StagesEphesus.ONE.getPoints());
        stageEphesus[1] = new Stage(StagesEphesus.TWO.getCountOfResources(), StagesEphesus.TWO.getEquals(), StagesEphesus.TWO.getPoints());
        stageEphesus[2] = new Stage(StagesEphesus.THREE.getCountOfResources(), StagesEphesus.THREE.getEquals(), StagesEphesus.THREE.getPoints());
        stageEphesus[INDEX] = new Stage(StagesEphesus.FOUR.getCountOfResources(), StagesEphesus.FOUR.getEquals(), StagesEphesus.FOUR.getPoints());
        stageEphesus[INDEX + 1] = new Stage(StagesEphesus.FIVE.getCountOfResources(), StagesEphesus.FIVE.getEquals(), StagesEphesus.FIVE.getPoints());
    }
}
