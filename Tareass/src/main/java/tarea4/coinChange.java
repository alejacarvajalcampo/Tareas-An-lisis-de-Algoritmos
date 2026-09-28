package tarea4;

public class coinChange {
    public int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount + 1];

        // Valor imposible
        int impossible = amount + 1;

        // Inicializamos
        for (int i = 1; i <= amount; i++) {
            dp[i] = impossible;
        }

        // Caso base
        dp[0] = 0;

        // Recorremos los montos
        for (int x = 1; x <= amount; x++) {

            // Probamos cada moneda
            for (int coin : coins) {

                if (coin <= x) {

                    dp[x] = Math.min(
                            dp[x],
                            dp[x - coin] + 1
                    );
                }
            }
        }

        // Si no fue posible formar el monto
        if (dp[amount] == impossible) {
            return -1;
        }

        return dp[amount];
    }
}
