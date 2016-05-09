import java.rmi.RemoteException;

public class HelloServiceImpl implements RemoteHelloService {

	@Override
	public String sayHello(String name) throws RemoteException {
		return "Hello " + name;
	}

}
