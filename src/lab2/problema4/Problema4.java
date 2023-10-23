package lab2.problema4;

import java.util.Vector;

public class Problema4 {

    public Vector reunion(Vector v1, Vector v2) {
        if (v1 == null || v2 == null) {
            return null;
        }
        Vector v3 = new Vector(v1);
        for (Object o : v2) {
            if (!v3.contains(o)) {
                v3.add(o);
            }
        }
        return v3;
    }

    public Vector intersection(Vector v1, Vector v2) {
        if (v1 == null || v2 == null) {
            return null;
        }
        Vector v3 = new Vector();
        for (Object o : v1) {
            if (v2.contains(o)) {
                v3.add(o);
            }
        }
        return v3;
    }

    public Vector difference(Vector v1, Vector v2) {
        if (v1 == null || v2 == null) {
            return null;
        }
        Vector v3 = new Vector();
        for (Object o : v1) {
            if (!v2.contains(o)) {
                v3.add(o);
            }
        }
        return v3;
    }

    public static void main(String[] args) {
        Vector v1 = new Vector();
        Vector v2 = new Vector();
        for (int i = 5; i < 15; i++) {
            v1.add(i);
            v2.add(i-5);
        }
        Problema4 p4 = new Problema4();
        System.out.println(p4.reunion(v1, v2));
        System.out.println(p4.intersection(v1, v2));
        System.out.println(p4.difference(v1, v2));
        System.out.println(p4.difference(v2, v1));
    }
}
