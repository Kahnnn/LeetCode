/**
 * Created by Kahnnn on 2016/10/19.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        for(int i=0 ; i<length; i++){
            for(int j=i+1; j<length; j++){
                if(target - nums[i] == nums[j]){
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
