package lab3.problema2;

public class Prob2 {
	public static void main(String[] args) {
		Magazin mg = new Magazin("Laufkand", new Produs[]
				{new Produs("masa", 5.23, 100),
				new Produs("casa", 4.20, 12), 
				new Produs("chestii", 8.88, 13)});
		System.out.println(mg);
		System.out.println(mg.getTotalMagazin());
	}
}
