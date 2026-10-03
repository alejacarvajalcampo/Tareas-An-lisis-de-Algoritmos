package taller;
import java.util.*;

public class mergeIntervals {
    public int[][] merge(int[][] intervals) {

        // 1. Ordenamos por el inicio del intervalo
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> resultado = new ArrayList<>();

        // 2. Tomamos el primer intervalo
        int inicio = intervals[0][0];
        int fin = intervals[0][1];

        // 3. Recorremos los demás intervalos
        for (int i = 1; i < intervals.length; i++) {

            int siguienteInicio = intervals[i][0];
            int siguienteFin = intervals[i][1];

            // ¿Se solapan?
            if (siguienteInicio <= fin) {
                fin = Math.max(fin, siguienteFin);
            } else {
                // No se solapan, guardamos el actual
                resultado.add(new int[]{inicio, fin});

                inicio = siguienteInicio;
                fin = siguienteFin;
            }
        }

        // Agregamos el último intervalo
        resultado.add(new int[]{inicio, fin});

        return resultado.toArray(new int[resultado.size()][]);
    }
}