# Remove Element from Array

## Problem Statement
Given an integer array `nums` and an integer `val`, remove all occurrences of `val` **in-place**. The order of the elements may be changed. Then, return the number of elements in `nums` that are **not equal to val**.

### Requirements
- Modify `nums` such that the first `k` elements contain only values **not equal to** `val`.
- The remaining elements in `nums` **do not matter**.
- Return `k`, which is the count of elements that are **not equal to** `val`.

## Custom Judge
The judge will verify the implementation using the following steps:

```java
int[] nums = [...]; // Input array
int val = ...; // Value to remove
int[] expectedNums = [...]; // Expected output (sorted, with no val present)

int k = removeElement(nums, val); // Calls your function

assert k == expectedNums.length;  // Ensure correct length
sort(nums, 0, k); // Sort first k elements for comparison
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i]; // Check each element
}
