class Solution {
    public int findDuplicate(int[] nums) {
     //   time limit exceed bta rha hai 
    //    for(int i=0;i<nums.length-1;i++){
    //     for(int j=i+1;j<nums.length ;j++){
    //              if (nums[i]==nums[j]){
    //              return nums[i] ;
    //    } 

    // }
    // }
    // return -1;}}

               Arrays.sort(nums);
          for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return nums[i];
            } 
            }
            return -1;
            
    }}



