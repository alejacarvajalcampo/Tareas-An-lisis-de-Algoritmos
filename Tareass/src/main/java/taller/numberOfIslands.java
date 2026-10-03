package taller;

public class numberOfIslands {

        public int numIslands(char[][] grid) {

            int filas = grid.length;
            int columnas = grid[0].length;

            int cantidadIslas = 0;

            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {

                    // Encontramos una nueva isla
                    if (grid[i][j] == '1') {

                        cantidadIslas++;

                        // Recorremos toda la isla
                        dfs(grid, i, j);
                    }
                }
            }

            return cantidadIslas;
        }

        private void dfs(char[][] grid, int fila, int columna) {

            // Validamos límites
            if (fila < 0 || fila >= grid.length ||
                    columna < 0 || columna >= grid[0].length) {
                return;
            }

            // Si es agua o ya fue visitada
            if (grid[fila][columna] != '1') {
                return;
            }

            // Marcamos como visitada
            grid[fila][columna] = '0';

            // Arriba
            dfs(grid, fila - 1, columna);

            // Abajo
            dfs(grid, fila + 1, columna);

            // Izquierda
            dfs(grid, fila, columna - 1);

            // Derecha
            dfs(grid, fila, columna + 1);
        }
    }