package workShop4;

public class Triangle implements Shape {
	
	private double side1;
	private double side2;
	private double side3;

	//Constructor that accept the sides throw exception if data is not valid
	public Triangle(double s1, double s2, double s3) throws TriangleException {
	
		if((s1+s2)>s3 && (s1+s3)>s2 && (s2+s3)>s1) {
			this.side1 = s1;
			this.side2 = s2;
			this.side3 = s3;
		}else {
			throw new TriangleException("Invalid side(s)!");	
	}
}

	// side 1
	public void setSide1(double side1)throws TriangleException {
		if(side1 > 0) {
		this.side1 = side1;
		}
		else {
			throw new TriangleException("Invalid side(s)!");
		}
	}

	//side 2
	public void setSide2(double side2) throws TriangleException {
		if(side2 > 0 ) {
		this.side2 = side2;
	}
		else {
			throw new TriangleException("Invalid side(s)!");
		}	
	}
	
	//side 3
	public void setSide3(double side3) throws TriangleException {
		if(side3 > 0) {
		this.side3 = side3;
	}
		else {
			throw new TriangleException("Invalid side(s)!");
		}	
	}
	
	
	
	public double getSide1() {
		return side1;
	}
	
	public double getSide2() {
		return side2;
	}
	
	public double getSide3() {
		return side3;
	}
//return perimeter
	@Override
	public double getPerimeter() {
		return getSide1() + getSide2() + getSide3();
	}

	@Override
	public String toString() {
		return String.format("%s {s1=%s, s2=%s, s3=%s}",this.getClass().getSimpleName(), this.getSide1(),this.getSide2(),this.getSide3());
	}
}