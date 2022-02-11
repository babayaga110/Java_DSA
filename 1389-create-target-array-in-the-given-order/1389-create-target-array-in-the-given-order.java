class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
          int[] fIndex = new int[nums.length];
        for(int i=0;i<index.length;i++){
            int cIndex=index[i];                        
            for(int j=i;j>=0;j--){
                if(cIndex<j)
                    fIndex[j]=fIndex[j-1];
                else if(cIndex==j)
                    fIndex[j]=nums[i];
                else
                    break;
            }                
        }
        return fIndex;
    }
}