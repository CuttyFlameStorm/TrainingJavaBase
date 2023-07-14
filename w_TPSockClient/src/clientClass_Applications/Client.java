package clientClass_Applications;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws IOException, Exception {
		
		try {
		Socket s = new Socket("localhost",234);
		InputStream is = s.getInputStream();
		OutputStream os = s.getOutputStream();
		
		Scanner clavier = new Scanner(System.in);
		System.out.print("Donner un nombre");
		int nb = clavier.nextInt();
		os.write(nb); int rep = is.read();  //envoi vers le server.
		System.out.println("Rep = "+rep);
		
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
