package solid.utility;

import java.util.List;

import solid.shape.Shape;

//AreaCalculator should only function calculating sum
//SRP - to format sum data
//DIP - IAreaCalculator interface 
public class ShapesPrinter {
	
	//Dependency Injection - can use different 
	//implementation of IAreaCalculator
	
	private IAreaCalculator areaCalculator;
	
	public ShapesPrinter(IAreaCalculator areaCalculator) {
		this.areaCalculator=areaCalculator;
	}
	
	public String json(List<Shape> shapes) {
		return "{Shape sum: %s}".formatted(areaCalculator.sum(shapes));
	}
	
	public String csv(List<Shape> shapes) {
		return "Shape sum, %s".formatted(areaCalculator.sum(shapes));
	}
}
