public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> com = new HashMap<>();
        for (int i=0;i<=nums.length;i++){
            int c = nums[i];
            if (com.containsKey(target-c)){
                return new int[] {i,com.get(target-c)};
            }
            com.put(c,i);
        }
        return new int[]{};
    }  
}
