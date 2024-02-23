import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] dp = new int[n + 1][2];
        dp[1][0] = 1;
        dp[1][1] = 2;

        for (int i = 2; i < dp.length; i++) {
            dp[i][0] = (dp[i - 1][0] + dp[i - 1][1]) % 9901;
            dp[i][1] = (dp[i - 1][0] * 2 + dp[i - 1][1]) % 9901;
        }

        System.out.println((dp[n][0] + dp[n][1]) % 9901);
    }
}
