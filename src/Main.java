import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Main {
	
	public static final String BINDING_NAME = "HelloServiceImpl";
	public static void main (String [] args) throws Exception{
		
		final Registry registry = LocateRegistry.createRegistry(2099); //  instance on the local host that accepts requests on the specified port
		
		final RemoteHelloService service = new HelloServiceImpl();
		
		Remote stub = UnicastRemoteObject.exportObject(service, 0); 
		// Exports the remote object to make it available to receive incoming calls, using the particular supplied port
		// stub is object for remote call of RemoteHelloService methods
		
		registry.bind(BINDING_NAME, stub);//Binds a remote reference to the specified name in this registry.
		
		while (true) {
			Thread.sleep(Integer.MAX_VALUE);
		}
	}
}
