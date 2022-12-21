public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18}; // mid 9 element 3
        int target = 15;
        int ans = ceiling(arr, target);
        System.out.println(arr[ans]);
    }

    /*
    First array;
    then find middle element
    if middle is greater than target, return
     */

    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find middle element
            // int mid = (start+end)/2; issue may happen because it exceeds int range
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // answer found
                return mid;
            }
        }

        return start;
    }
}