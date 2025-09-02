
class solution {

    // Brute Approach TC- O(n^2) SC-O(1)
    public static boolean isSorted(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    // Optimized approach TC- O(n) SC- O(1)
    public static boolean issort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

}
