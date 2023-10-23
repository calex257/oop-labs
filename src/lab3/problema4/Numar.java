package lab3.problema4;

public class Numar {
	public int nr;
	
	public Numar() {
		nr=0;
	}
	
	public Numar(int n) {
		nr = n;
	}

	public int suma(int a) {
		return a + nr;
	}

	public int suma(int a, int b) {
		return a + b + nr;
	}

	public int suma(int a, int b, int c) {
		return a + b + c + nr;
	}

	public int suma(int a, int b, int c, int d) {
		return a + b + c + d + nr;
	}
}
