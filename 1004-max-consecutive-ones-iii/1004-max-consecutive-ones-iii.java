class Solution {
    public int longestOnes(int[] nums, int k) {
        int left =0;            
        int maxAns=0;
        int zerocount=0;
        int n=nums.length;

        for(int right=0;right<n;right++){
            if(nums[right]==0){
                zerocount++;
            }
            while(zerocount>k){
                if(nums[left]==0){
                    zerocount--;
                }
                left++;
            }
            maxAns=Math.max(maxAns,right-left+1);
        }
        return  maxAns;
    }
}