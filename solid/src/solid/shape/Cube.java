package solid.shape;

public class Cube implements Shape, ThreeDimensionalShape {

	private int length;

	public Cube(int length) {
		this.length = length;
	}

	@Override
	public double area() {
		return 6 * Math.pow(length, 2);
	}

	@Override
	public double volume() {
		return Math.pow(length, 3);
	}

}
