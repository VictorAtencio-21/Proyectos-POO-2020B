package conexion;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

//VICTOR ATENCIO
//CI: 28252900
//PROYECTO #4 Zoo con BD & Sockets

public class ServidorAppZoo extends Thread {
	
	private Socket SockServidor;
	private ServerSocket ServidorZoo;
	private String consulta,mostrar,mostrarid;
	BDConexion bd = BDConexion.getInstances();
	
	public void HiloServer() {
	Thread hiloServidor = new Thread(this);
	hiloServidor.start();
	}
	
	@Override
	public void run() {
		
		//CREACION DEL SERVERSOCKET DEL ZOO
		try {
			ServerSocket ServidorZoo = new ServerSocket(5000);
			
			while(true) {
			try {
			//Creacion del ServerSocket
			Socket SockServidor = ServidorZoo.accept();
			
			//Flujos de entrada y salida
			DataInputStream flujo_entradaServ = new DataInputStream(SockServidor.getInputStream());
			String consulta = flujo_entradaServ.readUTF();
			System.out.println(consulta);
			DataOutputStream entrada_cliente = new DataOutputStream(SockServidor.getOutputStream());
			
			//Comandos respectivos
			if(consulta.equalsIgnoreCase("-Mostrar")) {
				mostrar = bd.dbStatement("Select*from BDZooPooAPP");
			}
			
			if(consulta.equalsIgnoreCase("-ID")) {
				mostrarid +=consulta+bd.dbStatement("Select*from BDZooPooAPP where id = ?");
			}
			
			//Envios de datos y cierre de flujos
			entrada_cliente.writeUTF(mostrar);
			entrada_cliente.writeUTF(mostrarid);
			flujo_entradaServ.close();
			entrada_cliente.close();
			} catch (IOException e) {
				e.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				ServidorZoo.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				SockServidor.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	
	}
}