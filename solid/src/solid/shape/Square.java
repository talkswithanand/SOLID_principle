package solid.shape;

public class Square implements Shape{
	private int length;
	
	public Square(int length){
		this.length = length;
	}
	
	public int getLength() {
		return this.length;
	}

	@Override
	public double area() {
		return Math.pow(getLength(), 2);
	}
}
