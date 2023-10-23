package lab3.problema5;

public class Punct {
	private int x, y;

	public Punct() {
		x = 0;
		y = 0;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	double distance(int xp, int yp) {
		return Math.sqrt((x - xp) * (x - xp) + (y - yp) * (y - yp));
	}

	double distance(Punct p1) {
		double xp = p1.getX(), yp = p1.getY();
		return Math.sqrt((x - xp) * (x - xp) + (y - yp) * (y - yp));
	}
}
