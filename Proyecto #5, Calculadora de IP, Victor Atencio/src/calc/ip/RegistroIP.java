package calc.ip;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Window;

public class RegistroIP {

	private JFrame frmRegistro;
	RegistroBD Regip = RegistroBD.getInstances();
	String Registro="";

	public RegistroIP() {
		RegIP();
	}
	private void RegIP() {
		setFrmRegistro(new JFrame());
		getFrmRegistro().getContentPane().setBackground(Color.LIGHT_GRAY);
		getFrmRegistro().setTitle("REGISTRO");
		getFrmRegistro().setBounds(100, 100, 450, 460);
		getFrmRegistro().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getFrmRegistro().getContentPane().setLayout(null);
		
		JTextArea CampoRegistro = new JTextArea();
		CampoRegistro.setEditable(false);
		CampoRegistro.setBounds(10, 37, 416, 375);
		getFrmRegistro().getContentPane().add(CampoRegistro);
		CampoRegistro.append(Regip.dbStatement("select*from RegistroIP"));
		
		JLabel lblReg = new JLabel("REGISTRO DE LA CALCULADORA");
		lblReg.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblReg.setHorizontalAlignment(SwingConstants.CENTER);
		lblReg.setBounds(10, 11, 416, 26);
		getFrmRegistro().getContentPane().add(lblReg);
	}
	public JFrame getFrmRegistro() {
		return frmRegistro;
	}
	public void setFrmRegistro(JFrame frmRegistro) {
		this.frmRegistro = frmRegistro;
	}
}