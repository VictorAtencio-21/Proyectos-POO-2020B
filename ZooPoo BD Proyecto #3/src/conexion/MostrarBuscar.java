package conexion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class MostrarBuscar {

	private JFrame MostrarFrame;
	private JTextField MostrarNombre;
	private JTextField MostrarRaza;
	private JTextField MostrarEdad;
	private JTextField MostrarPeso;
	private JTextField MostrarPPC;
	private JTextField txtIDBuscar;

	public MostrarBuscar() {
		initialize();
	}

	private void initialize() {
		setMostrarFrame(new JFrame());
		getMostrarFrame().getContentPane().setEnabled(false);
		getMostrarFrame().getContentPane().setBackground(Color.DARK_GRAY);
		getMostrarFrame().getContentPane().setForeground(Color.WHITE);
		getMostrarFrame().getContentPane().setLayout(null);
		
		JLabel MostrarNombrelbl = new JLabel("NOMBRE");
		MostrarNombrelbl.setHorizontalAlignment(SwingConstants.CENTER);
		MostrarNombrelbl.setForeground(Color.WHITE);
		MostrarNombrelbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		MostrarNombrelbl.setBounds(50, 28, 140, 40);
		getMostrarFrame().getContentPane().add(MostrarNombrelbl);
		
		JLabel MostrarRazalbl = new JLabel("RAZA");
		MostrarRazalbl.setHorizontalAlignment(SwingConstants.CENTER);
		MostrarRazalbl.setForeground(Color.WHITE);
		MostrarRazalbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		MostrarRazalbl.setBounds(236, 28, 140, 40);
		getMostrarFrame().getContentPane().add(MostrarRazalbl);
		
		MostrarNombre = new JTextField();
		MostrarNombre.setEnabled(false);
		MostrarNombre.setBounds(50, 79, 140, 34);
		getMostrarFrame().getContentPane().add(MostrarNombre);
		MostrarNombre.setColumns(10);
		
		MostrarRaza = new JTextField();
		MostrarRaza.setEnabled(false);
		MostrarRaza.setBounds(236, 79, 140, 34);
		getMostrarFrame().getContentPane().add(MostrarRaza);
		MostrarRaza.setColumns(10);
		
		JLabel MostrarEdadlbl = new JLabel("EDAD");
		MostrarEdadlbl.setForeground(Color.WHITE);
		MostrarEdadlbl.setHorizontalAlignment(SwingConstants.CENTER);
		MostrarEdadlbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		MostrarEdadlbl.setBounds(50, 124, 140, 40);
		getMostrarFrame().getContentPane().add(MostrarEdadlbl);
		
		JLabel MostrarPesolbl = new JLabel("PESO");
		MostrarPesolbl.setForeground(Color.WHITE);
		MostrarPesolbl.setHorizontalAlignment(SwingConstants.CENTER);
		MostrarPesolbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		MostrarPesolbl.setBounds(236, 124, 140, 40);
		getMostrarFrame().getContentPane().add(MostrarPesolbl);
		
		MostrarEdad = new JTextField();
		MostrarEdad.setEnabled(false);
		MostrarEdad.setBounds(50, 175, 140, 34);
		getMostrarFrame().getContentPane().add(MostrarEdad);
		MostrarEdad.setColumns(10);
		
		MostrarPeso = new JTextField();
		MostrarPeso.setEnabled(false);
		MostrarPeso.setBounds(236, 175, 140, 34);
		getMostrarFrame().getContentPane().add(MostrarPeso);
		MostrarPeso.setColumns(10);
		
		JLabel MostrarPPClbl = new JLabel("PLUMAJE/PELAJE/COLOR");
		MostrarPPClbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		MostrarPPClbl.setForeground(Color.WHITE);
		MostrarPPClbl.setBounds(40, 220, 167, 40);
		getMostrarFrame().getContentPane().add(MostrarPPClbl);
		
		MostrarPPC = new JTextField();
		MostrarPPC.setEnabled(false);
		MostrarPPC.setBounds(50, 271, 140, 34);
		getMostrarFrame().getContentPane().add(MostrarPPC);
		MostrarPPC.setColumns(10);
		
		JLabel BuscarIDlbl = new JLabel("Introduzca ID");
		BuscarIDlbl.setForeground(Color.WHITE);
		BuscarIDlbl.setHorizontalAlignment(SwingConstants.CENTER);
		BuscarIDlbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		BuscarIDlbl.setBounds(256, 220, 98, 40);
		getMostrarFrame().getContentPane().add(BuscarIDlbl);
		
		txtIDBuscar = new JTextField();
		txtIDBuscar.setBounds(278, 271, 66, 34);
		getMostrarFrame().getContentPane().add(txtIDBuscar);
		txtIDBuscar.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Connection cn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Register","postgres","0806memo");
					PreparedStatement pstc = cn.prepareStatement("Select * from BDZooPooAPP where idanimal = ?");
					pstc.setString(1, txtIDBuscar.getText().trim());
					
					ResultSet rs = pstc.executeQuery();
					
					if(rs.next()) {
						MostrarNombre.setText(rs.getString("nombre"));
						MostrarRaza.setText(rs.getString("raza"));
						MostrarEdad.setText(rs.getString("edad"));
						MostrarPeso.setText(rs.getString("peso"));
						MostrarPPC.setText(rs.getString("PlumajePelajeColor"));	
					} else {
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnBuscar.setBackground(Color.LIGHT_GRAY);
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBuscar.setBounds(265, 340, 89, 40);
		getMostrarFrame().getContentPane().add(btnBuscar);
		
		JButton btnAtras = new JButton("<-");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getMostrarFrame().dispose();
			}
		});
		btnAtras.setBackground(Color.LIGHT_GRAY);
		btnAtras.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAtras.setBounds(22, 344, 89, 34);
		getMostrarFrame().getContentPane().add(btnAtras);
		getMostrarFrame().setTitle("BUSCAR Y MOSTRAR");
		getMostrarFrame().setResizable(false);
		getMostrarFrame().setBounds(100, 100, 450, 425);
		getMostrarFrame().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	public JFrame getMostrarFrame() {
		return MostrarFrame;
	}

	public void setMostrarFrame(JFrame mostrarFrame) {
		MostrarFrame = mostrarFrame;
	}
}
