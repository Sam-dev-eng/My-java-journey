import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

public class TestStringPalindrome {

    @Test
    public void testIfMyFunctionalityReversesWell(){
        String str = "cohort";

        assertEquals("trohoc", StringPalindrom.reverseString(str));

    }

    @Test
    public void testIfMyFunctionalityIsPalindrome(){
        String [] words = {"racecar", "hello", "cohort", "madam"};
        Boolean [] result = {true, false, false, true};
        assertArrayEquals(result, StringPalindrom.arrayIsPalindrome(words));
    }
    @Test
    public void testMyArraySumMethods(){
        int [] num = {3,5,2,7,10};
        int [] result = {5,3};
        assertArrayEquals(result , StringPalindrom.ArraySumOfSecond(num, 8));
    }
}

