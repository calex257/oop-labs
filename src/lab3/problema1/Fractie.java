package lab3.problema1;

import java.util.Objects;

public class Fractie {
    int numitor;
    int numarator;

    public Fractie(){
        this(1,1);
    }
    public Fractie(int numitor, int numarator) {
        this.numitor = numitor;
        this.numarator = numarator;
    }
    public void suma(Fractie f) {
        int toAdd = this.numitor * f.numarator;
        this.numitor *= f.numitor;
        this.numarator *= f.numitor;
        this.numarator += toAdd;
    }
    public Fractie suma1(Fractie f) {
        int toAdd = this.numarator * f.numitor;
        int numitor = this.numitor * f.numitor;
        int numarator = this.numitor * f.numarator;
        numarator += toAdd;
        return new Fractie(numitor, numarator);
    }
    public int getNumitor() {
        return numitor;
    }

    public void setNumitor(int numitor) {
        this.numitor = numitor;
    }

    public int getNumarator() {
        return numarator;
    }

    public void setNumarator(int numarator) {
        this.numarator = numarator;
    }

    @Override
    public String toString() {
        return numarator + "/" +numitor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fractie fractie = (Fractie) o;
        return numitor == fractie.numitor && numarator == fractie.numarator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numitor, numarator);
    }
}
