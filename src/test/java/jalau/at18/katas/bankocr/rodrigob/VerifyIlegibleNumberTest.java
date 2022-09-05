package jalau.at18.katas.bankocr.rodrigob;

import static org.junit.Assert.assertEquals;

import javax.net.ssl.TrustManager;

import org.junit.Test;

public class VerifyIlegibleNumberTest {
    @Test
    public void shouldVerifyIlegibleNumber() {
        String invalid = "123??4567";
        VerifyIlegibleNumber numberInvalid = new VerifyIlegibleNumber();
        boolean actualInvalid = numberInvalid.isLegibleNumber(invalid);
        assertEquals(false, actualInvalid);

        String valid = "123456789";
        VerifyIlegibleNumber numberValid = new VerifyIlegibleNumber();
        boolean actualValid = numberValid.isLegibleNumber(valid);
        assertEquals(true, actualValid);
    }
}
