package workShop11;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CarImplementation extends UnicastRemoteObject implements CarInterface {
	
	public CarImplementation() throws RemoteException {
		super();
	}	
//the server invokes hashCode() for the Car object.
	@Override
	public String registerCar(Car car) throws RemoteException {
		return car.hashCode()+ "";
	}
}