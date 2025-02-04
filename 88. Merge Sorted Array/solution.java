// NOTE:
// This file includes only the Solution class, not a complete executable program. 
// It serves as a reference to help you review and understand the logic whenever needed.

class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
    int i = m - 1;     // Last valid element in nums1
    int j = n - 1;     // Last valid element in nums2
    int k = m + n - 1; // Last index of nums1

    // Merge from the end of both arrays
    while (i >= 0 && j >= 0) {
        if (nums1[i] > nums2[j]) {
            nums1[k] = nums1[i];
            i--;
        } else {
            nums1[k] = nums2[j];
            j--;
        }
        k--;
    }

    // If nums2 has remaining elements, copy them to nums1
    while (j >= 0) {
        nums1[k] = nums2[j];
        j--;
        k--;
    }
}

}