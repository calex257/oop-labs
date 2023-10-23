package lab3.problema7;

public class Schedule {
	public ClockTime departure;
	public ClockTime arrival;
	
	public Schedule() {
		arrival = new ClockTime();
		departure = new ClockTime();
	}
	
	public Schedule(ClockTime dep, ClockTime arr) {
		departure = dep;
		arrival = arr;
	}
	
}
