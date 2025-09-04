/*  
 * Left rotate Array by one place 
 * 
*/
class Solution {

    // Brute: ------------TC- O(N)-------------- SC-O(N)
    public static void rotate(int[] arr) {
        int n = arr.length;

        int[] temp = new int[n];
        for (int i = 1; i <= n; i++) {
            temp[i - 1] = arr[i];
        }
        temp[n - 1] = arr[0];
    }

    // optimal solution ---------TC- O(N)---------SC-O(1)
    public static void leftRotate(int[] arr) {

        int n = arr.length;

        int fisrtEle = arr[0];

        for (int i = 1; i <= n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = fisrtEle;
    }
}
