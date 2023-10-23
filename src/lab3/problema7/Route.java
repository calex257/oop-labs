package lab3.problema7;

public class Route {
	public String origin;
	public String destination;
	
	public Route() {
		origin = destination = "";
	}
	
	public Route(String org, String dest) {
		origin = org;
		destination = dest;
	}
	
	public boolean isReturnTrip() {
		return origin.equals(destination);
	}
}
