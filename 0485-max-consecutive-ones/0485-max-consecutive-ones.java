class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n =nums.length;
        int maxans=0;
        int currentcount=0;

        for(int j=0;j<n;j++){
            if(nums[j]==1){
                currentcount++;
            }
            else{
                maxans=Math.max(maxans,currentcount);
                currentcount=0;
            }
           
        }
        return Math.max(currentcount,maxans);
        
    }
}