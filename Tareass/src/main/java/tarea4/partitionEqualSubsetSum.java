package tarea4;

public class partitionEqualSubsetSum {
    public boolean canPartition(int[] nums) {

        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        // Si la suma es impar, no se puede dividir
        if (sum % 2 != 0) {
            return false;
        }

        int target = sum / 2;

        boolean[] dp = new boolean[target + 1];

        // Caso base
        dp[0] = true;

        for (int num : nums) {

            // Recorrer hacia atrás porque cada número
            // solamente puede utilizarse una vez
            for (int w = target; w >= num; w--) {

                dp[w] = dp[w] || dp[w - num];
            }
        }

        return dp[target];
    }
}
