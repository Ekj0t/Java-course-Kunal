public class MaxWealth {
    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3}, {2, 5, 1}, {5, 4, 3}};
        int result = maximumWealth(nums);
        System.out.println(result);
    }

    static int maximumWealth(int[][] accounts) {
        //person = row
        //accounts = col
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            // when you start a new col, take a new sum for that row
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }

            // now sum of accounts of person
            // check with overall answer
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
