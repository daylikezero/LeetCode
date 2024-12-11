class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];

        for(int i=0; i<nums.length; i++) {
            int i_val = nums[i];
            for(int j=1; j<nums.length; j++) {
                if (i == j) 
                    continue;
                int j_val = nums[j];
                if(i_val + j_val == target) {
                    output[0] = i;
                    output[1] = j;
                }
            }
        }
        return output;
    }
}