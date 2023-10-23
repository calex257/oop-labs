package lab2.problema1;

public class Problema1 {
    public int metoda1(String s1, String s2) {
        int count = 0;
        int beginIndex = s1.indexOf(s2, 0);
        while (beginIndex != -1) {
            count++;
            // eu zic ca are mai mult sens cu + 1 decat
            // cu + s2.length() pentru exemple gen s2 = "aa"
            // si s1 = "aaaa", cu + s2.length() ar da 2 in loc de 3
            beginIndex = s1.indexOf(s2, beginIndex + 1);
        }
        return count;
    }
    public int metoda2(String s1, String s2) {
        int count = 0;
        int beginIndex = 0;
        while (beginIndex + s2.length() <= s1.length()) {
            // practic verific fiecare bucata de lungime s2.length() din
            // sirul s1 daca e egala cu s2
            if (s1.substring(beginIndex, beginIndex + s2.length()).equals(s2)) {
                count++;
            }
            beginIndex++;
        }
        return count;
    }
    public static void main(String[] args) {
        Problema1 p1 = new Problema1();
        System.out.println(p1.metoda1("aaaa", "aa"));
        System.out.println(p1.metoda2("aaaa", "aa"));
        String s2 = "si";
        String s1 = "sir1 si cu sir2 fac un sir3";
        System.out.println(p1.metoda1(s1, s2));
        System.out.println(p1.metoda2(s1, s2));
    }
}
