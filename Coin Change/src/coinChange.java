import java.util.Arrays;

public class coinChange {

    public static void main(String[] args) {

        System.out.println(numCoins(34));
        System.out.println(numCoinsDP(31));
    }

    private static int numCoins(int cents) {

        if (cents < 5) {
            return cents;
        }

        int[] ary = new int[]{25, 10, 5, 1};
        int ans = 0;

        for (int i = 0; i < ary.length; i++) {
            ans += cents / ary[i];
            cents = cents % ary[i];
        }

        return ans;
    }

    private static int numCoinsDP(int cents) {

        if (cents < 5) {
            return cents;
        }

        int[] coins = new int[]{25, 10, 1};
        int[] table = new int[cents + 1];
        int ans = 0;

        table[0] = 0;
        for (int i = 1; i < table.length; i++) {
            table[i] = cents;
        }

        for (int i = 1; i < table.length; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i >= coins[j]) {
                    table[i] = Math.min((table[i - coins[j]] + 1), table[i]);
                }
            }
        }

        return table[cents];
    }
}
