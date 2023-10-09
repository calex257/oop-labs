package lab1.problema8;

import java.util.Arrays;

public class Problema8 {
    public static void main(String[] args) {
        double[] arr = new double[50];
        // random returneaza o valoare intre 0 si 1, * 100 o sa fie intre 0 si 100
        double firstNum = 100 * Math.random();
        // asa sigur da ceva bun la binarySearch
        arr[0] = firstNum;
        for (int i = 1 ; i < 50; i++) {
            arr[i] = 100 * Math.random();
        }
        Arrays.sort(arr);
        for (double nr : arr) {
            System.out.print(nr + " ");
        }
        System.out.println("");
        // e mai mare ca 100 si nu o sa intre niciodata aici
        if (Arrays.binarySearch(arr, 104.8f) >= 0) {
            System.out.println("Nimic nu merge dar");
        }
        if (Arrays.binarySearch(arr, firstNum) >= 0) {
            System.out.println("Viata e buna");
        }
    }
}
