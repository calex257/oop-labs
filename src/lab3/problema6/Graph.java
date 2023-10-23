package lab3.problema6;

public class Graph {
	private int[][] matrix;
	private int n;
	final int Infinit = 9500;
	
	public Graph(int nr) {
		matrix = new int[nr+1][nr+1];
		n = nr;
	}
	
	public int getSize() {
		return n;
	}
	
	public void addArc(int v, int w, int cost) {
		matrix[v][w] = cost;
	}
	
	public boolean isArc(int v, int w) {
		return matrix[v][w]!=0;
	}
	
	public String toString() {
		String str = "";
		for(int i=1;i<=n;i++) {
			str+= i + ": ";
			for(int j=1;j<=n;j++) {
				if(matrix[i][j]!=0) {
					str+= "(la: " + j + ", cost: " + matrix[i][j]+") ";
				}
			}
			str+="\n";
		}
		return str;
	}
	
	public int[][] floydWarshall(){
		int result[][];
		result = new int[n+1][n+1];
		int k, i, j;
		for(i = 1; i <= n; i++) {
			for(j = 1; j <= n; j++) {
				if(i == j) {
					result[i][j] = 0;
				} else if(isArc(i, j)) {
					result[i][j] = matrix[i][j];
				} else {
					result[i][j] = Infinit;
				}
			}
		}
		for(k = 1; k <= n; k++) {
			for(i = 1; i <= n; i++) {
				for(j = 1; j <= n; j++) {
					int dist;
					dist = result[i][k] + result[k][j];
					if(result[i][j] > dist) {
						result[i][j] = dist;
					}
				}
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Graph g = new Graph(4);
		g.addArc(1, 3, 2);
		g.addArc(1, 2, 3);
		g.addArc(2, 4, 6);
		g.addArc(2, 3, 2);
		System.out.println(g);
		System.out.println("Floyd-Warshall");
		int [][] my_matrix = g.floydWarshall();
		System.out.println("distanta minima dintre nodurile 1 si 4 este "+ my_matrix[1][4]); // rezultat - 9
	}
}
