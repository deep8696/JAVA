package workShop11;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CarServer {
	
	public CarServer() {
		try {
			
			CarInterface c = new CarImplementation();
			
			Registry registry = LocateRegistry.createRegistry(8080);
			registry.rebind("CalculatePlate", c);
			
			System.out.println("***** Car Registration Server *****");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
	}
	
	public static void main(String[] args) {
		new CarServer();
		System.out.println("*** Welcome to Car Registration *** \n ** Please Provide Car details to generate number plate\n");
	}
}