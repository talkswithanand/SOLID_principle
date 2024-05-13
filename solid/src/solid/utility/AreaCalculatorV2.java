package solid.utility;

import java.util.List;

import solid.shape.Shape;

public class AreaCalculatorV2 implements IAreaCalculator{

	@Override
	public int sum(List<Shape> shapes) {
		System.out.println("Can Implement version 2 through"
				+ "only one interface dependency Injection");
		return 0;
	}

}
