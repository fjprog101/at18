package jalau.at18.architects.model.wonders;

public class Babylon extends Wonder {
    private Stage[] stageBabylon;
    private static final int STAGES = 5;
    private static final int INDEX = 3;
    public Babylon() {
        stageBabylon =  new Stage[STAGES];
    }
    public Stage[] getStages() {
        return stageBabylon;
    }
    @Override
    public void fillStages() {
        stageBabylon[0] = new Stage(StagesBabylon.ONE.getCountOfResources(), StagesBabylon.ONE.getEquals(), StagesBabylon.ONE.getPoints());
        stageBabylon[1] = new Stage(StagesBabylon.TWO.getCountOfResources(), StagesBabylon.TWO.getEquals(), StagesBabylon.TWO.getPoints());
        stageBabylon[2] = new Stage(StagesBabylon.THREE.getCountOfResources(), StagesBabylon.THREE.getEquals(), StagesBabylon.THREE.getPoints());
        stageBabylon[INDEX] = new Stage(StagesBabylon.FOUR.getCountOfResources(), StagesBabylon.FOUR.getEquals(), StagesBabylon.FOUR.getPoints());
        stageBabylon[INDEX + 1] = new Stage(StagesBabylon.FIVE.getCountOfResources(), StagesBabylon.FIVE.getEquals(), StagesBabylon.FIVE.getPoints());
    }
}
