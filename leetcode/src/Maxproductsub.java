public class Maxproductsub {
    public static int maxProduct(int[] nums) {
        int[][] dp = new int[nums.length + 1][nums.length + 1];
        dp[0][0] = nums[0];
        dp[0][1] = nums[0];
        int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < 0){
                dp[i][0] = Math.max(dp[i - 1][1] * nums[i], nums[i]);
                dp[i][1] = Math.min(dp[i - 1][0] * nums[i], nums[i]);
            }else{
                dp[i][0] = Math.max(dp[i - 1][0] * nums[i], nums[i]);
                dp[i][1] = Math.min(dp[i - 1][1] * nums[i], nums[i]);
            }
            max = Math.max(max, dp[i][0]);
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr = {-1, -2, -9, -6};
        System.out.println(maxProduct(arr));
    }
}
