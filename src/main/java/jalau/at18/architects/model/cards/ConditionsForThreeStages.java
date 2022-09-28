package jalau.at18.architects.model.cards;

import java.util.Arrays;
import java.util.List;

import jalau.at18.architects.model.wonders.Wonder;

public class ConditionsForThreeStages {
    private Wonder wonder;
    private ResourceList resourceList;
    private static final int THREE = 3;
    private static final int FOUR = 4;
    private static final int FIVE = 5;
    private static final int SIX = 6;
    private static final int SEVEN = 7;
    private int counterPoints = 0;

    public ConditionsForThreeStages(Wonder wonder, ResourceList resourceList) {
        this.wonder = wonder;
        this.resourceList = resourceList;
    }

    public List<Object> secondPartForCondition() {
        if (((resourceList.getAResource(0) != Resource.GOLD.getResource()
                && resourceList.getAResource(1) != Resource.GOLD.getResource()
                && resourceList.getAResource(2) != Resource.GOLD.getResource()))
                && (((resourceList.getAResource(0) == resourceList.getAResource(1)) && (resourceList
                        .getAResource(1) == resourceList.getAResource(2))) == wonder.getStages()[2].isEquals())
                && (resourceList.sizeOfResourceList() == THREE)
                && ((wonder.getStages()[2].getPoints() == FOUR) || (wonder.getStages()[2].getPoints() == FIVE)
                        || (wonder.getStages()[2].getPoints() == SIX))) {
            resourceList.removeResourceFromList();
            resourceList.removeResourceFromList();
            resourceList.removeResourceFromList();
            counterPoints += wonder.getStages()[2].getPoints();
            return Arrays.asList(true, counterPoints);
        } else if (((resourceList.getAResource(0) != Resource.GOLD.getResource()
                && resourceList.getAResource(1) != Resource.GOLD.getResource()
                && resourceList.getAResource(2) != Resource.GOLD.getResource()))
                && (((resourceList.getAResource(0) == resourceList.getAResource(1)) && (resourceList
                        .getAResource(1) == resourceList.getAResource(2))) == wonder.getStages()[THREE].isEquals())
                && (resourceList.sizeOfResourceList() == THREE)
                && ((wonder.getStages()[THREE].getPoints() == FIVE) || (wonder.getStages()[THREE].getPoints() == SIX)
                        || (wonder.getStages()[THREE].getPoints() == SEVEN))) {
            resourceList.removeResourceFromList();
            resourceList.removeResourceFromList();
            resourceList.removeResourceFromList();
            counterPoints += wonder.getStages()[THREE].getPoints();
            return Arrays.asList(true, counterPoints);
        } else if (((resourceList.getAResource(0) == Resource.GOLD.getResource()
                || resourceList.getAResource(1) == Resource.GOLD.getResource()
                || resourceList.getAResource(2) == Resource.GOLD.getResource()))
                && ((((resourceList.getAResource(1) == resourceList.getAResource(2)) || (resourceList
                        .getAResource(0) == resourceList.getAResource(2))
                        || (resourceList
                                .getAResource(0) == resourceList.getAResource(1))) == wonder.getStages()[2].isEquals()))
                && (resourceList.sizeOfResourceList() == THREE)
                && ((wonder.getStages()[2].getPoints() == FOUR) || (wonder.getStages()[2].getPoints() == FIVE)
                        || (wonder.getStages()[2].getPoints() == SIX))) {
            resourceList.removeResourceFromList();
            resourceList.removeResourceFromList();
            resourceList.removeResourceFromList();
            counterPoints += wonder.getStages()[2].getPoints();
            return Arrays.asList(true, counterPoints);
        } else if (((resourceList.getAResource(0) == Resource.GOLD.getResource())
                || (resourceList.getAResource(1) == Resource.GOLD.getResource())
                || (resourceList.getAResource(2) == Resource.GOLD.getResource()))
                && ((((resourceList.getAResource(1) == resourceList.getAResource(2)) || (resourceList
                        .getAResource(0) == resourceList.getAResource(2))
                        || (resourceList
                                .getAResource(0) == resourceList.getAResource(1))) == wonder.getStages()[THREE]
                                        .isEquals()))
                && (resourceList.sizeOfResourceList() == THREE)
                && ((wonder.getStages()[THREE].getPoints() == FIVE) || (wonder.getStages()[THREE].getPoints() == SIX)
                        || (wonder.getStages()[THREE].getPoints() == SEVEN))) {
            resourceList.removeResourceFromList();
            resourceList.removeResourceFromList();
            resourceList.removeResourceFromList();
            counterPoints += wonder.getStages()[THREE].getPoints();
            return Arrays.asList(true, counterPoints);
        } else {
            return new ConditionsForFourStages(wonder, resourceList).thirdPartForCondition();
        }
    }
}
