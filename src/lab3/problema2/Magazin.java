package lab3.problema2;


public class Magazin {
	private String nume;
	private Produs[] produse;

	public Magazin() {
		nume = "";
		produse = new Produs[3];
		for (int i = 0; i < 3; i++) {
			produse[i] = new Produs();
		}
	}

	public Magazin(String nm, Produs p1, Produs p2, Produs p3) {
		nume = nm;
		produse = new Produs[3];
		produse[0] = p1;
		produse[1] = p2;
		produse[2] = p3;
	}

	public Magazin(String nm, Produs[] prods) {
		nume = nm;
		produse = prods;
	}
	
	public String toString() {
		String str = produse[0].toString()+"\n";
		str += produse[1].toString() + "\n" + produse[2].toString();
		return nume + "\n" + str;
	}
	public double getTotalMagazin() {
		double total = 0;
		for(int i=0;i<3;i++) {
			total += produse[i].getTotalProdus();
		}
		return total;
	}
}
