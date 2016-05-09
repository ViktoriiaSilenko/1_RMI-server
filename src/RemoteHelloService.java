import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteHelloService extends Remote {
	String sayHello(String name) throws RemoteException;
 
}
