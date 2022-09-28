package jalau.at18.architects.model.cards;

import java.util.Arrays;
import java.util.List;

import jalau.at18.architects.model.wonders.Wonder;

public class ConditionsForStages {
    private Wonder wonder;
    private ResourceList resourceList;
    private static final int THREE = 3;
    private static final int FOUR = 4;
    private static final int FIVE = 5;
    private int counterPoints = 0;

    public ConditionsForStages(Wonder wonder, ResourceList resourceList) {
        this.wonder = wonder;
        this.resourceList = resourceList;
    }

    public List<Object> everyConditionForEveryStage() {
        if ((resourceList.traverseTheResourceList() == wonder.getStages()[0].isEquals())
                && resourceList.sizeOfResourceList() == 2
                && (wonder.getStages()[0].getPoints() == THREE || wonder.getStages()[0].getPoints() == FOUR)) {
            resourceList.removeResourceFromList();
            resourceList.removeResourceFromList();
            counterPoints += wonder.getStages()[0].getPoints();
            return Arrays.asList(true, counterPoints);
        } else if ((resourceList.traverseTheResourceList() == wonder.getStages()[1].isEquals())
                && resourceList.sizeOfResourceList() == 2
                && (wonder.getStages()[1].getPoints() == 0 || wonder.getStages()[1].getPoints() == THREE
                        || wonder.getStages()[1].getPoints() == FOUR || wonder.getStages()[1].getPoints() == FIVE)) {
            resourceList.removeResourceFromList();
            resourceList.removeResourceFromList();
            counterPoints += wonder.getStages()[1].getPoints();
            return Arrays.asList(true, counterPoints);
        } else if (((resourceList.getAResource(0) == Resource.GOLD.getResource()
                || resourceList.getAResource(1) == Resource.GOLD.getResource()) != wonder.getStages()[0].isEquals())
                && resourceList.sizeOfResourceList() == 2
                && (wonder.getStages()[0].getPoints() == THREE || wonder.getStages()[0].getPoints() == FOUR)) {
            resourceList.removeResourceFromList();
            resourceList.removeResourceFromList();
            counterPoints += wonder.getStages()[0].getPoints();
            return Arrays.asList(true, counterPoints);
        } else if (((resourceList.getAResource(0) == Resource.GOLD.getResource()
                || resourceList.getAResource(1) == Resource.GOLD.getResource()) == wonder.getStages()[1].isEquals())
                && resourceList.sizeOfResourceList() == 2
                && (wonder.getStages()[1].getPoints() == 0 || wonder.getStages()[1].getPoints() == THREE
                        || wonder.getStages()[1].getPoints() == FOUR || wonder.getStages()[1].getPoints() == FIVE)) {
            resourceList.removeResourceFromList();
            resourceList.removeResourceFromList();
            counterPoints += wonder.getStages()[1].getPoints();
            return Arrays.asList(true, counterPoints);
        } else {
            return new ConditionsForThreeStages(wonder, resourceList).secondPartForCondition();
        }
    }

    public int getAccumulatedPoints() {
        return counterPoints;
    }
}
