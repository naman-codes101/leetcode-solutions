class Solution {
    public void sortColors(int[] nums) {

        int n=nums.length;
        int countzero=0;
        int countone=0;
        int counttwo=0;

        for(int i=0;i<n;i++){
            if(nums[i]==0){
                countzero++;
            }
            else if(nums[i]==1){
                countone++;
            }
            else{
                counttwo++;
            }
        }
     int i=0;

     while(countzero>0){
        nums[i]=0;
        i++;
        countzero--;
     }
     while(countone>0){
        nums[i]=1;
        i++;
        countone--;
     }
     while(counttwo>0){
        nums[i]=2;
        i++;
        counttwo--;
     }

    }
}