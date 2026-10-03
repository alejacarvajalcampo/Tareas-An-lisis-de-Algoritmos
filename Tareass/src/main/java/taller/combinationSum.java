package taller;
import java.util.*;
public class combinationSum {

        public List<List<Integer>> combinationSum(
                int[] candidates, int target) {

            List<List<Integer>> resultado = new ArrayList<>();

            backtrack(
                    candidates,
                    target,
                    0,
                    new ArrayList<>(),
                    resultado
            );

            return resultado;
        }

        private void backtrack(
                int[] candidates,
                int restante,
                int inicio,
                List<Integer> combinacion,
                List<List<Integer>> resultado) {

            // Encontramos una combinación válida
            if (restante == 0) {
                resultado.add(new ArrayList<>(combinacion));
                return;
            }

            // Nos pasamos del target
            if (restante < 0) {
                return;
            }

            for (int i = inicio; i < candidates.length; i++) {

                // Elegimos
                combinacion.add(candidates[i]);

                // Podemos volver a utilizar candidates[i]
                backtrack(
                        candidates,
                        restante - candidates[i],
                        i,
                        combinacion,
                        resultado
                );

                // DESHACEMOS la elección
                combinacion.remove(combinacion.size() - 1);
            }
        }
    }