package jalau.at18.katas.bankocr.maria;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertNumberTest {
    public static final int NUMBER_THREE = 3;
    public static final int NUMBER_FOUR = 4;
    public static final int NUMBER_FIVE = 5;
    public static final int NUMBER_SIX = 6;
    public static final int NUMBER_SEVEN = 7;
    public static final int NUMBER_EIGHT = 8;
    public static final int NUMBER_NINE = 9;

    @Test
    public void convertZero() {
        SetNumberToConvert setNumberToConvert = new SetNumberToConvert();
        ConvertNumber convertNumber = new ConvertNumber(setNumberToConvert);
        String firsColumn = " _ ";
        String secondColumn = "| |";
        String thirdColumn = "|_|";
        int number = convertNumber.convert(firsColumn, secondColumn, thirdColumn);
        assertEquals(0, number);
    }

    @Test
    public void convertOne() {
        SetNumberToConvert setNumberToConvert = new SetNumberToConvert();
        ConvertNumber convertNumber = new ConvertNumber(setNumberToConvert);
        String firsColumn = "   ";
        String secondColumn = "  |";
        String thirdColumn = "  |";
        int number = convertNumber.convert(firsColumn, secondColumn, thirdColumn);
        assertEquals(1, number);
    }

    @Test
    public void convertTwo() {
        SetNumberToConvert setNumberToConvert = new SetNumberToConvert();
        ConvertNumber convertNumber = new ConvertNumber(setNumberToConvert);
        String firsColumn = " _ ";
        String secondColumn = " _|";
        String thirdColumn = "|_ ";
        int number = convertNumber.convert(firsColumn, secondColumn, thirdColumn);
        assertEquals(2, number);
    }

    @Test
    public void convertThree() {
        SetNumberToConvert setNumberToConvert = new SetNumberToConvert();
        ConvertNumber convertNumber = new ConvertNumber(setNumberToConvert);
        String firsColumn = " _ ";
        String secondColumn = " _|";
        String thirdColumn = " _|";
        int number = convertNumber.convert(firsColumn, secondColumn, thirdColumn);
        assertEquals(NUMBER_THREE, number);
    }

    @Test
    public void convertFour() {
        SetNumberToConvert setNumberToConvert = new SetNumberToConvert();
        ConvertNumber convertNumber = new ConvertNumber(setNumberToConvert);
        String firsColumn = "   ";
        String secondColumn = "|_|";
        String thirdColumn = "  |";
        int number = convertNumber.convert(firsColumn, secondColumn, thirdColumn);
        assertEquals(NUMBER_FOUR, number);
    }

    @Test
    public void convertFive() {
        SetNumberToConvert setNumberToConvert = new SetNumberToConvert();
        ConvertNumber convertNumber = new ConvertNumber(setNumberToConvert);
        String firsColumn = " _ ";
        String secondColumn = "|_ ";
        String thirdColumn = " _|";
        int number = convertNumber.convert(firsColumn, secondColumn, thirdColumn);
        assertEquals(NUMBER_FIVE, number);
    }

    @Test
    public void convertSix() {
        SetNumberToConvert setNumberToConvert = new SetNumberToConvert();
        ConvertNumber convertNumber = new ConvertNumber(setNumberToConvert);
        String firsColumn = " _ ";
        String secondColumn = "|_ ";
        String thirdColumn = "|_|";
        int number = convertNumber.convert(firsColumn, secondColumn, thirdColumn);
        assertEquals(NUMBER_SIX, number);
    }

    @Test
    public void convertSeven() {
        SetNumberToConvert setNumberToConvert = new SetNumberToConvert();
        ConvertNumber convertNumber = new ConvertNumber(setNumberToConvert);
        String firsColumn = " _ ";
        String secondColumn = "  |";
        String thirdColumn = "  |";
        int number = convertNumber.convert(firsColumn, secondColumn, thirdColumn);
        assertEquals(NUMBER_SEVEN, number);
    }

    @Test
    public void convertEight() {
        SetNumberToConvert setNumberToConvert = new SetNumberToConvert();
        ConvertNumber convertNumber = new ConvertNumber(setNumberToConvert);
        String firsColumn = " _ ";
        String secondColumn = "|_|";
        String thirdColumn = "|_|";
        int number = convertNumber.convert(firsColumn, secondColumn, thirdColumn);
        assertEquals(NUMBER_EIGHT, number);
    }
    @Test
    public void convertNine() {
        SetNumberToConvert setNumberToConvert = new SetNumberToConvert();
        ConvertNumber convertNumber = new ConvertNumber(setNumberToConvert);
        String firsColumn = " _ ";
        String secondColumn = "|_|";
        String thirdColumn = " _|";
        int number = convertNumber.convert(firsColumn, secondColumn, thirdColumn);
        assertEquals(NUMBER_NINE, number);
    }


}
