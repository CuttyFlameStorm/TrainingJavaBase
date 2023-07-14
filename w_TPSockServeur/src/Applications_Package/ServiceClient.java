package Applications_Package;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ServiceClient extends Thread {

	private int numero;
	private Socket client;
	
	public ServiceClient(Socket client, int numero) {
		this.numero = numero;
		this.client = client;
	}
	
	@Override
	public void run() {
		try {
			InputStream is = client.getInputStream();
			//lire une chaine de caractere
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			//pour envoyer des chaines de caractère
			OutputStream os = client.getOutputStream();
			PrintWriter pw = new PrintWriter(os,true);
			System.out.println("Connexion du client Num " +numero);
			pw.println("vous êtes le client Num : " +numero);
			while(true) {
				String req = br.readLine();
				pw.println(req.length());
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
}
