class Solution {
    public int[] runningSum(int[] nums) {
        int l = nums.length;
        nums[0] = nums[0];
        for(int i =1; i<l;i++){
            nums[i] = nums[i-1]+nums[i];
        }
        return nums;
    }
}