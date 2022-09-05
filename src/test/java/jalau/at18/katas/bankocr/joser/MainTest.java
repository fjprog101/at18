package jalau.at18.katas.bankocr.joser;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {
    @Test
    public void testInit() {
        Converter conv;
        String[] zeros = new String[] {" _  _  _  _  _  _  _  _  _ ",
                                       "| || || || || || || || || |",
                                       "|_||_||_||_||_||_||_||_||_|" };
        conv = new Converter(zeros);
        assertEquals("000000000", conv.getNumberScaned());

        String[] ones = new String[] {"                           ",
                                      "  |  |  |  |  |  |  |  |  |",
                                      "  |  |  |  |  |  |  |  |  |" };
        conv = new Converter(ones);
        assertEquals("111111111", conv.getNumberScaned());
        
        String[] two = new String[] {" _  _  _  _  _  _  _  _  _ ",
                                     " _| _| _| _| _| _| _| _| _|",
                                     "|_ |_ |_ |_ |_ |_ |_ |_ |_ " };
        conv = new Converter(two);
        assertEquals("222222222", conv.getNumberScaned());
                                     
        String[] three = new String[] {" _  _  _  _  _  _  _  _  _ ",
                                       " _| _| _| _| _| _| _| _| _|",
                                       " _| _| _| _| _| _| _| _| _|" };
        conv = new Converter(three);
        assertEquals("333333333", conv.getNumberScaned());
                                       
        String[] four = new String[] {"                           ",
                                      "|_||_||_||_||_||_||_||_||_|",
                                      "  |  |  |  |  |  |  |  |  |" };
        conv = new Converter(four);
        assertEquals("444444444", conv.getNumberScaned());
                                      
        String[] five = new String[]{" _  _  _  _  _  _  _  _  _ ",
                                     "|_ |_ |_ |_ |_ |_ |_ |_ |_ ",
                                     " _| _| _| _| _| _| _| _| _|" };
         conv = new Converter(five);
        assertEquals("555555555", conv.getNumberScaned());
        String[] six = new String[] {" _  _  _  _  _  _  _  _  _ ",
                                     "|_ |_ |_ |_ |_ |_ |_ |_ |_ ",
                                     "|_||_||_||_||_||_||_||_||_|" };
        conv = new Converter(six);
        assertEquals("666666666", conv.getNumberScaned());
        String[] seven = new String[] {" _  _  _  _  _  _  _  _  _ ",
                                       "  |  |  |  |  |  |  |  |  |",
                                       "  |  |  |  |  |  |  |  |  |" };
        conv = new Converter(seven);
        assertEquals("777777777", conv.getNumberScaned());
        String[] eight = new String[] {" _  _  _  _  _  _  _  _  _ ",
                                       "|_||_||_||_||_||_||_||_||_|",
                                       "|_||_||_||_||_||_||_||_||_|" };
        conv = new Converter(eight);
        assertEquals("888888888", conv.getNumberScaned());
        String[] nine = new String[] {" _  _  _  _  _  _  _  _  _ ",
                                      "|_||_||_||_||_||_||_||_||_|",
                                      " _| _| _| _| _| _| _| _| _|" };
        conv = new Converter(nine);
        assertEquals("999999999", conv.getNumberScaned());
        String[] scale = new String[] {"    _  _     _  _  _  _  _ ",
                                       "  | _| _||_||_ |_   ||_||_|",
                                       "  ||_  _|  | _||_|  ||_| _|" };
        conv = new Converter(scale);
        assertEquals("123456789", conv.getNumberScaned());
        String[] test1 = new String[] {" _  _  _  _  _  _  _  _    ",
                                       "| || || || || || || ||_   |",
                                       "|_||_||_||_||_||_||_| _|  |" };
        conv = new Converter(test1);
        assertEquals("000000051", conv.getNumberScaned());
        String[] test2 = new String[] {"    _  _  _  _  _  _     _ ",
                                       "|_||_|| || ||_   |  |  | _ ",
                                       "  | _||_||_||_|  |  |  | _|" };
        conv = new Converter(test2);
        Format form = new Format(conv.getNumberScaned());
        assertEquals("49006771? ILL", form.formated());


        String[] test3 = new String[] {"    _  _     _  _  _  _  _ ",
                                       "  | _| _||_| _ |_   ||_||_|",
                                       "  ||_  _|  | _||_|  ||_| _ " };
        conv = new Converter(test3);
        assertEquals("1234?678? ILL", conv.getNumberScaned());
        String[] test4 = new String[] {"                           ",
                                       "  |  |  |  |  |  |  |  |  |",
                                       "  |  |  |  |  |  |  |  |  |" };
        conv = new Converter(four);
        assertEquals("444444444", conv.getNumberScaned());
        String[] test5 = new String[] {" _  _  _  _  _  _  _  _  _",
                                       "  |  |  |  |  |  |  |  |  |",
                                       "  |  |  |  |  |  |  |  |  |" };
        conv = new Converter(four);
        assertEquals("444444444", conv.getNumberScaned());
        String[] test6 = new String[] {" _  _  _  _  _  _  _  _  _ ",
                                       " _|| || || || || || || || |",
                                       "|_ |_||_||_||_||_||_||_||_|" };
         conv = new Converter(four);
        assertEquals("444444444", conv.getNumberScaned());
        String[] test7 = new String[] {" _  _  _  _  _  _  _  _  _ ",
                                       " _| _| _| _| _| _| _| _| _|",
                                       " _| _| _| _| _| _| _| _| _|" };
 conv = new Converter(four);
        assertEquals("444444444", conv.getNumberScaned());
        String[] test8 = new String[] {" _  _  _  _  _  _  _  _  _ ",
                                       "|_||_||_||_||_||_||_||_||_|",
                                       "|_||_||_||_||_||_||_||_||_|" };
 conv = new Converter(four);
        assertEquals("444444444", conv.getNumberScaned());
        String[] test9 = new String[] {" _  _  _  _  _  _  _  _  _ ",
                                       "|_ |_ |_ |_ |_ |_ |_ |_ |_ ",
                                       " _| _| _| _| _| _| _| _| _|" };
 conv = new Converter(four);
        assertEquals("444444444", conv.getNumberScaned());
        String[] test10 = new String[] {" _  _  _  _  _  _  _  _  _ ",
                                        "|_ |_ |_ |_ |_ |_ |_ |_ |_ ",
                                        "|_||_||_||_||_||_||_||_||_|" };
 conv = new Converter(four);
        assertEquals("444444444", conv.getNumberScaned());
        String[] test11 = new String[] {" _  _  _  _  _  _  _  _  _ ",
                                        "|_||_||_||_||_||_||_||_||_|",
                                        " _| _| _| _| _| _| _| _| _|" };
 conv = new Converter(four);
        assertEquals("444444444", conv.getNumberScaned());
        String[] test12 = new String[] {"    _  _  _  _  _  _     _ ",
                                        "|_||_|| || ||_   |  |  ||_ ",
                                        "  | _||_||_||_|  |  |  | _|" };
 conv = new Converter(four);
        assertEquals("444444444", conv.getNumberScaned());
        String[] test13 = new String[] {"    _  _     _  _  _  _  _ ",
                                        " _| _| _||_||_ |_   ||_||_|",
                                        "  ||_  _|  | _||_|  ||_| _|" };
 conv = new Converter(four);
        assertEquals("444444444", conv.getNumberScaned());
        String[] test14 = new String[] {" _     _  _  _  _  _  _    ",
                                        "| || || || || || || ||_   |",
                                        "|_||_||_||_||_||_||_| _|  |" };
 conv = new Converter(four);
        assertEquals("444444444", conv.getNumberScaned());
        String[] test15 = new String[] {"    _  _  _  _  _  _     _ ",
                                        "|_||_|| ||_||_   |  |  | _ ",
                                        "  | _||_||_||_|  |  |  | _|" };


       
    }
}
