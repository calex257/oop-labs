package lab1.problema7;

public class Problema7 {
    public boolean isPrime(int a) {
        if (a < 1)
            return false;
        for (int i = 2; i * i <= a; i ++) {
            if (a%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 100;
        Problema7 obj = new Problema7();
        for (int i = 1; i < n; i++) {
            int value = 2 * i;
            for (int j = 1; j <= value / 2; j++) {
                // continue si break functioneaza la fel ca in C
                // exemplul asta e pe logica negata
                if (!(obj.isPrime(j) && obj.isPrime(value - j))){
                    continue;
                }
                System.out.println(value + " = " + j + " + " + (value - j));
                break;
            }
        }
    }
}
