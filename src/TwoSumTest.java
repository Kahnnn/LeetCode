import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kahnnn on 2016/10/19.
 */
public class TwoSumTest {
    TwoSum solution = new TwoSum();

    @Test
    public void twoSum() throws Exception {
        int[] nums = new int[]{3, 2, 4};
        int[] result = solution.twoSum(nums,6);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
    }

}