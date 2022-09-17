package jalau.at18.architects.Wonders;

public class Alexandria extends Wonder {
    private Stage[] stageAlexandria;
    private static final int STAGES = 5;
    private static final int INDEX = 3;
    public Alexandria() {
        stageAlexandria =  new Stage[STAGES];
    }
    public Stage[] getStages() {
        return stageAlexandria;
    }
    @Override
    public void fillStages() {
        stageAlexandria[0] = new Stage(StagesAlex.ONE.getCountOfResources(), StagesAlex.ONE.getEquals(), StagesAlex.ONE.getPoints());
        stageAlexandria[1] = new Stage(StagesAlex.TWO.getCountOfResources(), StagesAlex.TWO.getEquals(), StagesAlex.TWO.getPoints());
        stageAlexandria[2] = new Stage(StagesAlex.THREE.getCountOfResources(), StagesAlex.THREE.getEquals(), StagesAlex.THREE.getPoints());
        stageAlexandria[INDEX] = new Stage(StagesAlex.FOUR.getCountOfResources(), StagesAlex.FOUR.getEquals(), StagesAlex.FOUR.getPoints());
        stageAlexandria[INDEX + 1] = new Stage(StagesAlex.FIVE.getCountOfResources(), StagesAlex.FIVE.getEquals(), StagesAlex.FIVE.getPoints());
    }
}
