package lab2;

import java.util.Date;

public abstract class Reading {
	private Date date;
	private int index;

	public Reading(Date date, int index) {
		super();
		this.date = date;
		this.index = index;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	@Override
	public String toString() {
		return "Reading date=" + date + ", index=" + index;
	}

}
