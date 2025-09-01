/*
 * https://www.geeksforgeeks.org/problems/second-largest3735/1
 */
class solution{

    // TC: O(n)    SC: O(1)
    public static int secondLargest(int[] arr, int n){
        int max1= Math.MIN_VALUE;
        int max2= Math.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(arr[i] > max1){
                max2= max1;
                max1= arr[i];
            }
            else if(arr[i] > max2 && arr[i] != max1){
                max2=arr[i];
            }
        }
        return max2;
    }

    /*
     public static int secondLargest(int[] arr, int n){
        Arrays.sort(arr);
        return arr[n-2];
     }
     */
}