package lab3.problema7;

public class ClockTime {
	private int hour;
	private int minute;

	public ClockTime() {
		hour = 0;
		minute = 0;
	}
	
	public ClockTime(int h, int m) {
		if (h > 23 || h < 0) {
			throw new IllegalArgumentException("invalid hour");
		}
		if (m > 59 || m < 0) {
			throw new IllegalArgumentException("invalid minute");
		}
		hour = h;
		minute = m;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int h) {
		if (h > 23 || h < 0) {
			throw new IllegalArgumentException();
		}
		hour = h;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int m) {
		if (m > 59 || m < 0) {
			throw new IllegalArgumentException();
		}
		minute = m;
	}
	
	public int getDuration(ClockTime ct) {
		if(ct.getHour() == hour) {
			return Math.abs(ct.getMinute()-minute);
		} else {
			if(ct.getHour() < hour && ct.getMinute() > minute) {
				return (hour -ct.getHour()-1)*60 + 60 - ct.getMinute() + minute;
			}
			else {
				return (hour-ct.getHour())*60 + minute - ct.getMinute();
			}
		}
	}
}
