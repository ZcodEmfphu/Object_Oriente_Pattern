package final_MVC_Observer;

public class FahrentheitController implements Observer, DisplayController {

	private TemperatureController controller;
	private TemperatureView view;
	private double index;

	public FahrentheitController(TemperatureController controller, TemperatureView view) {
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
		this.view.getTxtTop().setText(index + "");
		this.view.setIndexF((int) index);
		this.view.getBar().setValue((int) index);
	}
}
