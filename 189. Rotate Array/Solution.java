// NOTE:
// This file includes only the Solution class, not a complete executable program. 
// It serves as a reference to help you review and understand the logic whenever needed.


class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle cases where k is greater than n
        int[] nums2 = new int[n];
        
        // Place each element in its new position
        for (int i = 0; i < n; i++) {
            nums2[(i + k) % n] = nums[i];
        }
        
        // Copy the rotated array back to the original array
        for (int i = 0; i < n; i++) {
            nums[i] = nums2[i];
        }
    }
}
