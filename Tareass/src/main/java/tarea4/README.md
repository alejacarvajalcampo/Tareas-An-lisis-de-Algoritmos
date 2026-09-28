# Tarea 4 · Programación dinámica en LeetCode

**Curso:** Análisis de Algoritmos · ITM · 2026-2  
**Tema:** Programación dinámica (DP)  
**Lenguaje:** Java

---

## Introducción

En esta actividad se aplicó el enfoque de **Programación Dinámica (DP)** para resolver dos problemas de LeetCode.

Los problemas seleccionados son:

1. **322. Coin Change**
2. **416. Partition Equal Subset Sum**

En cada ejercicio se identifica el estado de la solución, los casos base, la recurrencia y la complejidad temporal y espacial.

También se analiza la diferencia entre problemas donde los elementos pueden reutilizarse y aquellos donde cada elemento puede utilizarse como máximo una vez.

---

# 1. 322. Coin Change

**Enlace al problema:**  
https://leetcode.com/problems/coin-change/

### Descripción

Dado un conjunto de monedas `coins` y un valor `amount`, se debe encontrar el número mínimo de monedas necesarias para obtener exactamente ese monto.

Cada denominación de moneda puede utilizarse **infinitas veces**.

Si no es posible obtener el monto, se devuelve `-1`.

---

## Estado

Se utiliza un arreglo:

```text
dp[x]