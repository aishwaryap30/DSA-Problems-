/*
 * Linear Search
 */
class Solution {

    // Linear Search ------TC-O(N)--------SC-O(1)
    public static boolean search(int[] arr, int ele) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                return true;
            }
        }
        return false;
    }
}
