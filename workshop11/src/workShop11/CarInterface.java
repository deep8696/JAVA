package workShop11;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CarInterface extends Remote {
	
	public String registerCar(Car car) throws RemoteException;
}