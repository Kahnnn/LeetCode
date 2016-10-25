import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kahnnn on 2016/10/18.
 */
public class LongestPalindromeTest {
    
    LongestPalindrome test = new LongestPalindrome();
    
    @Test
    public void longestPalindrome() throws Exception {
        assertEquals("a",test.longestPalindrome("a"));
        assertEquals("aa",test.longestPalindrome("aa"));
        assertEquals("a",test.longestPalindrome("ab"));
        assertEquals("a",test.longestPalindrome("abc"));
        assertEquals("aba",test.longestPalindrome("aba"));
        assertEquals("bb",test.longestPalindrome("abb"));
        assertEquals("cc",test.longestPalindrome("ccd"));
        assertEquals("bcb",test.longestPalindrome("abcbb"));
        assertEquals("bcb",test.longestPalindrome("abcbe"));
        assertEquals("aaaa",test.longestPalindrome("aaaa"));
    }

}