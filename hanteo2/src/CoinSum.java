public class CoinSum {
    public int getCoinChargeWays(int sum, int[] coins) {
        int[] sumArr = new int[sum + 1];
        sumArr[0] = 1;

        for (int coin : coins) {
            for (int i = coin; i <= sum; i++) {
                sumArr[i] += sumArr[i - coin];
            }
        }
        return sumArr[sum];
    }

}
