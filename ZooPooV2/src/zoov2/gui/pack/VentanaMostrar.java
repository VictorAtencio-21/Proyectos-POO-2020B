package zoov2.gui.pack;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import javax.swing.JTextArea;
import java.awt.CardLayout;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class VentanaMostrar extends JFrame {

	private JPanel PanelMostrar;
	
	ArrayList <Animal> Aves = new ArrayList<Animal>();
	
	ArrayList <Animal> Primates = new ArrayList<Animal>();
	
	ArrayList <Animal> Felinos = new ArrayList<Animal>();
	
	ArrayList <Animal> Herviboros = new ArrayList <Animal>();
		
	ArrayList <Animal> Carnivoros = new ArrayList <Animal>();

	public VentanaMostrar() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		//Creacion de la ventana mostrar
		setTitle("Mostrar Animales");
		setBounds(100, 100, 480, 451);
		setLocationRelativeTo(null);
		PanelMostrar = new JPanel();
		PanelMostrar.setForeground(Color.DARK_GRAY);
		PanelMostrar.setBackground(Color.DARK_GRAY);
		PanelMostrar.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PanelMostrar);
		PanelMostrar.setLayout(null);
		
		//Respectivos Botones y sus parametros
		JButton btnAtrasMostrar = new JButton("<-");
		btnAtrasMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnAtrasMostrar.setBackground(Color.LIGHT_GRAY);
		btnAtrasMostrar.setForeground(Color.DARK_GRAY);
		btnAtrasMostrar.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 12));
		btnAtrasMostrar.setBounds(20, 379, 81, 23);
		PanelMostrar.add(btnAtrasMostrar);
		
		//Panel para intercambiar entre categorias
		JTabbedPane panelTab = new JTabbedPane(JTabbedPane.LEFT);
		panelTab.setForeground(Color.DARK_GRAY);
		panelTab.setBackground(Color.DARK_GRAY);
		panelTab.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		panelTab.setBounds(10, 11, 446, 357);
		PanelMostrar.add(panelTab);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panelTab.addTab("Aves", null, panel, null);
		panelTab.setForegroundAt(0, Color.WHITE);
		panelTab.setBackgroundAt(0, Color.DARK_GRAY);
		panel.setLayout(null);
		
		JTextArea textAv = new JTextArea();
		textAv.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		textAv.setEditable(false);
		textAv.setForeground(Color.BLACK);
		textAv.setBackground(Color.LIGHT_GRAY);
		textAv.setBounds(0, 0, 364, 352);
		textAv.setText(AgregarAnimalesJTxt(Aves));
		panel.add(textAv);
				
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.DARK_GRAY);
		panelTab.addTab("Primates", null, panel2, null);
		panelTab.setForegroundAt(1, Color.WHITE);
		panelTab.setBackgroundAt(1, Color.DARK_GRAY);
		panel2.setLayout(null);
		
		JTextArea textPr = new JTextArea();
		textPr.setEditable(false);
		textPr.setForeground(Color.BLACK);
		textPr.setBackground(Color.LIGHT_GRAY);
		textPr.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		textPr.setBounds(0, 0, 364, 352);
		textPr.setText(AgregarAnimalesJTxt(Primates));
		panel2.add(textPr);
		
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.DARK_GRAY);
		panelTab.addTab("Felinos", null, panel3, null);
		panelTab.setBackgroundAt(2, Color.DARK_GRAY);
		panelTab.setForegroundAt(2, Color.WHITE);
		panel3.setLayout(null);
		
		JTextArea textFel = new JTextArea();
		textFel.setForeground(Color.BLACK);
		textFel.setBackground(Color.LIGHT_GRAY);
		textFel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		textFel.setEditable(false);
		textFel.setBounds(0, 0, 364, 352);
		textPr.setText(AgregarAnimalesJTxt(Felinos));
		panel3.add(textFel);
		
		JPanel panel4 = new JPanel();
		panel4.setBackground(Color.DARK_GRAY);
		panelTab.addTab("Herviboros", null, panel4, null);
		panelTab.setForegroundAt(3, Color.WHITE);
		panelTab.setBackgroundAt(3, Color.DARK_GRAY);
		panel4.setLayout(null);
		
		JTextArea textHer = new JTextArea();
		textHer.setForeground(Color.BLACK);
		textHer.setBackground(Color.LIGHT_GRAY);
		textHer.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		textHer.setEditable(false);
		textHer.setBounds(0, 0, 364, 352);
		textPr.setText(AgregarAnimalesJTxt(Herviboros));
		panel4.add(textHer);
		
		JPanel panel5 = new JPanel();
		panel5.setBackground(Color.DARK_GRAY);
		panelTab.addTab("Carnivoros", null, panel5, null);
		panelTab.setBackgroundAt(4, Color.DARK_GRAY);
		panelTab.setForegroundAt(4, Color.WHITE);
		panel5.setLayout(null);
		
		JTextArea textCar = new JTextArea();
		textCar.setForeground(Color.BLACK);
		textCar.setBackground(Color.LIGHT_GRAY);
		textCar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		textCar.setEditable(false);
		textPr.setText(AgregarAnimalesJTxt(Carnivoros));
		textCar.setBounds(0, 0, 364, 352);
		panel5.add(textCar);
		
	}
	
	public void AnimalesAntiguos() {
	Aves a1 = new Aves ("Blue","Guacamayo Azul",3,(float) 1.30,", Plumaje: Azul\n");
	Aves a2 = new Aves ("Rafael","Tucan Toco",5,1,", Plumaje: Negro con Blanco\n");
	Aves a3 = new Aves ("Nigel","Cacatua",5,(float) 1.50,", Plumaje: Blanco Grisaceo\n");
	Aves a4 = new Aves ("Nico","Canario Amarillo",2,(float) 0.50,", Plumaje: Amarillo\n");
	Aves a5 = new Aves ("Pedro","Cardenal Cresta Roja",3,(float) 1.60,", Plumaje: Rojo, Blanco y Negro\n");
	
	Felinos l1 = new Felinos ("Simba","Leon Africano",21,(float) 190,", Pelaje: Oro Brillante\n");
	Felinos l2 = new Felinos ("Cheetara","Guepardo",19,(float) 130,", Pelaje: Oro con manchas negras\n");
	Felinos l3 = new Felinos ("Diego","Tigre",20,(float) 200,", Pelaje: Naranja Rayado\n");
	Felinos l4 = new Felinos ("Kenny","Tigre blanco",17,(float) 160,", Pelaje: Blanco Rayado\n");
	Felinos l5 = new Felinos ("Danni","Puma",13,(float) 64,", Pelaje: Beige blanquecino\n");
	
	Primates p1 = new Primates ("Jorge","Chimpance",25,(float) 37,", Color: Marron claro\n");
	Primates p2 = new Primates ("Julien","Lemur",20,(float) 2.2,", Color: Gris anillado\n");
	Primates p3 = new Primates ("Crystal","Mono Capuchino",12,(float) 1.5,", Color: Marron oscuro\n");
	Primates p4 = new Primates ("Kala","Gorila",40,(float) 180,", Color: Negro\n");
	Primates p5 = new Primates ("Kerchak","Gorila espalda plateada",32,(float) 200,", Color: Negro y Gris\n");
	
	Aves.add(a1);
	Aves.add(a2);
	Aves.add(a3);			
	Aves.add(a4);
	Aves.add(a5);
	
	Primates.add(p1);
	Primates.add(p2);
	Primates.add(p3);
	Primates.add(p4);
	Primates.add(p5);
	
	Felinos.add(l1);
	Felinos.add(l2);
	Felinos.add(l3);
	Felinos.add(l4);
	Felinos.add(l5);
	
	Herviboros.add(a1);
	Herviboros.add(a2);
	Herviboros.add(a3);
	Herviboros.add(a4);
	Herviboros.add(a5);
		
	Herviboros.add(p1);
	Herviboros.add(p2);
	Herviboros.add(p3);
	Herviboros.add(p4);
	Herviboros.add(p5);
		
	Carnivoros.add(l1);
	Carnivoros.add(l2);
	Carnivoros.add(l3);
	Carnivoros.add(l4);
	Carnivoros.add(l5);
	}
	
	public String AgregarAnimalesJTxt(ArrayList <Animal> Lista) {
		String ListaMostrar=""; 
		for(int i=0;i<Lista.size();i++) {
			ListaMostrar+=Lista.get(i)+"\n";
			}
		return ListaMostrar;
		}
}