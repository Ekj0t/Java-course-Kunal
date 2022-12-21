public class SmallestLetter {
    public static void main(String[] args) {
        char[] arr = {'c', 'd', 'f', 'j'}; // mid 9 element 3
        char target = 'j';
        char ans = nextGreatestLetter(arr, target);
        System.out.println(ans);
    }

    /*
    First array;
    then find middle element
    if middle is greater than target, return
     */

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            // find middle element
            // int mid = (start+end)/2; issue may happen because it exceeds int range
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return letters[start % letters.length];
    }
}
