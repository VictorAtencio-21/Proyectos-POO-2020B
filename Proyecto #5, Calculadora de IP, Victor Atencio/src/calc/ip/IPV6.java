package calc.ip;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import java.net.*;
import javax.swing.JTextArea;

public class IPV6 {

	private JFrame frmIpv;
	private JTextField ipv6;
	private JLabel lblGuardarIPv6;
	private JTextField txtResipv6;
	private JTextArea AreaIPv6;
	private JTextField maskipv6;
	private InetAddress ip6;
	RegistroBD GuardarIPv6 = RegistroBD.getInstances();
	private JTextField txtDif;
	
	public IPV6() {
		IPv6();
	}
	private void IPv6() {
		setFrmIpv(new JFrame());
		getFrmIpv().setTitle("IPV6");
		getFrmIpv().getContentPane().setBackground(Color.LIGHT_GRAY);
		frmIpv.getContentPane().setLayout(null);
		frmIpv.setLocationRelativeTo(null);
		
		JLabel lblIPV6 = new JLabel("Direccion IPV6:");
		lblIPV6.setFont(new Font("DialogInput", Font.PLAIN, 12));
		lblIPV6.setForeground(Color.BLACK);
		lblIPV6.setBounds(10, 20, 120, 20);
		frmIpv.getContentPane().add(lblIPV6);
		
		ipv6 = new JTextField();
		ipv6.setForeground(Color.BLACK);
		ipv6.setFont(new Font("Consolas", Font.PLAIN, 12));
		ipv6.setBounds(10, 45, 325, 20);
		frmIpv.getContentPane().add(ipv6);
		ipv6.setColumns(10);
		
		JButton btnVolver = new JButton("Volver a IPv4");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmIpv.dispose();
			}
		});
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setBackground(Color.DARK_GRAY);
		btnVolver.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnVolver.setBounds(10, 280, 120, 30);
		frmIpv.getContentPane().add(btnVolver);
		
		JButton btnGuardarIPv6 = new JButton("Guardar");
		btnGuardarIPv6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblGuardarIPv6.setText("Guardado.");
				String ArrayIPv6[] = new String[10];
				ArrayIPv6[0] = txtResipv6.getText();
				GuardarIPv6.dbAgregar(ArrayIPv6);
				lblGuardarIPv6.setText("Guardado.");
			}
		});
		btnGuardarIPv6.setForeground(Color.WHITE);
		btnGuardarIPv6.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnGuardarIPv6.setBackground(Color.DARK_GRAY);
		btnGuardarIPv6.setBounds(250, 280, 100, 30);
		frmIpv.getContentPane().add(btnGuardarIPv6);
		
		JLabel lblGuardarIPv6 = new JLabel("");
		lblGuardarIPv6.setForeground(Color.BLACK);
		lblGuardarIPv6.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblGuardarIPv6.setBounds(10, 249, 120, 20);
		frmIpv.getContentPane().add(lblGuardarIPv6);
		
		JLabel lvlResipv6 = new JLabel("Reservada:");
		lvlResipv6.setForeground(Color.BLACK);
		lvlResipv6.setFont(new Font("DialogInput", Font.PLAIN, 12));
		lvlResipv6.setBounds(10, 196, 100, 20);
		frmIpv.getContentPane().add(lvlResipv6);
		
		txtResipv6 = new JTextField();
		txtResipv6.setForeground(Color.BLACK);
		txtResipv6.setFont(new Font("Arial Narrow", Font.PLAIN, 12));
		txtResipv6.setEditable(false);
		txtResipv6.setColumns(10);
		txtResipv6.setBounds(105, 197, 260, 20);
		frmIpv.getContentPane().add(txtResipv6);
		
		JLabel lblSlash = new JLabel("/");
		lblSlash.setBounds(340, 43, 15, 20);
		frmIpv.getContentPane().add(lblSlash);
		
		maskipv6 = new JTextField();
		maskipv6.setBounds(348, 45, 85, 20);
		frmIpv.getContentPane().add(maskipv6);
		maskipv6.setColumns(10);
		
		JLabel lblMascaraIpv = new JLabel("Mascara IPv6:");
		lblMascaraIpv.setForeground(Color.BLACK);
		lblMascaraIpv.setFont(new Font("DialogInput", Font.PLAIN, 12));
		lblMascaraIpv.setBounds(336, 24, 100, 20);
		frmIpv.getContentPane().add(lblMascaraIpv);
		
		JTextArea AreaIPv6 = new JTextArea();
		AreaIPv6.setForeground(Color.BLACK);
		AreaIPv6.setFont(new Font("Consolas", Font.PLAIN, 12));
		AreaIPv6.setEditable(false);
		AreaIPv6.setBounds(10, 70, 325, 36);
		frmIpv.getContentPane().add(AreaIPv6);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*Recibir direccion IPv6 escrita y completar con el metodo .getHostAddres de la 
				clase InetAddres*/
				try {
					
				     ip6 = Inet6Address.getByName(ipv6.getText());	
				    } catch (UnknownHostException e1) {
				     e1.printStackTrace();
				    }
					AreaIPv6.append("IPv6 Recibida: "+ipv6.getText()+"\n");
				    AreaIPv6.append("IPv6 Completa: "+ip6.getHostAddress());
				    
				    String Direccion = ip6.getHostAddress();
				    String SepararDireccion[] = Direccion.split(":");
				           
			}  
		});
		btnCalcular.setForeground(Color.WHITE);
		btnCalcular.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnCalcular.setBackground(Color.DARK_GRAY);
		btnCalcular.setBounds(140, 280, 100, 30);
		frmIpv.getContentPane().add(btnCalcular);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ipv6.setText("");
				txtResipv6.setText("");
				AreaIPv6.setText("");
				maskipv6.setText("");
				lblGuardarIPv6.setText("");
			}
		});
		btnLimpiar.setForeground(Color.WHITE);
		btnLimpiar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnLimpiar.setBackground(Color.DARK_GRAY);
		btnLimpiar.setBounds(356, 280, 77, 30);
		frmIpv.getContentPane().add(btnLimpiar);
		
		JLabel lblNewLabel = new JLabel("---INFORMACION IPv6---");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("DialogInput", Font.PLAIN, 13));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 117, 423, 30);
		frmIpv.getContentPane().add(lblNewLabel);
		
		JLabel lblDifusion = new JLabel("Difusion:");
		lblDifusion.setForeground(Color.BLACK);
		lblDifusion.setFont(new Font("DialogInput", Font.PLAIN, 12));
		lblDifusion.setBounds(10, 165, 100, 20);
		frmIpv.getContentPane().add(lblDifusion);
		
		txtDif = new JTextField();
		txtDif.setForeground(Color.BLACK);
		txtDif.setFont(new Font("Arial Narrow", Font.PLAIN, 12));
		txtDif.setEditable(false);
		txtDif.setColumns(10);
		txtDif.setBounds(105, 166, 260, 20);
		frmIpv.getContentPane().add(txtDif);
		getFrmIpv().setBounds(100, 100, 460, 360);
		getFrmIpv().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	public JFrame getFrmIpv() {
		return frmIpv;
	}
	public void setFrmIpv(JFrame frmIpv) {
		this.frmIpv = frmIpv;
		frmIpv.setResizable(false);
	}
}