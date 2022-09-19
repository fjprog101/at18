package jalau.at18.architects.wonders;

public class Olympia extends Wonder {
    private Stage[] stageOlympia;
    private static final int STAGES = 5;
    private static final int INDEX = 3;
    public Olympia() {
        stageOlympia =  new Stage[STAGES];
    }
    public Stage[] getStages() {
        return stageOlympia;
    }
    @Override
    public void fillStages() {
        stageOlympia[0] = new Stage(StagesOlympia.ONE.getCountOfResources(), StagesOlympia.ONE.getEquals(), StagesOlympia.ONE.getPoints());
        stageOlympia[1] = new Stage(StagesOlympia.TWO.getCountOfResources(), StagesOlympia.TWO.getEquals(), StagesOlympia.TWO.getPoints());
        stageOlympia[2] = new Stage(StagesOlympia.THREE.getCountOfResources(), StagesOlympia.THREE.getEquals(), StagesOlympia.THREE.getPoints());
        stageOlympia[INDEX] = new Stage(StagesOlympia.FOUR.getCountOfResources(), StagesOlympia.FOUR.getEquals(), StagesOlympia.FOUR.getPoints());
        stageOlympia[INDEX + 1] = new Stage(StagesOlympia.FIVE.getCountOfResources(), StagesOlympia.FIVE.getEquals(), StagesOlympia.FIVE.getPoints());
    }
}
