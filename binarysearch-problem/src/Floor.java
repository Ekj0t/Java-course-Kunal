public class Floor {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18}; // mid 9, mid = 3
        int target = 100;
        int ans = floor(arr, target);
        System.out.println(arr[ans]);
    }

    /*
    First array;
    then find middle element
    if middle is greater than target, return
     */

    static int floor(int[] arr, int target) {
        // if target is greater than the greatest element in the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }

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

        return end;
    }
}