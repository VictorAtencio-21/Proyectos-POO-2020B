package conexion;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.awt.event.ActionEvent;

public class RegistroAnimales {

	JFrame RegistroAnimales;
	private JTextField txtNombre;
	private JTextField txtRaza;
	private JTextField txtEdad;
	private JTextField txtPeso;
	private JTextField txtPPC;
	private JTextField txtID;
	private JLabel lblEstado;

	public RegistroAnimales() {
		Initialize();
	}
	private void Initialize() {
		RegistroAnimales = new JFrame();
		RegistroAnimales.setTitle("REGISTRO ANIMALES");
		RegistroAnimales.getContentPane().setBackground(Color.DARK_GRAY);
		RegistroAnimales.setResizable(false);
		RegistroAnimales.setBounds(100, 100, 460, 520);
		RegistroAnimales.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		RegistroAnimales.getContentPane().setLayout(null);
		RegistroAnimales.setLocationRelativeTo(null);
		
		JLabel Nombrelbl = new JLabel("Nombre");
		Nombrelbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Nombrelbl.setForeground(Color.WHITE);
		Nombrelbl.setHorizontalAlignment(SwingConstants.LEFT);
		Nombrelbl.setBounds(10, 11, 90, 30);
		RegistroAnimales.getContentPane().add(Nombrelbl);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(10, 39, 140, 30);
		RegistroAnimales.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel Razalbl = new JLabel("Raza");
		Razalbl.setForeground(Color.WHITE);
		Razalbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Razalbl.setBounds(10, 80, 90, 30);
		RegistroAnimales.getContentPane().add(Razalbl);
		
		txtRaza = new JTextField();
		txtRaza.setBounds(10, 107, 140, 30);
		RegistroAnimales.getContentPane().add(txtRaza);
		txtRaza.setColumns(10);
		
		JLabel Edadlbl = new JLabel("Edad");
		Edadlbl.setForeground(Color.WHITE);
		Edadlbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Edadlbl.setBounds(10, 148, 90, 30);
		RegistroAnimales.getContentPane().add(Edadlbl);
		
		txtEdad = new JTextField();
		txtEdad.setBounds(10, 177, 140, 30);
		RegistroAnimales.getContentPane().add(txtEdad);
		txtEdad.setColumns(10);
		
		JLabel Pesolbl = new JLabel("Peso");
		Pesolbl.setForeground(Color.WHITE);
		Pesolbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Pesolbl.setBounds(10, 215, 90, 30);
		RegistroAnimales.getContentPane().add(Pesolbl);
		
		txtPeso = new JTextField();
		txtPeso.setBounds(10, 245, 140, 30);
		RegistroAnimales.getContentPane().add(txtPeso);
		txtPeso.setColumns(10);
		
		JLabel PPClbl = new JLabel("Plumaje/Pelaje/Color");
		PPClbl.setForeground(Color.WHITE);
		PPClbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		PPClbl.setBounds(10, 286, 140, 30);
		RegistroAnimales.getContentPane().add(PPClbl);
		
		txtPPC = new JTextField();
		txtPPC.setBounds(10, 316, 140, 30);
		RegistroAnimales.getContentPane().add(txtPPC);
		txtPPC.setColumns(10);
		
		JButton btnReg = new JButton("Registrar");
		btnReg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			Array objAgg[] = new Array[6];
			BDConexion conn = BDConexion.getInstances(); //Estableciendo conexion con la BD llamando al metodo utilizando SingleTon
			conn.dbAgregar(objAgg);
		
			txtNombre.getText().trim();
			txtNombre.setText("");
			
			txtRaza.getText().trim();
			txtRaza.setText("");
			
			txtEdad.getText().trim();
			txtEdad.setText("");
			
			txtPeso.getText().trim();
			txtPeso.setText("");
			
			txtPPC.getText().trim();
			txtPPC.setText("");
			
			txtID.getText().trim();
			txtID.setText("");
					
			lblEstado.setText("Registrado.");
			}
		});
		
		btnReg.setForeground(Color.BLACK);
		btnReg.setBackground(Color.LIGHT_GRAY);
		btnReg.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnReg.setBounds(10, 368, 120, 30);
		RegistroAnimales.getContentPane().add(btnReg);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					Connection cn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Register","postgres","0806memo");
					PreparedStatement pste = cn.prepareStatement("delete from BDZooPooAPP where idanimal=?");
					
					pste.setString(1, txtID.getText().trim());
					pste.executeUpdate();
					
					txtNombre.setText("");
					txtRaza.setText("");
					txtEdad.setText("");
					txtPeso.setText("");
					txtPPC.setText("");
					txtID.setText("");
					
					lblEstado.setText("Eliminado.");
					
				} catch (Exception e1){
					
					
					
				}
				
			}
		});
		btnEliminar.setForeground(Color.BLACK);
		btnEliminar.setBackground(Color.LIGHT_GRAY);
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEliminar.setBounds(140, 368, 120, 30);
		RegistroAnimales.getContentPane().add(btnEliminar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					String ID = txtID.getText().trim();
					Connection cn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Register","postgres","0806memo");
					PreparedStatement pstm = cn.prepareStatement("update BDZooPooAPP set nombre = ?, raza=?, edad=?, peso=?, PlumajePelajeColor=?, where idanimal=" + ID);
					//Sentencia SQL para modificar el animal
					pstm.setString(1, txtNombre.getText().trim());
					pstm.setString(2, txtRaza.getText().trim());
					pstm.setInt(3, txtEdad.getText().trim());
					pstm.setFloat(4, txtPeso.getText().trim());
					pstm.setString(5, txtPPC.getText().trim());
					pstm.executeUpdate();
					
					lblEstado.setText("Modificado.");
				} 
				catch (Exception e1) {
					
				}
			}
		});
		btnModificar.setForeground(Color.BLACK);
		btnModificar.setBackground(Color.LIGHT_GRAY);
		btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnModificar.setBounds(270, 368, 120, 30);
		RegistroAnimales.getContentPane().add(btnModificar);
		
		JLabel IDAnimallbl = new JLabel("Ingrese ID del Animal");
		IDAnimallbl.setForeground(Color.WHITE);
		IDAnimallbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		IDAnimallbl.setBounds(10, 409, 140, 37);
		RegistroAnimales.getContentPane().add(IDAnimallbl);
		
		txtID = new JTextField();
		txtID.setText("");
		txtID.setBounds(150, 409, 120, 30);
		RegistroAnimales.getContentPane().add(txtID);
		txtID.setColumns(10);
		
		JButton btnBuscarAnimal = new JButton("Buscar");
		btnBuscarAnimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection cn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Register","postgres","0806memo");
					PreparedStatement pstc = cn.prepareStatement("Select * from BDZooPooAPP where idanimal = ?");//Sentencia SQL para buscar animal
					pstc.setString(1, txtID.getText().trim());
					
					ResultSet rs = pstc.executeQuery();
					
					if(rs.next()) {
						txtNombre.setText(rs.getString("nombre"));
						txtRaza.setText(rs.getString("raza"));
						txtEdad.setText(rs.getString("edad"));
						txtPeso.setText(rs.getString("peso"));
						txtPPC.setText(rs.getString("PlumajePelajeColor"));	
					} else {
						JOptionPane.showMessageDialog(null, "No se ha encontrado Animal");
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnBuscarAnimal.setForeground(Color.BLACK);
		btnBuscarAnimal.setBackground(Color.LIGHT_GRAY);
		btnBuscarAnimal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBuscarAnimal.setBounds(280, 409, 110, 32);
		RegistroAnimales.getContentPane().add(btnBuscarAnimal);
		
		JLabel lblEstado = new JLabel("");
		lblEstado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEstado.setForeground(Color.WHITE);
		lblEstado.setBounds(10, 457, 120, 25);
		RegistroAnimales.getContentPane().add(lblEstado);
		
		JButton btnsalir = new JButton("Volver");
		btnsalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getRegistroAnimales().dispose();
				BDConexion close = BDConexion.getInstances();
				close.dbClose();//Cerrando el proceso de la BD
			}
		});
		btnsalir.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnsalir.setBounds(312, 39, 110, 27);
		RegistroAnimales.getContentPane().add(btnsalir);
	}
	
	public JFrame getRegistroAnimales() {
		return RegistroAnimales;
	}

	public void seRegistroAnimales(JFrame registroAnimales) {
		RegistroAnimales = registroAnimales;
	}
		
}
