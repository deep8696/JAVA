package workShop4;

public class Square extends Rectangle{
//constructor for Square
	public Square(double side) throws ParallelogramException, SquareException{
		super(side,side);
	}
//width
	@Override
	public void setWidth(double side) throws ParallelogramException {
		super.setWidth(side);
	}
	// height
	@Override
	public void setHeight(double side) throws ParallelogramException{
		super.setHeight(side);
	} 
	
	//Returning a String representing the square
	@Override
	public String toString() {
		return String.format( "%s {s=%s} ", this.getClass().getSimpleName(), this.getWidth());
	}
}