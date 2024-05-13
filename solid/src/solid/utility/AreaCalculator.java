package solid.utility;

import java.util.List;

import solid.shape.Shape;

public class AreaCalculator implements IAreaCalculator {

	public int sum(List<Shape> shapes) {
		int sum = 0;
		for (int i = 0; i < shapes.size(); i++) {
			sum += shapes.get(i).area();
		}
		return sum;
	}

}
