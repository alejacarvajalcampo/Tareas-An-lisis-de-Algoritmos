package tarea1;

public class lemonadeChange {
        public boolean lemonadeChange(int[] bills) {

            int five = 0;
            int ten = 0;

            for (int bill : bills) {

                if (bill == 5) {
                    five++;
                }

                else if (bill == 10) {

                    if (five == 0) {
                        return false;
                    }

                    five--;
                    ten++;
                }

                else if (bill == 20) {

                    // Greedy: preferimos 10 + 5
                    if (ten > 0 && five > 0) {
                        ten--;
                        five--;
                    }

                    // Si no podemos, usamos 5 + 5 + 5
                    else if (five >= 3) {
                        five -= 3;
                    }

                    // No podemos devolver $15
                    else {
                        return false;
                    }
                }
            }

            return true;
        }
}
