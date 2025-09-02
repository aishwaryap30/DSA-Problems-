import java.util.HashSet;

class solution {

    /*
     * Brute Approach   TC-O(2N)      SC-O(N)
     * used hashset because it only stores unique elements
     * 
     */
    public static void removeDuplicate(int[] arr) {

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int k = set.size();

        int j = 0;
        for (int x : set) {
            arr[j++] = x;
        }
    }

    // Optimized Approach   TC- O(N)       SC-O(1)
    public static void removeDuplicat(int[] arr) {
        int i = 0; // keep track of last unique ele

        for (int j = 1; j < arr.length; j++) { // move through arr to find unique ele

            if (arr[j] != arr[i]) { // unique ele found
                i++; // move i
                arr[i] = arr[j]; // copy unique ele
            }
        }
    }

}
