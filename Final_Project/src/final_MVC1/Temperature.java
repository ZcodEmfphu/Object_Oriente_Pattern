package final_MVC1;

public abstract class Temperature {
	private double indexTemp;

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
