package lab1.problema5;

public class Problema5 {
    public int pow(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        if (exp == 1) {
            return base;
        }
        int res = pow(base, exp / 2);
        return (exp % 2 == 0 ? 1 : base) * res * res;
        // codul de mai sus e codul de mai jos doar ca folosind operatorul ternar
        // e algoritmul de exponentiere rapida
        // if (exp % 2 == 0) {
        //      return res * res;
        // } else {
        //      return base * res * res;
        // }
    }

    public static void main(String[] args) {
        System.out.println(Math.pow(2, 7));
        System.out.println(Math.pow(2, 12));
        System.out.println(Math.pow(3, 4));
        Problema5 obj = new Problema5();
        System.out.println(obj.pow(2, 7));
        System.out.println(obj.pow(2, 12));
        System.out.println(obj.pow(3, 4));
    }
}
