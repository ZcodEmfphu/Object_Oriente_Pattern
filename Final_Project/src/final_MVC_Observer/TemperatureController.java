package final_MVC_Observer;

import java.util.ArrayList;
import java.util.List;

public class TemperatureController implements ControllerInterface {

	private TemperatureModel model;
	private List<Observer> observers;
	private double c, f;

	public TemperatureController() {
		super();
//		this.model = model;

		this.observers = new ArrayList<Observer>();

	}

	@Override
	public void register(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void unregister(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
	}

	@Override
	public void noti() {
		// TODO Auto-generated method stub
		for (Observer items : observers) {
			if (items.getClass() == Celsius.class) {
				items.update(c);
			} else {
				items.update(f);
			}
		}
	}

	public void setTemperature(Temperature temperature) {
		// TODO Auto-generated method stub
		double index = temperature.getIndexTemp();
		if (temperature.getClass() == Celsius.class) {
			c = index;
			f = ((c * 1.8) + 32);
		} else {
			f = index;
			c = (f - 32) * 1.8;
		}
		noti();
	}

}
