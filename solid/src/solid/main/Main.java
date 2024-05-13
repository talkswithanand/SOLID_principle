package solid.main;

import java.util.Arrays;
import java.util.List;

import solid.shape.Circle;
import solid.shape.Cube;
import solid.shape.Rectangle;
import solid.shape.Shape;
import solid.shape.Square;
import solid.utility.AreaCalculator;
import solid.utility.AreaCalculatorV2;
import solid.utility.IAreaCalculator;
import solid.utility.ShapesPrinter;

public class Main {
	public static void main(String[] args) {
		
		IAreaCalculator areaCalculator = new AreaCalculator();
		
//		IAreaCalculator areaCalculatorV2 = new AreaCalculatorV2();
		
		ShapesPrinter shapesPrinter = new ShapesPrinter(areaCalculator);
		Circle circle = new Circle(10);
		Square square = new Square(10);
		Cube cube = new Cube(10);
		Rectangle rectangle = new Rectangle(10, 20);
		
		List<Shape> shapes = Arrays.asList(circle, square, cube, rectangle);
		
		System.out.println(shapesPrinter.csv(shapes));
		System.out.println(shapesPrinter.json(shapes));
	}
}
