package workShop11;

import java.io.*;

public class Car implements Serializable {

	private String model;
	private String color;
	private String mileage;
	private String registration;
	
	public Car() throws java.rmi.RemoteException {		
		    super();
	}	
	
	public Car( String brandName, String colorName, String mpg )throws java.rmi.RemoteException {
		model = brandName;
		color = colorName;
		mileage = mpg;
		registration = "unregistered";
	}
	
	
	public void setPlate(String plate) {
		registration = plate;
	}

	public String toString() {
		return "Model: " + model + 
				" \nColor: " + color + 
				" \nMileage: " +  mileage + 
				" \nPlate: " + registration;
	}

	public void getRegistered(String plate) {
		registration = plate;
	}
}