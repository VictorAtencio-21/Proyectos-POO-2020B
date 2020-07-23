package conexion;

//VICTOR ATENCIO
//CI: 28252900
//PROYECTO #4 Zoo con BD & Sockets

public class MainDB {

	public static void main(String[] args) {
		MenuPrincipal M = new MenuPrincipal();
		M.getZoopooApp().setVisible(true);
		
		ServidorAppZoo Server = new ServidorAppZoo();
		Server.start();
	}

}
