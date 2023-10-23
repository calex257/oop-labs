package lab3.problema2;

public class Produs {
	private String nume;
	private double pret;
	private int cantitate;

	public Produs() {
		nume = "";
		pret = 0;
		cantitate = 0;
	}

	public Produs(String numeProd, double pretProd, int cantitateProd) {
		nume = numeProd;
		pret = pretProd;
		cantitate = cantitateProd;
	}

	public String toString() {
		return "Produs " + nume + " " + pret + " " + cantitate;
	}

	public double getTotalProdus() {
		return pret * cantitate;
	}
}
