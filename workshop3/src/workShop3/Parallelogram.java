package workShop3;

public class Parallelogram implements Shape{
	
	private double height;
	private double width;	

	//Constructor accepts values throws exception if data is not valid
	public Parallelogram(double width, double height) throws ParallelogramException{
		setWidth(width);
		setHeight(height);
	}	
	
	//set height
		public void setHeight(double h) throws ParallelogramException {
			if(h > 0) {
				this.height =  h;
			}else {
				throw new ParallelogramException("Invalid side!");
			}
		}

	// set width
	public void setWidth(double w) throws ParallelogramException {
		if(w> 0) {
			this.width = w;
		}else {
			throw new ParallelogramException("Invalid side!");
		}
	}
	
	
	//return height
		public double getHeight() {
			return height;
		}
	
	// return width
	public double getWidth() {
		return width;
	}
		
//Getting the perimeter of the parallelogram
	@Override
	public double getPerimeter() {
		return  2 * (getWidth() + getHeight());
	}
//Returning a String representing the parallelogram
	@Override
	public String toString() {
		return String.format( "%s {w=%s, h=%s} ", this.getClass().getSimpleName(), this.getWidth(), this.getHeight());
	}
}
