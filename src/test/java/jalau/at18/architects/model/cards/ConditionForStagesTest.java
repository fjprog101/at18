package jalau.at18.architects.model.cards;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import jalau.at18.architects.model.wonders.Rhodes;

public class ConditionForStagesTest {

    @Test
    public void shouldGiveATrueForFirstStage(){
        Rhodes rhodes = new Rhodes();
        ResourceList resourceList = new ResourceList();
        resourceList.addResourceFromWildCard();
        resourceList.addResourceToList(new GrayCard(Resource.BRICK));
        ConditionsForStages conditionsForStages = new ConditionsForStages(rhodes, resourceList);
        rhodes.fillStages();
        assertTrue((Boolean) conditionsForStages.everyConditionForEveryStage().get(0));
    }

    @Test
    public void shouldGiveATrueForThirdStage(){
        Rhodes rhodes = new Rhodes();
        ResourceList resourceList = new ResourceList();
        resourceList.addResourceFromWildCard();
        resourceList.addResourceToList(new GrayCard(Resource.BRICK));
        resourceList.addResourceToList(new GrayCard(Resource.WATER));
        ConditionsForStages conditionsForStages = new ConditionsForStages(rhodes, resourceList);
        rhodes.fillStages();
        assertTrue((Boolean) conditionsForStages.everyConditionForEveryStage().get(0));
    }

    @Test
    public void shouldGiveATrueForFifthStage(){
        Rhodes rhodes = new Rhodes();
        ResourceList resourceList = new ResourceList();
        resourceList.addResourceFromWildCard();
        resourceList.addResourceToList(new GrayCard(Resource.BRICK));
        resourceList.addResourceToList(new GrayCard(Resource.WATER));
        resourceList.addResourceFromWildCard();
        ConditionsForStages conditionsForStages = new ConditionsForStages(rhodes, resourceList);
        rhodes.fillStages();
        assertTrue((Boolean) conditionsForStages.everyConditionForEveryStage().get(0));
    }
}
