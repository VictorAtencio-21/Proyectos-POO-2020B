package zoov2.gui.pack;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.JLayeredPane;
import javax.swing.JTabbedPane;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;

public class VentanaAgregar extends JFrame {

	private JPanel PanelAgregar;
	private JTextField AgAveN;
	private JTextField AgAveR;
	private JTextField AgAveE;
	private JTextField AgAveP;
	private JTextField AgAvePl;
	private JTextField PrNombre;
	private JTextField PrRaza;
	private JTextField PrEdad;
	private JTextField PrPeso;
	private JTextField PrColor;
	private JTextField AgNombreFl;
	private JTextField AgRazaFl;
	private JTextField AgEdadFl;
	private JTextField AgPesoFl;
	private JTextField AgPelajeFl;

	public VentanaAgregar() {
		//No se puede modificar el tamaño
		setResizable(false);
		//Titulo de la ventana
		setTitle("Agregar");
		//Terminar pero no cerrar
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//Tamaño de la ventana
		setBounds(100, 100, 491, 374);
		//Ventana siempre centrada
		setLocationRelativeTo(null);
		//Creacion del panel
		PanelAgregar = new JPanel();
		PanelAgregar.setBackground(Color.DARK_GRAY);
		PanelAgregar.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PanelAgregar);
		PanelAgregar.setLayout(null);
		
		//Boton para regresar
		JButton btnAtrasAgregar = new JButton("<-");
		btnAtrasAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		//Modificacion del boton para regresar
		btnAtrasAgregar.setForeground(Color.DARK_GRAY);
		btnAtrasAgregar.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 12));
		btnAtrasAgregar.setBackground(Color.LIGHT_GRAY);
		btnAtrasAgregar.setBounds(10, 313, 89, 23);
		PanelAgregar.add(btnAtrasAgregar);
		
		//Panel con tabs para cambiar rapidamente
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 460, 291);
		PanelAgregar.add(tabbedPane);
		//Agregando respectivos paneles y sus componentes
		JPanel panelAgrAve = new JPanel();
		panelAgrAve.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("Ave", null, panelAgrAve, null);
		tabbedPane.setForegroundAt(0, Color.WHITE);
		tabbedPane.setBackgroundAt(0, Color.DARK_GRAY);
		//Layout en forma de red para mejor organizacion
		panelAgrAve.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel NombreAve = new JLabel("Nombre");
		NombreAve.setHorizontalAlignment(SwingConstants.CENTER);
		NombreAve.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		panelAgrAve.add(NombreAve);
		//Textfields para el ingreso de datos de aves
		AgAveN = new JTextField();
		panelAgrAve.add(AgAveN);
		AgAveN.setColumns(10);
		
		JLabel RazaAve = new JLabel("Raza");
		RazaAve.setHorizontalAlignment(SwingConstants.CENTER);
		RazaAve.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		panelAgrAve.add(RazaAve);
		
		AgAveR = new JTextField();
		panelAgrAve.add(AgAveR);
		AgAveR.setColumns(10);
		
		JLabel EdadAve = new JLabel("Edad");
		EdadAve.setHorizontalAlignment(SwingConstants.CENTER);
		EdadAve.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		panelAgrAve.add(EdadAve);
		
		AgAveE = new JTextField();
		panelAgrAve.add(AgAveE);
		AgAveE.setColumns(10);
		
		JLabel PesoAve = new JLabel("Peso");
		PesoAve.setHorizontalAlignment(SwingConstants.CENTER);
		PesoAve.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		panelAgrAve.add(PesoAve);
		
		AgAveP = new JTextField();
		panelAgrAve.add(AgAveP);
		AgAveP.setColumns(10);
		
		JLabel PlumajeAve = new JLabel("Plumaje");
		PlumajeAve.setHorizontalAlignment(SwingConstants.CENTER);
		PlumajeAve.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		panelAgrAve.add(PlumajeAve);
		
		AgAvePl = new JTextField();
		panelAgrAve.add(AgAvePl);
		AgAvePl.setColumns(10);
		
		JLabel lblVacio = new JLabel("");
		panelAgrAve.add(lblVacio);
		//Boton para agregar ave
		JButton AgregarAve = new JButton("Agregar");
		AgregarAve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		AgregarAve.setBackground(new Color(135, 206, 235));
		AgregarAve.setFont(new Font("Arial Rounded MT Bold", Font.ITALIC, 10));
		panelAgrAve.add(AgregarAve);
		
		//Panel para agregar primate
		JPanel panelAgrPr = new JPanel();
		panelAgrPr.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("Primate", null, panelAgrPr, null);
		panelAgrPr.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel NombrePr = new JLabel("Nombre");
		NombrePr.setHorizontalAlignment(SwingConstants.CENTER);
		NombrePr.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		panelAgrPr.add(NombrePr);
		
		//Textfields para el ingreso de datos de primates
		PrNombre = new JTextField();
		panelAgrPr.add(PrNombre);
		PrNombre.setColumns(10);
		
		JLabel RazaPr = new JLabel("Raza");
		RazaPr.setHorizontalAlignment(SwingConstants.CENTER);
		RazaPr.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		panelAgrPr.add(RazaPr);
		
		PrRaza = new JTextField();
		panelAgrPr.add(PrRaza);
		PrRaza.setColumns(10);
		
		JLabel EdadPr = new JLabel("Edad");
		EdadPr.setHorizontalAlignment(SwingConstants.CENTER);
		EdadPr.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		panelAgrPr.add(EdadPr);
		
		PrEdad = new JTextField();
		panelAgrPr.add(PrEdad);
		PrEdad.setColumns(10);
		
		JLabel PesoPr = new JLabel("Peso");
		PesoPr.setHorizontalAlignment(SwingConstants.CENTER);
		PesoPr.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		panelAgrPr.add(PesoPr);
		
		PrPeso = new JTextField();
		panelAgrPr.add(PrPeso);
		PrPeso.setColumns(10);
		
		JLabel ColorPr = new JLabel("Color");
		ColorPr.setHorizontalAlignment(SwingConstants.CENTER);
		ColorPr.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		panelAgrPr.add(ColorPr);
		
		PrColor = new JTextField();
		panelAgrPr.add(PrColor);
		PrColor.setColumns(10);
		
		JLabel VacioPr = new JLabel("");
		panelAgrPr.add(VacioPr);
		
		//Boton para agregar primates
		JButton AgregarPrimate = new JButton("Agregar");
		AgregarPrimate.setBackground(new Color(135, 206, 235));
		AgregarPrimate.setFont(new Font("Arial Rounded MT Bold", Font.ITALIC, 10));
		panelAgrPr.add(AgregarPrimate);
		tabbedPane.setForegroundAt(1, Color.WHITE);
		tabbedPane.setBackgroundAt(1, Color.DARK_GRAY);
		
		//Panel para agregar felinos
		JPanel panelAgrFel = new JPanel();
		panelAgrFel.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("Felino", null, panelAgrFel, null);
		panelAgrFel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel NombreFl = new JLabel("Nombre");
		NombreFl.setHorizontalAlignment(SwingConstants.CENTER);
		NombreFl.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		panelAgrFel.add(NombreFl);
		
		//Textfields para el ingreso de datos de felinos
		AgNombreFl = new JTextField();
		panelAgrFel.add(AgNombreFl);
		AgNombreFl.setColumns(10);
		
		JLabel RazaFl = new JLabel("Raza");
		RazaFl.setHorizontalAlignment(SwingConstants.CENTER);
		RazaFl.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		panelAgrFel.add(RazaFl);
		
		AgRazaFl = new JTextField();
		panelAgrFel.add(AgRazaFl);
		AgRazaFl.setColumns(10);
		
		JLabel EdadFl = new JLabel("Edad");
		EdadFl.setHorizontalAlignment(SwingConstants.CENTER);
		EdadFl.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		panelAgrFel.add(EdadFl);
		
		AgEdadFl = new JTextField();
		panelAgrFel.add(AgEdadFl);
		AgEdadFl.setColumns(10);
		
		JLabel PesoFl = new JLabel("Peso");
		PesoFl.setHorizontalAlignment(SwingConstants.CENTER);
		PesoFl.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		panelAgrFel.add(PesoFl);
		
		AgPesoFl = new JTextField();
		panelAgrFel.add(AgPesoFl);
		AgPesoFl.setColumns(10);
		
		JLabel PelajeFl = new JLabel("Pelaje");
		PelajeFl.setHorizontalAlignment(SwingConstants.CENTER);
		PelajeFl.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		panelAgrFel.add(PelajeFl);
		
		AgPelajeFl = new JTextField();
		panelAgrFel.add(AgPelajeFl);
		AgPelajeFl.setColumns(10);
		
		JLabel VacioFelino = new JLabel("");
		panelAgrFel.add(VacioFelino);
		
		//Boton para agregar el felino
		JButton AgregarFelino = new JButton("Agregar");
		AgregarFelino.setBackground(new Color(135, 206, 235));
		AgregarFelino.setFont(new Font("Arial Rounded MT Bold", Font.ITALIC, 10));
		panelAgrFel.add(AgregarFelino);
		tabbedPane.setForegroundAt(2, Color.WHITE);
		tabbedPane.setBackgroundAt(2, Color.DARK_GRAY);
	}
}
