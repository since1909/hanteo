import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CoinSum coinSum = new CoinSum();
        int sum = 10;
        int[] coins = {2, 5, 3, 6};
        System.out.println("입력: {sum: " + sum + ", coins: " + Arrays.toString(coins) + "}");
        System.out.println("출력: " + coinSum.getCoinChargeWays(sum, coins));

        int sumCase1 = 10;
        int[] coinsCase1 = {1};
        System.out.println("입력: {sum: " + sumCase1 + ", coins: " + Arrays.toString(coinsCase1) + "}");
        System.out.println("출력: " + coinSum.getCoinChargeWays(sumCase1, coinsCase1));

        int sumCase2 = 5;
        int[] coinsCase2 = {1, 2, 5};
        System.out.println("입력: {sum: " + sumCase2 + ", coins: " + Arrays.toString(coinsCase2) + "}");
        System.out.println("출력: " + coinSum.getCoinChargeWays(sumCase2, coinsCase2));

        int sumCase3 = 0;
        int[] coinsCase3 = {1, 2, 5}; // 0을 만드는 방법
        System.out.println("입력: {sum: " + sumCase3 + ", coins: " + Arrays.toString(coinsCase3) + "}");
        System.out.println("출력: " + coinSum.getCoinChargeWays(sumCase3, coinsCase3));

        int sumCase4 = 10;
        int[] coinsCase4 = {}; // 동전이 없는 경우
        System.out.println("입력: {sum: " + sumCase4 + ", coins: " + Arrays.toString(coinsCase4) + "}");
        System.out.println("출력: " + coinSum.getCoinChargeWays(sumCase4, coinsCase4));
    }
}
