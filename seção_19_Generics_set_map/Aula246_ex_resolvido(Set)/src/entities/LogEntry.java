package entities;

import java.util.Date;
import java.util.Objects;

public class LogEntry {
	
	private String usermane;
	private Date moment;
	
	public LogEntry(String usermane, Date moment) {
		this.usermane = usermane;
		this.moment = moment;
	}

	public String getUsermane() {
		return usermane;
	}

	public void setUsermane(String usermane) {
		this.usermane = usermane;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	@Override
	public int hashCode() {
		return Objects.hash(usermane);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogEntry other = (LogEntry) obj;
		return Objects.equals(usermane, other.usermane);
	}
	
}
