package jalau.at18.katas.bankocr.sarai;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidChecksumTest {
    @Test
    public void NumbersEigth(){
        String [] firstEntry = {" _     _  _  _  _  _  _  _ ",
                                " _||_||_ |_||_| _||_||_ |_ ",
                                " _|  | _||_||_||_ |_||_| _|"};
        ValidChecksum firstNumber = new ValidChecksum(firstEntry);
        //assertEquals("345882865",firstNumber.getfinalAcount(""));
    }
}
