package lab2;

import java.util.Date;

public class OneReading extends Reading {

	public OneReading(Date date, int index) {
		super(date, index);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "\nOneReading [Date:" + getDate() + ",Index:" + getIndex();
	}

}
