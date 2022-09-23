package workShop3;

public class Circle implements Shape {
	
	
	private double radius;//circle radius
	
	private final double PI= Math.PI; // PI value

	//Constructor accepts a double for the radius, throws exception if data is not valid
	public Circle(double radius) throws CircleException {
		setRadius(radius);
	}

	//set radius
	public void setRadius(double r) throws CircleException {
		if(r > 0) {
			this.radius = r;
		}else {
			throw new CircleException("Invalid radius!");
		}
	}

	
	public double getRadius() {
		return radius;
	}
	
	//return perimeter
	@Override
	public double getPerimeter() {
		return 2 * PI * getRadius();
	}


	@Override
	public String toString() {
		return String.format("%s {r=%s} ",this.getClass().getSimpleName(), this.getRadius());
	}
}
