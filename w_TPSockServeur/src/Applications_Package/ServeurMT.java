package Applications_Package;

import java.net.ServerSocket;
import java.net.Socket;

public class ServeurMT extends Thread{

	private int nbClients;
	
	@Override
	public void run() {
		try {
			ServerSocket ss = new ServerSocket(456);
			while(true) {
				Socket s = ss.accept();
				++nbClients;
				new ServiceClient(s,nbClients).start();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new ServeurMT().start();
	}
	
}
