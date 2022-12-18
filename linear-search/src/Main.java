public class Main {
    public static void main(String[] args) {
        int[] nums = {23, 45, 5, 7, 2, -3, 8};
        int target = -3;
        System.out.println(linearSearch(nums, target));
    }

    //search in the array: return index if item found
    //otherwise if not found return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            // Check for element at every index
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        // this line will execute if none of the above cases match
        // hence target not found
        return Integer.MAX_VALUE;
    }

    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int element : arr) {
            // Check for element at every index
            if (element == target) {
                return element;
            }
        }

        // this line will execute if none of the above cases match
        // hence target not found
        return Integer.MAX_VALUE;
    }


    // Return true or false
    static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        // run a for loop
        for (int element : arr) {
            // Check for element at every index
            if (element == target) {
                return true;
            }
        }

        // this line will execute if none of the above cases match
        // hence target not found
        return false;
    }

}