/*
 * Move zeroes to end of array
 * 
*/

import java.util.ArrayList;

class Solution {

    // Brute :------TC-O(2N)----------SC-O(N)
    public static void moveZero(int[] arr) {
        int n = arr.length;

        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp.add(arr[0]);
            }
        }

        int nonZero = temp.size();
        for (int i = 0; i < nonZero; i++) {
            arr[i] = temp.get(i);
        }
        for (int i = nonZero; i <= nonZero; i++) {
            arr[i] = 0;
        }
    }

    // Optimal Approach -----------TC-O(N)-----------SC-O(1)
    public static void MoveZero(int[] arr) {

        int i = 0; // pointer which tells where to put next non-zero element
        boolean hasZero = false;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 0) { // non zero ele found
                arr[i] = arr[j]; // copy non zero ele
                if (i != j) // if there is non zero ele only present in arr then i == j always
                            // but if i!j i.e j is forward means we have skipped the zero ele
                    hasZero = true;
                i++;
            }
        }

        if (!hasZero)
            return; // if no zero move out

        while (i < arr.length) { // zero ele present
            arr[i] = 0;
            i++;
        }

    }

}
