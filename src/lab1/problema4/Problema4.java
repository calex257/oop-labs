package lab1.problema4;

public class Problema4 {
    // ca sa dati argumente in linia de comanda fie:
    // compilati din consola fisierul si il rulati conform
    // instructiunilor din lab
    // fie in IntelliJ Run > Edit Configurations... > Add > Application >
    // ii dati un nume si scrieti la Program arguments argumentele
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        // e elegant si rapid sa folositi un for-each ca mai jos
        // ca sa puteti folosi sintaxa asta, ce e dupa ":" trebuie
        // fie sa fie un array(tip[] variabla, c-style-ish) sau
        // sa implementeze interfata Iterable<E>, more on that in later labs
        // sintaxa e ceva gen:
        // for (TipElement element : colectieDeElemente) { ... }
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
