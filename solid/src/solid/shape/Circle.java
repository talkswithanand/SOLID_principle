package solid.shape;

public class Circle implements Shape {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return this.radius;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(getRadius(), 2);
	}
}
