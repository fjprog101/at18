package jalau.at18.sample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleTest {
    @Test
    public void shouldSayHello() {
        Sample sample = new Sample();
        assertEquals("Hello World", sample.sayHello());
    }
}