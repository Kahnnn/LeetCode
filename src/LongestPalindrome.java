/**
 * Created by Kahnnn on 2016/10/18.
 */
public class LongestPalindrome {
    public String longestPalindrome(String s) {

        int maxR = 1, index = 1;

        if (s.length() == 0 || s.length() == 1) {
            return s;
        }

        String newStr = s.replaceAll("^||.?", "$0#");

        for (int i = 1; i < newStr.length() - 1; i++) {
            for (int r = 1; i - r >= 0 && i + r < newStr.length(); r++) {
                if (newStr.charAt(i - r) == newStr.charAt(i + r)) {
                    if (r > maxR) {
                        maxR = r;
                        index = i;
                    }
                } else {
                    break;
                }
            }
        }

        return s.substring((index - maxR) / 2, (index + maxR) / 2);
    }

}
