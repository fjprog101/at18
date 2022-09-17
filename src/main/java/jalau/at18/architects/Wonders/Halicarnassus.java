package jalau.at18.architects.Wonders;

public class Halicarnassus extends Wonder {
    private Stage[] stageHalicarnassus;
    private static final int STAGES = 5;
    private static final int INDEX = 3;
    public Halicarnassus() {
        stageHalicarnassus =  new Stage[STAGES];
    }
    public Stage[] getStages() {
        return stageHalicarnassus;
    }
    @Override
    public void fillStages() {
        stageHalicarnassus[0] = new Stage(StagesHal.ONE.getCountOfResources(), StagesHal.ONE.getEquals(), StagesHal.ONE.getPoints());
        stageHalicarnassus[1] = new Stage(StagesHal.TWO.getCountOfResources(), StagesHal.TWO.getEquals(), StagesHal.TWO.getPoints());
        stageHalicarnassus[2] = new Stage(StagesHal.THREE.getCountOfResources(), StagesHal.THREE.getEquals(), StagesHal.THREE.getPoints());
        stageHalicarnassus[INDEX] = new Stage(StagesHal.FOUR.getCountOfResources(), StagesHal.FOUR.getEquals(), StagesHal.FOUR.getPoints());
        stageHalicarnassus[INDEX + 1] = new Stage(StagesHal.FIVE.getCountOfResources(), StagesHal.FIVE.getEquals(), StagesHal.FIVE.getPoints());
    }
}
