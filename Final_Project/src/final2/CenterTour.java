package final2;

public class CenterTour {

	public static void main(String[] args) {
		Tour domesticTour = new DomesticTour("Đại hải trình", "Chuyến di biển dài của các hải tặc phiêu lưu", 10,
				10000);
		Tour overseasTour = new OverseasTour("Tân Thế Giới", "Chuyến di biển dài của các hải tặc lớn", 20, 30000,
				"Thái Bình Dương", 20000);
		TourDecorator fiveStartTour = new FiveStartTour(domesticTour);

		System.out.println(domesticTour.getDescription() + " - Price: " + domesticTour.price());
		System.out.println(overseasTour.getDescription() + " - Price: " + overseasTour.price());
		System.out.println(fiveStartTour.getDescription() + " - Price: " + fiveStartTour.price());
	}

}
