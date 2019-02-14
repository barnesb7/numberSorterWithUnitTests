import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberSorterTest {

    NumberSorter testNumberSorter;

    @Before
    public void create(){
        testNumberSorter = new NumberSorter();

        testNumberSorter.addNumber(10);
        testNumberSorter.addNumber(2);
        testNumberSorter.addNumber(30);
    }

    @Test
    public void shouldAddANumber(){
        testNumberSorter.addNumber(10);
        int firstIndexOfNumbers = testNumberSorter.getNumbers().get(0);

        assertEquals(10, firstIndexOfNumbers);

        testNumberSorter.addNumber(2);
        int secondIndexOfNumbers = testNumberSorter.getNumbers().get(1);

        assertEquals(2, secondIndexOfNumbers);
    }

    @Test
    public void shouldReturnSmallestNumber(){

        int smallestNumber = testNumberSorter.getSmallestNumber();
        assertEquals(2, smallestNumber);
    }

    @Test
    public void shouldReturnLargestNumber(){

        int largestNumber = testNumberSorter.getLargestNumber();
        assertEquals(30, largestNumber);

        testNumberSorter.addNumber(100);
        int newLargestNumber = testNumberSorter.getLargestNumber();
        assertEquals(100, newLargestNumber);
    }



}