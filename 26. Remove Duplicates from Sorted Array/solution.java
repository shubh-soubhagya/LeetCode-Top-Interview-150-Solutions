public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 1; // Initialize k to 1 since the first element is always unique

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { // Check if the current element is different from the previous one
                nums[k] = nums[i]; // Assign the current element to the position indicated by k
                k++; // Increment k to the next position
            }
        }

        return k; // k is the number of unique elements
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums1 = {1, 1, 2};
        int result1 = solution.removeDuplicates(nums1);
        System.out.println("Output: " + result1); // Output: 2
        for (int i = 0; i < result1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println(); // Output: 1 2

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result2 = solution.removeDuplicates(nums2);
        System.out.println("Output: " + result2); // Output: 5
        for (int i = 0; i < result2; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println(); // Output: 0 1 2 3 4
    }
}
