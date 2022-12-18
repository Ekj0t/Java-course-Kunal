public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {18,12,-7,3,14,28};
        int target = 3;
        System.out.println(linearSearch(nums, target,1,4));
    }
    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int index=start;index<=end;index++) {
            // Check for element at every index
            int element = arr[index];
            if (element==target){
                return index;
            }
        }

        // this line will execute if none of the above cases match
        // hence target not found
        return -1;
    }
}
