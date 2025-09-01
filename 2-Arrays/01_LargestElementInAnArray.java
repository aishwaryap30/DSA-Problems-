/**
 *  https://www.geeksforgeeks.org/problems/largest-element-in-array4009/1
 */

class solution {

    //Approach 1: Time Complexity = O(n), Space Complexity = O(1)
    public static int largestEle(int[] arr, int n) {

        int largestele = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] > largestele) {
                largestele = arr[i];
            }
        }
        return largestele;
    }

    /*Approach 2: Time Complexity = O(n * log(n)), Space Complexity = O(1)

    public static int largestEle(int[] arr, int n) {

        Arrays.sort(arr);
        return arr[n-1];
    }
    */
}