package solid.shape;

//Violating LSP
public class NoShape implements Shape {

	@Override
	public double area() {
		throw new IllegalArgumentException("Cannot calculate area");
	}
	
}
