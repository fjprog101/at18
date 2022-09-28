package jalau.at18.architects.model.cards;

import java.util.Arrays;
import java.util.List;

import jalau.at18.architects.model.wonders.Wonder;

public class ConditionsForFourStages {
    private Wonder wonder;
    private ResourceList resourceList;
    private static final int THREE = 3;
    private static final int FOUR = 4;
    private static final int SEVEN = 7;
    private static final int EIGHT = 8;
    private int counterPoints = 0;

    public ConditionsForFourStages(Wonder wonder, ResourceList resourceList) {
        this.wonder = wonder;
        this.resourceList = resourceList;
    }

    public List<Object> thirdPartForCondition() {
        if (((resourceList.getAResource(0) != Resource.GOLD.getResource()
                && resourceList.getAResource(1) != Resource.GOLD.getResource()
                && resourceList.getAResource(2) != Resource.GOLD.getResource()
                && resourceList.getAResource(THREE) != Resource.GOLD.getResource()))
                && ((resourceList.getAResource(0) == resourceList.getAResource(1)) == (resourceList
                        .getAResource(1) == resourceList.getAResource(2)) == (resourceList
                                .getAResource(2) == resourceList.getAResource(THREE)) == wonder.getStages()[FOUR]
                                        .isEquals())
                && resourceList.sizeOfResourceList() == FOUR
                && (wonder.getStages()[FOUR].getPoints() == SEVEN || wonder.getStages()[FOUR].getPoints() == EIGHT)) {
            resourceList.removeResourceFromList();
            resourceList.removeResourceFromList();
            resourceList.removeResourceFromList();
            resourceList.removeResourceFromList();
            counterPoints += wonder.getStages()[FOUR].getPoints();
            return Arrays.asList(true, counterPoints);
        } else if ((resourceList.getAResource(0) == Resource.GOLD.getResource()
                || resourceList.getAResource(1) == Resource.GOLD.getResource()
                || resourceList.getAResource(2) == Resource.GOLD.getResource()
                || resourceList.getAResource(THREE) == Resource.GOLD.getResource())
                && ((((resourceList.getAResource(1) == resourceList.getAResource(2))
                        && (resourceList.getAResource(2) == resourceList.getAResource(THREE)))
                        || ((resourceList
                                .getAResource(0) == resourceList.getAResource(2))
                                && (resourceList.getAResource(2) == resourceList.getAResource(THREE)))
                        || ((resourceList
                                .getAResource(0) == resourceList.getAResource(1))
                                && (resourceList.getAResource(2) == resourceList.getAResource(THREE)))
                        || ((resourceList
                                .getAResource(0) == resourceList.getAResource(1))
                                && (resourceList.getAResource(1) == resourceList.getAResource(2))) == wonder
                                        .getStages()[FOUR].isEquals())
                        && resourceList.sizeOfResourceList() == FOUR && (wonder.getStages()[FOUR].getPoints() == SEVEN
                                || wonder.getStages()[FOUR].getPoints() == EIGHT))) {
            resourceList.removeResourceFromList();
            resourceList.removeResourceFromList();
            resourceList.removeResourceFromList();
            resourceList.removeResourceFromList();
            counterPoints += wonder.getStages()[FOUR].getPoints();
            return Arrays.asList(true, counterPoints);
        } else {
            return Arrays.asList(false, counterPoints);
        }
    }
}
