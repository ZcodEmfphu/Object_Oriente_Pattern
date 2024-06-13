package final_MVC_Observer;

public abstract class Temperature {
	protected double indexTemp;

	public Temperature(double indexTemp) {
		super();
		this.indexTemp = indexTemp;
	}

	public double getIndexTemp() {
		return indexTemp;
	}

	public void setIndexTemp(double indexTemp) {
		this.indexTemp = indexTemp;
	}

}
