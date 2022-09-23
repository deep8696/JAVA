package workShop3;

public class Rectangle extends Parallelogram {
	
	public Rectangle(double height , double width ) throws ParallelogramException {
		super(height, width);
	}

	//Getting the perimeter of the rectangle 
	@Override
	public double getPerimeter() {
		return  (getWidth() + getHeight())*2;
	}
	
	//Returning a String representing the rectangle
	@Override
	public String toString() {
		return String.format( "%s {w=%s, h=%s} ", this.getClass().getSimpleName(), this.getWidth(), this.getHeight());
	}
}