package jalau.at18.architects.model;

public class BuildStage {
    private static final int COMPLETED_STAGES = 5;
    private int stagesCompleted = 0;
    public void buildStage() {
        System.out.println("builded");
        stagesCompleted++;
    }
    public int getStagesCompleted() {
        System.out.println("stages completed: " + stagesCompleted);
        return stagesCompleted;
    }
    public void setStagesCompleted(int completedStages) {
        this.stagesCompleted = completedStages;
    }
    public boolean isCompleted() {
        if (stagesCompleted == COMPLETED_STAGES) {
            return true;
        }
        return false;
    }
}
