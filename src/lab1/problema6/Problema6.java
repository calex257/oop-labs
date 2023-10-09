package lab1.problema6;

public class Problema6 {
    public boolean isPrime(int a) {
        if (a < 2)
            return false;
        for (int i = 2; i * i <= a; i ++) {
            if (a%i == 0) {
                return false;
            }
        }
        return true;
    }

    public void displayPrimes(int limit) {
        for (int i = 0; i < limit; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Problema6 obj = new Problema6();
        obj.displayPrimes(20);
    }
}
