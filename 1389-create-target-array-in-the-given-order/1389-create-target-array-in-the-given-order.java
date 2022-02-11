class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
          int[] workIndex = new int[nums.length];
        for(int i=0;i<index.length;i++){
            int cIndex=index[i];                        
            for(int j=i;j>=0;j--){
                if(cIndex<j)
                    workIndex[j]=workIndex[j-1];
                else if(cIndex==j)
                    workIndex[j]=nums[i];
                else
                    break;
            }                
        }
        return workIndex;
    }
}