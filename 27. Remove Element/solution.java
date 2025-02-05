// NOTE:
// This file includes only the Solution class, not a complete executable program. 
// It serves as a reference to help you review and understand the logic whenever needed.

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Pointer for placement of non-val elements
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Move non-val element to position k
                k++; // Increment k
            }
        }
        
        return k; // Return the number of elements not equal to val
    }
}
