
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;



public class TestRangeArray {

    @Test
    public void testRange() {

        int [] numbers = {2,5,7,4,8,-5};
        RangeArray rangeNum = new RangeArray();
        int [] result = {-4, -3, -2, -1, 0, 1, 3, 6};

        assertArrayEquals(result,rangeNum.range(numbers));

    }
}
