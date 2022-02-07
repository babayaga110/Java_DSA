class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goodPair = 0;
        int l = nums.length;
		for(int i =0;i<l;i++){
		    for(int j =i+1;j<l;j++){
		       if(nums[i] == nums[j] )
		            goodPair++;
		    }
		}
        return goodPair;
    }
}