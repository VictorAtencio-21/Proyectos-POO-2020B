package calc.ip;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Window.Type;

public class Instrucciones {

	private JFrame Instrucciones;

	public Instrucciones() {
		Instrucc();
	}
	private void Instrucc() {
		setFrmInstrucciones(new JFrame());
		getFrmInstrucciones().setTitle("INFORMACION");
		getFrmInstrucciones().getContentPane().setBackground(Color.LIGHT_GRAY);
		getFrmInstrucciones().getContentPane().setLayout(null);
		getFrmInstrucciones().setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido a la calculadora de IP");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 466, 30);
		getFrmInstrucciones().getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Esta determinara:");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 40, 416, 30);
		getFrmInstrucciones().getContentPane().add(lblNewLabel_1);
		
		JTextArea txtrsiUnaIp = new JTextArea();
		txtrsiUnaIp.setEditable(false);
		txtrsiUnaIp.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		txtrsiUnaIp.setText("*si una IP dada es Publica o Privada\r\n*la clase a la cual pertenece una IP dada\r\n*si una IP dada pertenece al Protocolo APIPA\r\n*si una IP dada es una direcci\u00F3n Reservada, y su tipo\r\n*si una IP dada es Unicast, Multicast o Broadcast\r\n    Y con una direcci\u00F3n IP dada y una Mascara de red Dada:\r\n\t-Cual es direcci\u00F3n del red\r\n\t-Cual es direcci\u00F3n de Gateway\r\n\t-Cual es direcci\u00F3n Broadcast\r\n\t-Cual es el rango de direcciones IP de dicha red\r\n*Ser capaz de calcular una red Ipv4 para una cantidad de host dados, \r\ndesperdiciando el menor numero de ips posibles, ejemplo:\r\n    si son 130, debe de determinar que la red a usar es 192.168.1.0/24\r\n    si son 2000,  debe de determinar que la red a usar es 172.16.0.0/21\r\n*Dada una direcci\u00F3n ipv6, \r\nse debe de identificar los diferentes tipos de direcciones ipv6, \r\nsi es anycast, si es link local, loopback etc");
		txtrsiUnaIp.setBounds(10, 69, 466, 275);
		getFrmInstrucciones().getContentPane().add(txtrsiUnaIp);
		
		JLabel lblNewLabel_2 = new JLabel("Victor Atencio");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setBounds(10, 355, 80, 20);
		getFrmInstrucciones().getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("CI: 28252900");
		lblNewLabel_2_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1.setBounds(10, 372, 80, 20);
		getFrmInstrucciones().getContentPane().add(lblNewLabel_2_1);
		getFrmInstrucciones().setBounds(100, 100, 500, 440);
		getFrmInstrucciones().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	public JFrame getFrmInstrucciones() {
		return Instrucciones;
	}

	public void setFrmInstrucciones(JFrame frmInstrucciones) {
		this.Instrucciones = frmInstrucciones;
		Instrucciones.setResizable(false);
	}
}
