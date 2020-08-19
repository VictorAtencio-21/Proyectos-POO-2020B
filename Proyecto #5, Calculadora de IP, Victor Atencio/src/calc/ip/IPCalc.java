package calc.ip;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class IPCalc {

	public JFrame CalculadoraIP;
	private JTextField OCT1;
	private JTextField OCT2;
	private JTextField OCT3;
	private JTextField OCT4;
	private JTextField Mask;
	private JLabel lblMask;
	private JLabel lblTipoIP;
	private JLabel lblClase;
	private JLabel lblApipa;
	private JLabel lblResv;
	private JTextField txtTipoIP;
	private JTextField txtClase;
	private JTextField txtAPIPA;
	private JTextField txtRes;
	private JButton btnCalcular;
	private JButton btnLimpiar;
	private JLabel lblDireccion;
	private JLabel lblGateway;
	private JTextField txtDirecc;
	private JTextField txtGateway;
	private JLabel lblBroadcast;
	private JTextField txtBroadcast;
	private JLabel lblInfo;
	private JLabel lblRango;
	private JTextField txtRango;
	private JButton btnInfo;
	private JLabel lblGuardar;
	private JLabel lblHost;
	private static JTextField txtHost;
	private static JTextField HostDado;
	RegistroBD DBip = RegistroBD.getInstances();

	public IPCalc() {
		CalcIP();
	}

	private void CalcIP() {
		CalculadoraIP = new JFrame();
		CalculadoraIP.getContentPane().setBackground(Color.LIGHT_GRAY);
		CalculadoraIP.setResizable(false);
		CalculadoraIP.getContentPane().setForeground(Color.BLACK);
		CalculadoraIP.setTitle("--Calculadora de IP-- POO, Proyecto #5, Victor Atencio");
		CalculadoraIP.setBounds(100, 100, 490, 480);
		CalculadoraIP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CalculadoraIP.getContentPane().setLayout(null);
		CalculadoraIP.setLocationRelativeTo(null);
		
		JLabel lblIP = new JLabel("IP:");
		lblIP.setForeground(Color.BLACK);
		lblIP.setFont(new Font("DialogInput", Font.PLAIN, 13));
		lblIP.setBounds(10, 11, 31, 27);
		CalculadoraIP.getContentPane().add(lblIP);
		
		OCT1 = new JTextField();
		OCT1.setFont(new Font("Consolas", Font.PLAIN, 12));
		OCT1.setText("0");
		OCT1.setHorizontalAlignment(SwingConstants.CENTER);
		OCT1.setForeground(Color.BLACK);
		OCT1.setBounds(51, 16, 60, 20);
		CalculadoraIP.getContentPane().add(OCT1);
		OCT1.setColumns(10);
		
		OCT2 = new JTextField();
		OCT2.setFont(new Font("Consolas", Font.PLAIN, 12));
		OCT2.setText("0");
		OCT2.setHorizontalAlignment(SwingConstants.CENTER);
		OCT2.setForeground(Color.BLACK);
		OCT2.setColumns(10);
		OCT2.setBounds(120, 16, 60, 20);
		CalculadoraIP.getContentPane().add(OCT2);
		
		OCT3 = new JTextField();
		OCT3.setFont(new Font("Consolas", Font.PLAIN, 12));
		OCT3.setText("0");
		OCT3.setHorizontalAlignment(SwingConstants.CENTER);
		OCT3.setForeground(Color.BLACK);
		OCT3.setColumns(10);
		OCT3.setBounds(189, 16, 60, 20);
		CalculadoraIP.getContentPane().add(OCT3);
		
		OCT4 = new JTextField();
		OCT4.setFont(new Font("Consolas", Font.PLAIN, 12));
		OCT4.setText("0");
		OCT4.setHorizontalAlignment(SwingConstants.CENTER);
		OCT4.setForeground(Color.BLACK);
		OCT4.setColumns(10);
		OCT4.setBounds(258, 16, 60, 20);
		CalculadoraIP.getContentPane().add(OCT4);
		
		Mask = new JTextField();
		Mask.setFont(new Font("Consolas", Font.PLAIN, 12));
		Mask.setText("0");
		Mask.setHorizontalAlignment(SwingConstants.CENTER);
		Mask.setForeground(Color.BLACK);
		Mask.setColumns(10);
		Mask.setBounds(325, 16, 60, 20);
		CalculadoraIP.getContentPane().add(Mask);
		
		lblMask = new JLabel("/");
		lblMask.setForeground(Color.BLACK);
		lblMask.setBounds(320, 18, 13, 14);
		CalculadoraIP.getContentPane().add(lblMask);
		
		lblTipoIP = new JLabel("Tipo IP:");
		lblTipoIP.setForeground(Color.BLACK);
		lblTipoIP.setFont(new Font("DialogInput", Font.PLAIN, 12));
		lblTipoIP.setBounds(10, 68, 110, 27);
		CalculadoraIP.getContentPane().add(lblTipoIP);
		
		lblClase = new JLabel("Clase:");
		lblClase.setForeground(Color.BLACK);
		lblClase.setFont(new Font("DialogInput", Font.PLAIN, 12));
		lblClase.setBounds(10, 100, 110, 27);
		CalculadoraIP.getContentPane().add(lblClase);
		
		lblApipa = new JLabel("APIPA:");
		lblApipa.setForeground(Color.BLACK);
		lblApipa.setFont(new Font("DialogInput", Font.PLAIN, 12));
		lblApipa.setBounds(10, 130, 110, 27);
		CalculadoraIP.getContentPane().add(lblApipa);
		
		lblResv = new JLabel("Reservada:");
		lblResv.setForeground(Color.BLACK);
		lblResv.setFont(new Font("DialogInput", Font.PLAIN, 12));
		lblResv.setBounds(10, 160, 110, 27);
		CalculadoraIP.getContentPane().add(lblResv);
		
		txtTipoIP = new JTextField();
		txtTipoIP.setBackground(Color.WHITE);
		txtTipoIP.setFont(new Font("Arial", Font.PLAIN, 10));
		txtTipoIP.setForeground(Color.BLACK);
		txtTipoIP.setEditable(false);
		txtTipoIP.setBounds(120, 70, 250, 27);
		CalculadoraIP.getContentPane().add(txtTipoIP);
		txtTipoIP.setColumns(10);
		
		txtClase = new JTextField();
		txtClase.setBackground(Color.WHITE);
		txtClase.setFont(new Font("Arial", Font.PLAIN, 10));
		txtClase.setForeground(Color.BLACK);
		txtClase.setEditable(false);
		txtClase.setColumns(10);
		txtClase.setBounds(120, 100, 250, 27);
		CalculadoraIP.getContentPane().add(txtClase);
		
		txtAPIPA = new JTextField();
		txtAPIPA.setBackground(Color.WHITE);
		txtAPIPA.setFont(new Font("Arial", Font.PLAIN, 10));
		txtAPIPA.setForeground(Color.BLACK);
		txtAPIPA.setEditable(false);
		txtAPIPA.setColumns(10);
		txtAPIPA.setBounds(120, 130, 250, 27);
		CalculadoraIP.getContentPane().add(txtAPIPA);
		
		txtRes = new JTextField();
		txtRes.setBackground(Color.WHITE);
		txtRes.setFont(new Font("Arial", Font.PLAIN, 10));
		txtRes.setForeground(Color.BLACK);
		txtRes.setEditable(false);
		txtRes.setColumns(10);
		txtRes.setBounds(120, 160, 250, 27);
		CalculadoraIP.getContentPane().add(txtRes);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CalculoParteA();
				ipv4recomendada(0);
		}
		});
		btnCalcular.setBackground(Color.DARK_GRAY);
		btnCalcular.setForeground(Color.WHITE);
		btnCalcular.setBounds(10, 402, 100, 30);
		CalculadoraIP.getContentPane().add(btnCalcular);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Limpiar();
			}
		});
		btnLimpiar.setBackground(Color.DARK_GRAY);
		btnLimpiar.setForeground(Color.WHITE);
		btnLimpiar.setBounds(117, 402, 100, 30);
		CalculadoraIP.getContentPane().add(btnLimpiar);
		
		lblDireccion = new JLabel("Direccion:");
		lblDireccion.setForeground(Color.BLACK);
		lblDireccion.setFont(new Font("DialogInput", Font.PLAIN, 12));
		lblDireccion.setBounds(10, 220, 110, 27);
		CalculadoraIP.getContentPane().add(lblDireccion);
		
		lblGateway = new JLabel("Gateway:");
		lblGateway.setForeground(Color.BLACK);
		lblGateway.setFont(new Font("DialogInput", Font.PLAIN, 12));
		lblGateway.setBounds(10, 250, 110, 27);
		CalculadoraIP.getContentPane().add(lblGateway);
		
		txtDirecc = new JTextField();
		txtDirecc.setBackground(Color.WHITE);
		txtDirecc.setFont(new Font("Arial", Font.PLAIN, 10));
		txtDirecc.setForeground(Color.BLACK);
		txtDirecc.setEditable(false);
		txtDirecc.setColumns(10);
		txtDirecc.setBounds(120, 220, 250, 27);
		CalculadoraIP.getContentPane().add(txtDirecc);
		
		txtGateway = new JTextField();
		txtGateway.setBackground(Color.WHITE);
		txtGateway.setFont(new Font("Arial", Font.PLAIN, 10));
		txtGateway.setForeground(Color.BLACK);
		txtGateway.setEditable(false);
		txtGateway.setColumns(10);
		txtGateway.setBounds(120, 250, 250, 27);
		CalculadoraIP.getContentPane().add(txtGateway);
		
		lblBroadcast = new JLabel("Broadcast:");
		lblBroadcast.setForeground(Color.BLACK);
		lblBroadcast.setFont(new Font("DialogInput", Font.PLAIN, 12));
		lblBroadcast.setBounds(10, 280, 110, 27);
		CalculadoraIP.getContentPane().add(lblBroadcast);
		
		txtBroadcast = new JTextField();
		txtBroadcast.setBackground(Color.WHITE);
		txtBroadcast.setFont(new Font("Arial", Font.PLAIN, 10));
		txtBroadcast.setForeground(Color.BLACK);
		txtBroadcast.setEditable(false);
		txtBroadcast.setColumns(10);
		txtBroadcast.setBounds(120, 280, 250, 27);
		CalculadoraIP.getContentPane().add(txtBroadcast);
		
		lblInfo = new JLabel("INFORMACION IP");
		lblInfo.setForeground(new Color(0, 0, 0));
		lblInfo.setFont(new Font("DialogInput", Font.BOLD, 13));
		lblInfo.setBounds(10, 43, 170, 27);
		CalculadoraIP.getContentPane().add(lblInfo);
		
		lblRango = new JLabel("Rango IP:");
		lblRango.setForeground(Color.BLACK);
		lblRango.setFont(new Font("DialogInput", Font.PLAIN, 12));
		lblRango.setBounds(10, 310, 110, 27);
		CalculadoraIP.getContentPane().add(lblRango);
		
		txtRango = new JTextField();
		txtRango.setForeground(Color.BLACK);
		txtRango.setFont(new Font("Arial", Font.PLAIN, 10));
		txtRango.setEditable(false);
		txtRango.setColumns(10);
		txtRango.setBackground(Color.WHITE);
		txtRango.setBounds(120, 310, 250, 27);
		CalculadoraIP.getContentPane().add(txtRango);
		
		JButton btnRegist = new JButton("Registro");
		btnRegist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistroIP window = new RegistroIP();
				window.getFrmRegistro().setVisible(true);
			}
		});
		btnRegist.setForeground(Color.WHITE);
		btnRegist.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		btnRegist.setBackground(Color.DARK_GRAY);
		btnRegist.setBounds(227, 402, 100, 30);
		CalculadoraIP.getContentPane().add(btnRegist);
		
		btnInfo = new JButton("Info...");
		btnInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Instrucciones window = new Instrucciones();
				window.getFrmInstrucciones().setVisible(true);
			}
		});
		btnInfo.setForeground(Color.WHITE);
		btnInfo.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		btnInfo.setBackground(Color.DARK_GRAY);
		btnInfo.setBounds(337, 402, 100, 30);
		CalculadoraIP.getContentPane().add(btnInfo);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ArrayDatosIP[] = new String[20];
				
				ArrayDatosIP[0] = txtDirecc.getText();
				ArrayDatosIP[1] = txtBroadcast.getText();
				ArrayDatosIP[2] = txtGateway.getText();
				ArrayDatosIP[3] = txtRango.getText();
				ArrayDatosIP[4] = txtClase.getText();
				ArrayDatosIP[5] = txtTipoIP.getText();
				ArrayDatosIP[6] = txtAPIPA.getText();
				ArrayDatosIP[7] = txtRes.getText();
				ArrayDatosIP[8] = txtHost.getText();
				
				
				DBip.dbAgregar(ArrayDatosIP);
				lblGuardar.setText("Guardado.");
			}
		});
		btnGuardar.setForeground(Color.WHITE);
		btnGuardar.setBackground(Color.DARK_GRAY);
		btnGuardar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		btnGuardar.setBounds(380, 341, 80, 26);
		CalculadoraIP.getContentPane().add(btnGuardar);
		
		lblGuardar = new JLabel("");
		lblGuardar.setBounds(10, 402, 101, 20);
		CalculadoraIP.getContentPane().add(lblGuardar);
		
		lblHost = new JLabel("Host dado:");
		lblHost.setForeground(Color.BLACK);
		lblHost.setFont(new Font("DialogInput", Font.PLAIN, 12));
		lblHost.setBounds(10, 340, 110, 27);
		CalculadoraIP.getContentPane().add(lblHost);
		
		txtHost = new JTextField();
		txtHost.setForeground(Color.BLACK);
		txtHost.setFont(new Font("Arial", Font.PLAIN, 10));
		txtHost.setEditable(false);
		txtHost.setColumns(10);
		txtHost.setBackground(Color.WHITE);
		txtHost.setBounds(190, 340, 180, 27);
		CalculadoraIP.getContentPane().add(txtHost);
		
		HostDado = new JTextField();
		HostDado.setText("0");
		HostDado.setHorizontalAlignment(SwingConstants.CENTER);
		HostDado.setForeground(Color.BLACK);
		HostDado.setFont(new Font("Consolas", Font.PLAIN, 12));
		HostDado.setBackground(Color.WHITE);
		HostDado.setBounds(120, 340, 60, 27);
		CalculadoraIP.getContentPane().add(HostDado);
		HostDado.setColumns(10);
		
		JButton btnIpv = new JButton("IPV6");
		btnIpv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IPV6 window = new IPV6();
				window.getFrmIpv().setVisible(true);
			}
		});
		btnIpv.setForeground(Color.WHITE);
		btnIpv.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		btnIpv.setBackground(Color.DARK_GRAY);
		btnIpv.setBounds(395, 12, 67, 26);
		CalculadoraIP.getContentPane().add(btnIpv);	
	}
	public JFrame getCalculadoraIP() {
		return CalculadoraIP;
	}
	private void CalculoParteA() {
		int O1 = Integer.parseInt(OCT1.getText());
		int O2 = Integer.parseInt(OCT2.getText());
		int O3 = Integer.parseInt(OCT3.getText());
		int O4 = Integer.parseInt(OCT4.getText());
		int Masc = Integer.parseInt(Mask.getText());
		
		if((O1<=224)&&(O2==0)&&(O3==0)&&(O4==0)&&(Masc==0)) {
			JOptionPane.showMessageDialog(null,"Elija un IP valida menor a 224.0.0.0","ERROR",JOptionPane.INFORMATION_MESSAGE);
			txtTipoIP.setText("-");
			txtClase.setText("-");
			txtAPIPA.setText("-");
			txtRes.setText("-");
		}
//COMPARADORES PARA DETERMINAR IP PUBLICA, PRIVADA, CLASE, PERTENECIENTE A APIPA, RESERVADA, PRIVADA.
		if ((O1==10)&&(O2<=255)&&(O3<=255)&&(O4<=255)) {
			txtTipoIP.setText("Privada");
			txtClase.setText("A");
			txtAPIPA.setText("No pertenece al protocolo");
			txtRes.setText("Reservada, com. locales en una red privada");
		} else if ((O1==172)&&(O2==16|O2<=31)&&(O3<=255)&&(O4<=255)) {
			txtTipoIP.setText("Privada");
			txtClase.setText("B");
			txtAPIPA.setText("No pertenece al protocolo");
			txtRes.setText("Reservada, com. locales en una red privada");
		} else if ((O1==192)&&(O2==168)&&(O3<=255)&&(O4<=255)) {
			txtTipoIP.setText("Privada");
			txtClase.setText("C");
			txtAPIPA.setText("No pertenece al protocolo");
			txtRes.setText("Reservada, com. locales en una red privada.");
		} else if ((O1==1|O1<=126)&&(O2<=255)&&(O3<=255)&&(O4<=255)) {
			txtTipoIP.setText("Publica");
			txtClase.setText("A");
			txtAPIPA.setText("No pertenece al protocolo");
			txtRes.setText("No Reservada");
		} else if ((O1==128|O1<=191)&&(O2<=255)&&(O3<=255)&&(O4<=255)) {
			txtTipoIP.setText("Publica");
			txtClase.setText("B");
			txtAPIPA.setText("No pertenece al protocolo");
			txtRes.setText("No Reservada");
		} else if ((O1==192|O1<=223)&&(O2<=255)&&(O3<=255)&&(O4<=255)) {
			txtTipoIP.setText("Publica");
			txtClase.setText("C");
			txtAPIPA.setText("No pertenece al protocolo");
			txtRes.setText("No Reservada");
		} if ((O1==169)&&(O2==254)&&(O3==1)&&(O4<=255)) {
			txtTipoIP.setText("Privada");
			txtClase.setText("B");
			txtAPIPA.setText("Pertenece al protocolo");
			txtRes.setText("Reservada, subred, vínculo entre dos hosts");
		} else if ((O1!=169)&&(O2!=254)&&(O3!=1)&&(O4<=255)){
			txtTipoIP.setText("-");
			txtClase.setText("-");
			txtAPIPA.setText("No pertenece al protocolo");
			txtRes.setText("-");
		} else if ((O1==0)&&(O2<=255)&&(O3<=255)&&(O4<=255)) {
			txtTipoIP.setText("Privada");
			txtClase.setText("-");
			txtAPIPA.setText("-");
			txtRes.setText("Reservada, Software, red actual");
		}
		//OPERACIONES PARA CACULAR DIRECCION, GATEWAY, BROADCAST, Y RANGO DE DIRECCIONES
		//Guardando los datos ingresados a binario
		String oct1 = Integer.toBinaryString(Integer.parseInt(OCT1.getText()));
		String oct2 = Integer.toBinaryString(Integer.parseInt(OCT2.getText()));
		String oct3 = Integer.toBinaryString(Integer.parseInt(OCT3.getText()));
		String oct4 = Integer.toBinaryString(Integer.parseInt(OCT4.getText()));
		
		//Convirtiendo a 8 bytes
		String ByteIP1 = String.format("%08d", Integer.parseInt(oct1));
		String ByteIP2 = String.format("%08d", Integer.parseInt(oct2));
		String ByteIP3= String.format("%08d", Integer.parseInt(oct3));
		String ByteIP4 = String.format("%08d", Integer.parseInt(oct4));
		//Integer para la mascara
		int Mascara = Integer.valueOf(Mask.getText());
		//Int de 32 bits para toda la IP
		int IPbits = Integer.parseInt(ByteIP1+ByteIP2+ByteIP3,2);
		//Solucion al 31 bit integer de Java
		IPbits = (IPbits << 8) + Integer.parseInt(ByteIP4,2);
		//Mascara binaria de 32 bits
		int MascBIN= ~0 << (32-Mascara);
		//Operacion AND (&) para la direccion
		int direccionRED = IPbits & MascBIN;
		//Operacion OR (|) para la direccion del Broadcast
		int broadcastRED = IPbits | ~MascBIN;
		//Gateway	
	//Mostrar Calculos
		//Separador
		String strDireccion=Integer.toBinaryString(direccionRED);
		String [] DireccionRED = strDireccion.split("(?<=\\G........)");
		String strBroadcast=Integer.toBinaryString(broadcastRED);
		String [] BroadcastRED = strBroadcast.split("(?<=\\G........)");
		//Escribiendo en los TextFields
		txtDirecc.setText(
				String.valueOf(Integer.parseInt(DireccionRED[0],2))+"."+
				String.valueOf(Integer.parseInt(DireccionRED[1],2))+"."+
				String.valueOf(Integer.parseInt(DireccionRED[2],2))+"."+
				String.valueOf(Integer.parseInt(DireccionRED[3],2))
				);
		txtBroadcast.setText(
				String.valueOf(Integer.parseInt(BroadcastRED[0],2))+"."+
				String.valueOf(Integer.parseInt(BroadcastRED[1],2))+"."+
				String.valueOf(Integer.parseInt(BroadcastRED[2],2))+"."+
				String.valueOf(Integer.parseInt(BroadcastRED[3],2))
				);
		txtGateway.setText(
				String.valueOf(Integer.parseInt(DireccionRED[0],2))+"."+
				String.valueOf(Integer.parseInt(DireccionRED[1],2))+"."+
				String.valueOf(Integer.parseInt(DireccionRED[2],2))+"."+
				String.valueOf(Integer.parseInt(DireccionRED[3],2))+" + 1"
				);
		txtRango.setText(
				String.valueOf(Integer.parseInt(BroadcastRED[0],2))+"."+
				String.valueOf(Integer.parseInt(BroadcastRED[1],2))+"."+
				String.valueOf(Integer.parseInt(BroadcastRED[2],2))+"."+
				String.valueOf(Integer.parseInt(BroadcastRED[3],2))+" - 1"
				);
	}
	//Calculos de la parte B
	//A segun Host Dado
	public static String ipv4recomendada (int host) {
		//Mascara de Subred
		host = Integer.parseInt(HostDado.getText());
		int n = (int) (32-(Math.log(host)/(Math.log(2))));
		String IPrecomendada="";
		if (n>=8&&n<=12) {
			IPrecomendada+="10.0.0.0/"+n;
			txtHost.setText(IPrecomendada);
		} else if (n>=13&&n<=16) {
			IPrecomendada+="172.16.0.0/"+n;
			txtHost.setText(IPrecomendada);
		} else if (n>=16&&n<=30) {
			IPrecomendada+="192.168.1.0/"+n;
			txtHost.setText(IPrecomendada);
		}
		return IPrecomendada;
	}
	private void Limpiar() {
		OCT1.setText("0");
		OCT2.setText("0");
		OCT3.setText("0");
		OCT4.setText("0");
		Mask.setText("0");
		HostDado.setText("0");
		txtTipoIP.setText("");
		txtClase.setText("");
		txtAPIPA.setText("");
		txtRes.setText("");
		txtDirecc.setText("");
		txtBroadcast.setText("");
		txtGateway.setText("");
		txtRango.setText("");
		txtHost.setText("");
		lblGuardar.setText("");
	}
	public JFrame CalculadoraIP() {
		return CalculadoraIP;
	}
	public void setCalculadoraIP(JFrame CalculadoraIP) {
		this.CalculadoraIP = CalculadoraIP;
		CalculadoraIP.setResizable(false);
	}
}