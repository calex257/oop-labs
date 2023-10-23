package lab2.problema2;

import lab2.problema1.Problema1;

import java.util.StringTokenizer;

public class Problema2 {
    public int metoda1(String s1, String s2) {
        // am pus mai multi delimitatori for good measure
        StringTokenizer tokenizer = new StringTokenizer(s1, "\r\n\t ,.:-?");
        int count = 0;

        // documentatia zice ca face acelasi lucru ca si
        // hasMoreElements deci nu conteaza pe care il folositi
        while(tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            if (token.equals(s2)) {
                count++;
            }
        }
        return count;
    }

    public int metoda2(String s1, String s2) {

        String[] tokens = s1.split(" ");
        int count = 0;

        for (String token: tokens) {
            if (token.equals(s2)){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        String s11 = "sir1 si sir2 sunt 2 siruri";
        String s12 = "sir";
        String s13 = "sir2";
        String s21 = "Marius, de ce nu l-ai ajutat pe George? Era de datoria ta sa vezi ce poti face.";
        String s22 = "ce";
        String s23 = "l";
        Problema2 p2 = new Problema2();

        System.out.println("Cu tokenizer");
        System.out.println(p2.metoda1(s11, s12));
        System.out.println(p2.metoda1(s11, s13));
        System.out.println(p2.metoda1(s21, s22));
        System.out.println(p2.metoda1(s21, s23));
        System.out.println("Fara tokenizer");
        System.out.println(p2.metoda2(s11, s12));
        System.out.println(p2.metoda2(s11, s13));
        System.out.println(p2.metoda2(s21, s22));
        System.out.println(p2.metoda2(s21, s23));
    }
}
