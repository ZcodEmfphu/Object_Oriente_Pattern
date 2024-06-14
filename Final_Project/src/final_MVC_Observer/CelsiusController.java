package final_MVC_Observer;

public class CelsiusController implements Observer, DisplayController {

	private TemperatureController controller;
	private TemperatureView view;
	private double index;

	public CelsiusController(TemperatureController controller, TemperatureView view) {
		super();
		this.controller = controller;
		this.view = view;
		this.controller.register(this);
	}

	@Override
	public void update(double temp) {
		// TODO Auto-generated method stub
		this.index = temp;
		display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		this.view.getTxtBottom().setText(index + "");
		this.view.setIndexC((int) index);
	}

}
