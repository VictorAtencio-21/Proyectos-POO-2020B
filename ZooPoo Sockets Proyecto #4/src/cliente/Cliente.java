package cliente;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

//VICTOR ATENCIO
//CI: 28252900
//PROYECTO #4 Zoo con BD & Sockets

public class Cliente {

	private JFrame frmClienteZoo;
	private JTextField CampoCliente;
	private JTextArea txtCliente;

	
	public static void main(String[] args) {
					Cliente window = new Cliente();
					window.frmClienteZoo.setVisible(true);
	}
	public Cliente() {
		initialize();
	}

	
	private void initialize() {
		frmClienteZoo = new JFrame();
		frmClienteZoo.setTitle("CLIENTE ZOO");
		frmClienteZoo.setResizable(false);
		frmClienteZoo.getContentPane().setBackground(Color.DARK_GRAY);
		frmClienteZoo.getContentPane().setLayout(null);
		frmClienteZoo.setLocationRelativeTo(null);
		
		JTextArea txtCliente = new JTextArea();
		txtCliente.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		txtCliente.setForeground(Color.BLACK);
		txtCliente.setBackground(Color.LIGHT_GRAY);
		txtCliente.setBounds(10, 41, 598, 366);
		frmClienteZoo.getContentPane().add(txtCliente);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setBackground(Color.LIGHT_GRAY);
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//CREACION DEL SOCKET DEL CLIENTE DENTRO DE UN TRY/CATCH
				try {
					Socket cliente = new Socket("localhost",5000);
					
					//Flujos de datos
					DataOutputStream flujo_salidaCl = new DataOutputStream(cliente.getOutputStream());
					flujo_salidaCl.writeUTF(CampoCliente.getText());
					DataInputStream entrada_cliente = new DataInputStream(cliente.getInputStream());
					String consultaCl = entrada_cliente.readUTF();
					txtCliente.append("|"+consultaCl+"|"+"\n");
					CampoCliente.setText(null);
					//Cierre de los flujos
					flujo_salidaCl.close();
					entrada_cliente.close();
				} catch (UnknownHostException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
					System.out.println("No se ha podido conectar");
				}
				
			}
		});
		btnEnviar.setFont(new Font("Arial", Font.PLAIN, 10));
		btnEnviar.setBounds(523, 418, 85, 20);
		frmClienteZoo.getContentPane().add(btnEnviar);
		
		CampoCliente = new JTextField();
		CampoCliente.setBackground(Color.LIGHT_GRAY);
		CampoCliente.setForeground(Color.BLACK);
		CampoCliente.setBounds(122, 418, 391, 20);
		frmClienteZoo.getContentPane().add(CampoCliente);
		CampoCliente.setColumns(10);
		
		JButton btnSalir = new JButton("<-");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmClienteZoo.dispose();
			}
		});
		btnSalir.setForeground(Color.BLACK);
		btnSalir.setBackground(Color.LIGHT_GRAY);
		btnSalir.setBounds(20, 418, 89, 23);
		frmClienteZoo.getContentPane().add(btnSalir);
		
		JLabel lblNewLabel = new JLabel("Por favor utilice los siguientes comandos de acuerdo a lo deseado: -Mostrar, -Mostrarid + id");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 11, 598, 20);
		frmClienteZoo.getContentPane().add(lblNewLabel);
		frmClienteZoo.setBounds(100, 100, 636, 490);
		frmClienteZoo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
