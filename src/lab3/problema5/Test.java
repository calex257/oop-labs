package lab3.problema5;

public class Test {
	public static void main(String[] args) {
		Punct A = new Punct();
		Punct B = new Punct();
		A.setX(1);
		A.setY(2);
		B.setX(-1);
		B.setY(3);
		System.out.println(A.distance(B));
	}
}
