package jalau.at18.architects.model.cards;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import jalau.at18.architects.model.wonders.Rhodes;
public class UpdateResourceListTest {
    @Test
    public void shouldReturnFalseWithOnlyOneCard() {
        Rhodes rhodes = new Rhodes();
        UpdateResourceList updateResourceList = new UpdateResourceList();
        GrayCard firstCard = new GrayCard(Resource.BRICK);
        updateResourceList.addTheCard(firstCard);
        assertFalse(updateResourceList.compareCards(rhodes));
        assertNotNull(updateResourceList.getUpdateList());
    }
}
