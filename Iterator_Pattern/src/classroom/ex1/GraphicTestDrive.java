package classroom.ex1;

public class GraphicTestDrive {

	public static void main(String[] args) {
		Circle c = new Circle();
		Square s = new Square();

		CompositeGraphic cg1 = new CompositeGraphic();
		CompositeGraphic cg2 = new CompositeGraphic();

		cg1.add(c);
		cg1.add(s);

		cg1.display();

		cg2.add(c);
		cg2.add(s);
		cg2.add(cg1);

		cg2.display();
		
		cg2.remove(s);
		
		cg2.display();
	}
}
