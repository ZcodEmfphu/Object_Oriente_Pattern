package classroom.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeGraphic extends Graphic {

	private List<Graphic> graphicComponent = new ArrayList<Graphic>();

	public void add(Graphic g) {
		graphicComponent.add(g);
	}

	public void remove(Graphic g) {
		graphicComponent.remove(g);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Composite Graphic");
		for (Graphic items : graphicComponent) {
			items.display();
		}
		System.out.println();
	}

}
