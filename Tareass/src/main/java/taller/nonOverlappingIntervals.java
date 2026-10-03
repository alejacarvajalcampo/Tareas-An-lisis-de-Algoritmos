package taller;

import java.util.*;
public class nonOverlappingIntervals {

        public int eraseOverlapIntervals(int[][] intervals) {

            // Ordenamos por el final
            Arrays.sort(intervals,
                    (a, b) -> Integer.compare(a[1], b[1]));

            int conservados = 0;
            int ultimoFin = Integer.MIN_VALUE;

            for (int[] intervalo : intervals) {

                int inicio = intervalo[0];
                int fin = intervalo[1];

                // No se solapa
                if (inicio >= ultimoFin) {

                    conservados++;
                    ultimoFin = fin;
                }
            }

            return intervals.length - conservados;
        }
    }
