import java.util.*;

public class CoinChange {
    public static int coinChange1(int[] coins, int amount) {
        if(amount == 0){
            return 0;
        }
        Arrays.sort(coins);
        return helper(coins, amount, 0);
    }

    private static int helper(int[] coins, int amount, int count){
        if(amount == 0){
            return count;
        }
        if(amount < 0){
            return -1;
        }
        int min = Integer.MAX_VALUE;
        for(int coin : coins){
            int res = helper(coins, amount - coin, count + 1);
            if(res != -1){
                min = Math.min(min, res);
            }
        }
        if(min != Integer.MAX_VALUE){
            return min;
        }else{
            return -1;
        }
    }
    public static int coinChange(int[] coins, int amount) {
        if(amount == 0){
            return amount;
        }
        int[] dp = new int[amount + 1];
        for(int i = 1; i <= amount; i++){
            for(int j = 0; j < coins.length; j++){
                if(i >= coins[j]){
                    if(dp[i] == 0){
                        if(dp[i - coins[j]] != 0 || i == coins[j]){
                            dp[i] = dp[i - coins[j]] + 1;
                        }

                    }else{
                        dp[i] = Math.min(dp[i - coins[j]] + 1, dp[i]);
                    }
                }
            }
        }
        return dp[amount] == 0 ? -1 : dp[amount];
    }
    public static void main(String[] args){
        int[] array = {186,419,83,408};
        int val = 6249;
        System.out.println(coinChange(array, val));
    }

}
