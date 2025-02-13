// NOTE:
// This file includes only the Solution class, not a complete executable program. 
// It serves as a reference to help you review and understand the logic whenever needed.



class Solution {
    public static int majorityElement(int[] nums) {

        int candidate = nums[0];
        int count = 1;

        for ( int i =1; i < nums.length ; i++){

            if (nums[i] == candidate){
                count ++;
            }

            else {
                count --;

                if (count == 0){
                    candidate = nums[i];
                    count =1;
                }
            }

        }

        return candidate;

        
        
    }


}