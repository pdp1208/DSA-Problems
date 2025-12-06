import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> setNum = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            setNum.add(nums[i]);
        }

        if (setNum.size() == nums.length) {
            return false;
        }
        return true;
    }
}
