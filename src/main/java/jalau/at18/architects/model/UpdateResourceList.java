package jalau.at18.architects.model;

import java.util.List;

import jalau.at18.architects.model.wonders.Wonder;

public class UpdateResourceList {
    private ResourceList resourceList;
    private List<Object> conditionAndCounter;
    private int accumulatedCounter = 0;

    public UpdateResourceList(ResourceList resourceList) {
        this.resourceList = resourceList;
        System.out.println(resourceList);
    }

    public void addTheCard(Card cardTakenFromDeck) {
        if (cardTakenFromDeck.getColor() == "Gray") {
            resourceList.addResourceToList((GrayCard) cardTakenFromDeck);
        } else {
            resourceList.addResourceFromWildCard();
        }
    }

    public ResourceList getUpdateList() {
        return resourceList;
    }

    public boolean compareCards(Wonder wonder) {
        if (resourceList.sizeOfResourceList() > 1) {
            conditionAndCounter = new ConditionsForStages(wonder, resourceList).everyConditionForEveryStage();
            boolean condition = (Boolean) conditionAndCounter.get(0);
            int counter = (int) conditionAndCounter.get(1);
            accumulatedCounter += counter;
            return condition;
        } else {
            System.out.println("Lack of cards to fulfill the condition");
            return false;
        }
    }

    public int checkPoints() {
        return accumulatedCounter;
    }
}
