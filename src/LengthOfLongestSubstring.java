import java.util.HashSet;

/**
 * Created by Kahnnn on 2016/10/19.
 */
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int i=0, j=0, ans=0;
        HashSet<Character> set = new HashSet<>();

        // [i, j]
        while (i<s.length() && j<s.length()){
            if ( !set.contains(s.charAt(j)) ){
                set.add(s.charAt(j++));
                ans = Math.max(j - i, ans);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }

        return ans;

    }
}
