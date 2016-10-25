import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kahnnn on 2016/10/19.
 */
public class LengthOfLongestSubstringTest {
    LengthOfLongestSubstring solution = new LengthOfLongestSubstring();

    @Test
    public void lengthOfLongestSubstring() throws Exception {
        assertEquals(0, solution.lengthOfLongestSubstring(""));
        assertEquals(1, solution.lengthOfLongestSubstring("a"));
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
    }

}