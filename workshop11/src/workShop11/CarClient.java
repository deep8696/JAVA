package workShop11;

import java.rmi.Naming;

public class CarClient {
	
	public static void main(String[] args) {
		try {
			Car car = new Car("Audi R8", "Matte Black", "14 MPG");
			
			System.out.println("Send to the server for Car registration\n");	
	
			System.out.println(car.toString());
			
			CarInterface c = (CarInterface) Naming.lookup("rmi://localhost:8080/CalculatePlate");
			car.setPlate(c.registerCar(car));
			System.out.println("\nThe Car has been registered on server\n");						
			System.out.println(car.toString());			
		}
		catch(Throwable e){
			System.out.println("\nPlease Activate Server to Register Car\n");
			System.out.println(e);
		}
	}
}