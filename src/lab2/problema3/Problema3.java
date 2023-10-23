package lab2.problema3;

import java.util.Random;
import java.util.Vector;

public class Problema3 {
    private static final int MAX_VALUE = 2;
    private static final int MAX_COUNT = 10;
    public int removeFromVector(Vector v, int x) {
        int count = 0;
        // remove returneaza true daca elementul care trebuia
        // sters se afla in vector -> daca operatia a avut succes
        // pentru a face conversia din int in Integer folositi valueOf
        // merge si pentru celelalte primitive
        while(v.remove(Integer.valueOf(x))) {
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Random generator= new Random();
        Vector v = new Vector();
        // fac vectorul doar cu 1 si 0 ca sa se observe
        // mai usor ca se sterg chestii din el
        for (int i = 0; i < MAX_COUNT; i++) {
            v.add(generator.nextInt(MAX_VALUE));
        }
        System.out.println(v);
        System.out.println(v.size());
        Problema3 p3 = new Problema3();
        p3.removeFromVector(v, (Integer)v.get(0));
        System.out.println(v);
        System.out.println(v.size());

    }
}
