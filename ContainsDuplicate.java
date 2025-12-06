import java.util.*;

class Solution {
    public boolean containsDuplicate1(int[] nums) {
        HashSet<Integer> setNum = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            setNum.add(nums[i]);
        }

        if (setNum.size() == nums.length) {
            return false;
        }
        return true;
    }

    public boolean containsDuplicate(int[] nums) {
         HashMap<Integer, Integer> newMap = new HashMap<Integer, Integer>();
         for (int i = 0; i < nums.length; i++) {
            if(newMap.containsKey(nums[i])){
                return true;
            }else{
                newMap.put(nums[i], 1);
            }
        }
            return false;  
    }
}
