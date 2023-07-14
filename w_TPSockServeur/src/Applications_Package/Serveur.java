package Applications_Package;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


// nous créons le projet pour le server !
public class Serveur {

	public static void main(String[] args) throws IOException {
		
		try {
			ServerSocket ss = new ServerSocket(234);
			System.out.println("J'attend une connexion");
			Socket s = ss.accept();
			InputStream is = s.getInputStream();
			OutputStream os = s.getOutputStream();
			System.out.println("J'attend un nombre");
			int nb = is.read();
			int rep = nb*3;
			os.write(rep);
		// s.close();  -> cela sert à deconnecter le client.
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
