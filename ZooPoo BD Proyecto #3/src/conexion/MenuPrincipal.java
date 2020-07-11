package conexion;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPrincipal extends JFrame{

	public JFrame ZoopooAPP;
	
	public MenuPrincipal() {
		initialize();
	}

	private void initialize() {
		//Creacion de la ventana
		setZoopooApp(new JFrame());
		//Titulo de la ventana
		getZoopooApp().setTitle("ZooPoo APP");
		//Color de la ventana
		getZoopooApp().getContentPane().setBackground(Color.DARK_GRAY);
		//El usuario no puede modificar el tamaño de la ventana
		getZoopooApp().setResizable(false);
		//Color del fondo
		getZoopooApp().setBackground(Color.DARK_GRAY);
		//Tamaño de la ventana
		getZoopooApp().setBounds(100, 100, 450, 350);
		//Cerrar aplicacion al cerrar la ventana
		getZoopooApp().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Desactivar layout por defecto
		getZoopooApp().getContentPane().setLayout(null);
		//Ventana siempre centrada
		getZoopooApp().setLocationRelativeTo(null);
		
		//CREACION DE LOS COMPONENTES
		//ETIQUETAS
		JLabel E1 = new JLabel("Bienvenido a la APP de ZooPoo",SwingConstants.CENTER);
		E1.setBounds(73, 38, 278, 51);
		E1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 12));
		getZoopooApp().getContentPane().add(E1);
		E1.setForeground(Color.white);//Color de la letra
		
		//BOTONES Y SUS ACCIONES
		JButton btn1 = new JButton("Mostrar Animales");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MostrarBuscar window = new MostrarBuscar();
				window.getMostrarFrame().setVisible(true);
			}
		});
		btn1.setBounds(141, 100, 158, 46);
		getZoopooApp().getContentPane().add(btn1);
		btn1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 12));
		btn1.setBackground(Color.LIGHT_GRAY);
		btn1.setForeground(Color.DARK_GRAY);
		
		JButton btn2 = new JButton("Agregar Animales");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistroAnimales window = new RegistroAnimales();
				window.RegistroAnimales.setVisible(true);;
				
			}
		});
		btn2.setBounds(141, 157, 158, 46);
		getZoopooApp().getContentPane().add(btn2);
		btn2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 12));
		btn2.setBackground(Color.LIGHT_GRAY);
		btn2.setForeground(Color.DARK_GRAY);
		
		JButton btn3 = new JButton("Salir");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btn3.setBounds(141, 214, 158, 46);
		getZoopooApp().getContentPane().add(btn3);
		btn3.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 12));
		btn3.setBackground(Color.LIGHT_GRAY);
		btn3.setForeground(Color.DARK_GRAY);
	}
	public JFrame getZoopooApp() {
		return ZoopooAPP;
	}
	public void setZoopooApp(JFrame zoopooApp) {
		ZoopooAPP = zoopooApp;
	}
}
