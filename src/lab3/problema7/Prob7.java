package lab3.problema7;

public class Prob7 {
	public static void main(String[] args) {
		Train tr = new Train();
		tr.r.origin = "Bucuresti Nord";
		tr.r.destination = "Constanta";
		tr.local = true;
		tr.s.departure.setHour(9);
		tr.s.departure.setMinute(35);
		tr.s.arrival.setHour(12);
		tr.s.arrival.setMinute(2);
		System.out.println(tr);
		System.out.println(tr + " " + tr.s.departure.getDuration(tr.s.arrival));
		Train tr1 = new Train("Braila", "Bucuresti", 18, 9, 21, 45, true);
		System.out.println(tr1);
		System.out.println(tr1 + " " + tr1.s.departure.getDuration(tr1.s.arrival));
		Train tr2 = new Train("Bucuresti Nord", "Iasi", new ClockTime(5, 45), new ClockTime(12, 49), true);
		System.out.println(tr2);
		System.out.println(tr2 + " " + tr2.s.departure.getDuration(tr2.s.arrival));
		Train tr3 = new Train(new Route("Bucuresti Nord", "Sofia"),
				new Schedule(new ClockTime(23, 45), new ClockTime(17, 0)), false);
		System.out.println(tr3 + " " + tr3.s.departure.getDuration(tr3.s.arrival));
	}
}
