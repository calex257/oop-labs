package lab3.problema7;

public class Train {
	public Route r;
	public Schedule s;
	public boolean local;

	public Train() {
		r = new Route();
		s = new Schedule();
		local = true;
	}

	public Train(Route rt, Schedule sc, boolean lc) {
		r = rt;
		s = sc;
		local = lc;
	}
	
	public Train(String from, String to, int depH, int depM, int arrH, int arrM, boolean lc) {
		r = new Route(from, to);
		s = new Schedule(new ClockTime(depH, depM), new ClockTime(arrH, arrM));
		local = lc;
	}
	
	public Train(String from, String to, ClockTime dep, ClockTime arr, boolean lc) {
		r = new Route(from, to);
		s = new Schedule(dep, arr);
		local = lc;
	}

	public String toString() {
		return local + " " + r.origin + " (" + s.departure.getHour() + ":"
				+ ((s.departure.getMinute() < 10) ? ("0" + s.departure.getMinute()) : s.departure.getMinute())
				+ ") -> " + r.destination + " (" + s.arrival.getHour()
				+ ":" +((s.arrival.getMinute() < 10) ? ("0" + s.arrival.getMinute()) : s.arrival.getMinute()) + ")";
	}

	public int getPrice() {
		int duration = s.departure.getDuration(s.arrival);
		return local ? duration : duration * 2;
	}
}
