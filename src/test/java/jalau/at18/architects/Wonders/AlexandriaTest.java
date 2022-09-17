package jalau.at18.architects.Wonders;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AlexandriaTest {
    @Test
    public void shouldReturnStages() {
        Alexandria alexandria = new Alexandria();
        alexandria.fillStages();
        Stage[] stagealexandria = new Stage[5];
        stagealexandria =  alexandria.getStages();
        assertEquals(3, stagealexandria[3].getCountOfResources());
        assertEquals(true, stagealexandria[3].isEquals());
        assertEquals(5, stagealexandria[3].getPoints());
    }
}
