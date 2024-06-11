package final2;

public class FiveStartTour extends TourDecorator {

	public FiveStartTour(Tour tour) {
		super(tour);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return tour.getDescription() + ", Five Start Tour";
	}

	@Override
	protected double price() {
		// TODO Auto-generated method stub
		return tour.basePrice * 1.5;
	}

}
