// NOTE:
// This file includes only the Solution class, not a complete executable program. 
// It serves as a reference to help you review and understand the logic whenever needed.

class Solution {
    public static int removeDuplicates(int[] nums) {

        if(nums.length <= 2){
            return nums.length;
        }

        int k=2;

        for (int i = 2; i < nums.length ; i++){

            if (nums[i] != nums[k-2]){

                nums[k] = nums[i];
                k++;

            }

        }

        return k;
        
    }

}