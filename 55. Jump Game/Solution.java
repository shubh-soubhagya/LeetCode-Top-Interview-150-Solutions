// NOTE:
// This file includes only the Solution class, not a complete executable program. 
// It serves as a reference to help you review and understand the logic whenever needed.


class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = 0;  // To keep track of the farthest index we can reach
        
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                return false; // If we can't reach the current index, return false
            }
            maxReach = Math.max(maxReach, i + nums[i]); // Update the farthest index we can reach
            if (maxReach >= nums.length - 1) {
                return true; // If we can reach or exceed the last index, return true
            }
        }
        return true;
    }
}
